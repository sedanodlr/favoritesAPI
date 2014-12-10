package controllers;

import helpers.ControllerHelper;
import models.Favorito;
import models.Usuario;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * 
 * @authors Luis Sedano de la Rosa
 * 		    José Manuel Paredes Garcia
 *
 */
public class Favoritos extends Controller {
	
	/**
	 * Action method for GET /usuario/<UserId>/favoritos
	 * This method return a JSON with all favorites have a user.
	 * @param Id User
	 */
	public static Result getFavoritos(Long userId)	{
		
		Usuario usuario = Usuario.finder.byId(userId);
		if(usuario == null) {
			return notFound(ControllerHelper.errorJson(8,"error_favorito_no_encontrado",null));
		}
		
		if(ControllerHelper.acceptsJson(request()))	{
			return ok(Json.toJson(usuario.getFavoritos()));
		}
		else	{
			return badRequest(ControllerHelper.errorJson(1,"error_formato",null));
		}
	}
	
	/**
	 * Action method for POST /usuario/<UserId>/favorito
	 * This method adds a favorite to one user and return a "created result" message if the favorite 
	 * was saved correctly
	 * @param Id User
	 */
	public static Result create(Long userId)	{
		Form<Favorito> form = Form.form(Favorito.class).bindFromRequest();
		
		if(form.hasErrors())	{
			return badRequest(ControllerHelper.errorJson(9, "error_favorito_no_valido", form.errorsAsJson()));
		}
		
		Usuario usuario = Usuario.finder.byId(userId);
		if(usuario == null)	{
			return notFound(ControllerHelper.errorJson(8, "error_favorito_no_encontrado",null));		
		}
		
		Favorito favorito = form.get();
		if(favorito.validateFavorito() != null)	{
			return badRequest(favorito.validateFavorito());
		}
		
		favorito.setUsuario(usuario);
		favorito.save();
		
		return created();
	}
	
	/**
	 * Action method for DELETE /usuario/<UserId>/favorito/<favoriteId>
	 * This method delete a favorite from one user and return a "ok result" message
	 * if the favorite was deleted correctly 
	 * @param Id User 
	 * @param Id favorite
	 */
	public static Result delete(Long userId, Long favoritoId)	{
		Favorito favorito = Favorito.finder.byId(favoritoId);
		if(favorito == null){
			return notFound(ControllerHelper.errorJson(8, "error_favorito_no_encontrado", null));
		}
		
		if(!favorito.getUsuario().getId().equals(userId))	{
			return badRequest(ControllerHelper.errorJson(11,"error_tag_no_valido",null));
		}
		favorito.delete();
	
		return ok();
	}
}
