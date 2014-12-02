package controllers;

import helpers.ControllerHelper;
import models.Favorito;
import models.Usuario;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class Favoritos extends Controller {
	
	public static Result index(Long userId)	{
		
		Usuario usuario = Usuario.finder.byId(userId);
		if(usuario == null) {
			return notFound();
		}
		
		if(ControllerHelper.acceptsJson(request()))	{
			return ok(Json.toJson(usuario.getFavoritos()));
		}
		else	{
			return badRequest(ControllerHelper.errorJson(1,"unsupported_format",null));
		}
	}
	
	public static Result create(Long userId)	{
		Form<Favorito> form = Form.form(Favorito.class).bindFromRequest();
		
		if(form.hasErrors())	{
			return badRequest(ControllerHelper.errorJson(2, "invalid_favorite", form.errorsAsJson()));
		}
		
		Usuario usuario = Usuario.finder.byId(userId);
		if(usuario == null)	{
			return notFound();		
		}
		
		Favorito favorito = form.get();
		
		favorito.setUsuario(usuario);
		favorito.save();
		
		return created();
	}
	
	public static Result delete(Long userId)	{
		Favorito favorito = Favorito.finder.byId(userId);
		if(favorito == null)	{
			return notFound();
		}
		if(!favorito.getUsuario().getId().equals(userId))	{
			return badRequest(ControllerHelper.errorJson(2, "invalid_user", null));
		}
		favorito.delete();
		
		return ok();
	}
}
