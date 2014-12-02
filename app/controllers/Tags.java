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

public class Tags extends Controller {	
	
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
	
	public static Result create(Long favoritoId)	{
		Form<Tag> form = Form.form(Tag.class).bindFromRequest();
		String offset = request().getQueryString("offset");
		String size = request().getQueryString("size");
		
		if(form.hasErrors())	{
			return badRequest(ControllerHelper.errorJson(2, "invalid_tag", form.errorsAsJson()));
		}
		
		List<Favorito> favoritos = Favorito.findAll(Integer.valueOf(offset), Integer.valueOf(size));
		if(favoritos == null)	{
			return notFound();
		}
		
		Tag tagName = form.get();
		
		tagName.setFavoritos(favoritos);
		tagName.save();
		
		return created();
	}
}
