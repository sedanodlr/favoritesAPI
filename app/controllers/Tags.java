package controllers;

import java.util.List;

import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import helpers.ControllerHelper;
import models.Favorito;
import models.Tag;
import models.Usuario;

/**
 * 
 * @authors Luis Sedano de la Rosa
 * 		    José Manuel Paredes Garcia
 *
 */
public class Tags extends Controller {	
	
	/**
	 * Action method for GET /favorito/<favoriteId>/tags
	 * This method return a JSON with all tags have a favorite.
	 * 
	 * @param Id favorite
	 */
	public static Result getTags(Long favoritoId)	{
		
		Favorito favorito = Favorito.finder.byId(favoritoId);
		
		if(favorito == null)	{
			return notFound(ControllerHelper.errorJson(10, "error_tag_no_encontrado", null));
		}
		
		if(ControllerHelper.acceptsJson(request()))	{
			return ok(Json.toJson(favorito.getTags()));
		}
		else	{
			return badRequest(ControllerHelper.errorJson(1, "error_formato", null));
		}
	}
	
	/**
	 * Action method for POST /favorito/<favoriteId>/tag
	 * This method adds a tag to one favorite and return "created result" 
	 * message if the tag was saved correctly
	 *  
	 * @param Id favorite
	 */
	public static Result create(Long favoritoId)	{
		Form<Tag> form = Form.form(Tag.class).bindFromRequest();
		
		if(form.hasErrors())	{
			return badRequest(ControllerHelper.errorJson(11,"error_tag_no_valido", form.errorsAsJson()));
		}
		
		Favorito favorito = Favorito.finder.byId(favoritoId);
		if(favorito == null)	{
			return notFound(ControllerHelper.errorJson(10, "error_tag_no_encontrado", null));
		}
		
		Tag tagName = form.get();
		
		tagName.addFavorito(favorito);
		tagName.save();
		
		return created();
	}
	
   public static Result delete(Long userId, Long favoritoId, Long tagId)	{
		Tag tag = Tag.finder.byId(tagId);
		if(tag == null){
			return notFound(ControllerHelper.errorJson(10,"error_tag_no_encontrado",null));
		}
		
		Favorito favorito = Favorito.finder.byId(favoritoId);
		if(favorito == null){
			return notFound(ControllerHelper.errorJson(8,"error_favorito_no_encontrado",null));
		}
		
		tag.delete();
	
		return ok();
	}
}
