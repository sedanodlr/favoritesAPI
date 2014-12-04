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
	public static Result index(Long favoritoId)	{
		
		Favorito favorito = Favorito.finder.byId(favoritoId);
		
		if(favorito == null)	{
			return notFound();
		}
		
		if(ControllerHelper.acceptsJson(request()))	{
			return ok(Json.toJson(favorito.getTags()));
		}
		else	{
			return badRequest(ControllerHelper.errorJson(1, "unsupported_format", null));
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
		//String offset = request().getQueryString("offset");
		//String size = request().getQueryString("size");
		
		if(form.hasErrors())	{
			return badRequest(ControllerHelper.errorJson(2, "invalid_tag", form.errorsAsJson()));
		}
		
		Favorito favorito = Favorito.finder.byId(favoritoId);
		if(favorito == null)	{
			return notFound();
		}
		
		Tag tagName = form.get();
		
		tagName.addFavorito(favorito);
		tagName.save();
		
		return created();
	}
	
	/*public static Result delete(Long userId, Long favoritoId, Long tagId)	{
		Tag tag = Tag.finder.byId(tagId);
		if(tag == null){
			return notFound("Tag no encontrado");
		}
		Favorito favorito = Favorito.finder.byId(favoritoId);
		if(favorito == null){
			return notFound("Favorito no encontrado");
		}
		
		if(!tag.getFavorito(favoritoId))	{
			return badRequest(ControllerHelper.errorJson(2,"invalid_favorite",null));
		}
		
		tag.delete();
	
		return ok();
	}*/
}
