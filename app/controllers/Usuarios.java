package controllers;

import helpers.ControllerHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.Usuario;
import play.data.Form;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * 
 * @author jm
 */
public class Usuarios extends Controller {
	
	/**
	 * Action method para GET /usuarios/<pag>.
	 * Opcionalmente se puede pasar el parámetro size para indicar el tamaño de página.
	 * Si no se pasa tamaño de página, se usará 10
	 * 
	 * @param pag número de página a recuperar.
	 */
	public static Result index(Integer pag) {
		Result res;
		
		String paginaSize = request().getQueryString("size");
		if (paginaSize == null) {
			paginaSize = "10";
		}

		//List<Usuario> lista = Usuario.findPagina(pag, Integer.valueOf(paginaSize));
		
		
		if (ControllerHelper.acceptsJson(request())) {
			Map<String, Object> result = new HashMap<String, Object>();
			
			List<Usuario> usuarios = Usuario.findAll(pag, Integer.valueOf(paginaSize));
			Integer count = Usuario.finder.findRowCount();
			result.put("Numero de usuarios", count);
			result.put("usuarios", usuarios);
			
			res = ok(Json.toJson(result));
		}
		/*else if (ControllerHelper.acceptsXml(request())) {
			res = ok(views.xml.usuarios.render(lista, count));
		}*/
		else {
			res = badRequest(ControllerHelper.errorJson(1, "unsupported_format", null));
		}
			
		return res; 
	}
	
	
	/**
	 * Action method para GET /usuario/<uId>
	 * 
	 * @param uId identificador del usuario
	 */
	public static Result retrieve(Long uId) {
		Result res;
		
		Usuario usuario = Usuario.finder.byId(uId);
		if (usuario == null) {
			res = notFound();
		}
		else {
			if (ControllerHelper.acceptsJson(request())) {
				res = ok(Json.toJson(usuario));
			}
			/*else if (ControllerHelper.acceptsXml(request())) {
				res = ok(views.xml._usuario.render(usuario));
			}*/
			else {
				res = badRequest(ControllerHelper.errorJson(1, "unsupported_format", null));
			}
		}
		
		return res;
	}
	
	/**
	 * Action method para POST /usuario/<uId>.
	 * Se deben pasar los atributos del usuario en el body de la petición. 
	 */
	public static Result create() {
		Form<Usuario> form = Form.form(Usuario.class).bindFromRequest();

		if (form.hasErrors()) {
			return badRequest(ControllerHelper.errorJson(2, "invalid_user", form.errorsAsJson()));
		}

		Usuario usuario = form.get();
		
		usuario.save();
		
		// Esto implementa una característica de hypermedia: devolvemos la URL para consultar
		// los detalles del usuario
		response().setHeader(LOCATION, routes.Usuarios.retrieve(usuario.getId()).absoluteURL(request()));

		return created(Json.toJson(usuario));
	}

	/**
	 * Action method para PUT /usuario/<uId>
	 * Se deben pasar los atributos a modificar en el body de la petición. 
	 * 
	 * @param uId identificador del usuario a modificar
	 */
	public static Result update(Long uId) {
		Usuario usuario = Usuario.finder.byId(uId);
		if (usuario == null) {
			return notFound();
		}
		
		Form<Usuario> form = Form.form(Usuario.class).bindFromRequest();

		if (form.hasErrors()) {
			return badRequest(ControllerHelper.errorJson(1, "invalid_user", form.errorsAsJson()));
		}

		Result res;

		if (usuario.changeData(form.get())) {
			usuario.save();
			res = ok();
		}
		else {
			res = status(NOT_MODIFIED);
		}
		
		return res;
	}
	
	/**
	 * Action method para DELETE /usuario/<uId>
	 * 
	 * @param uId identificador del usuario a borrar
	 */
	public static Result delete(Long uId) {
		Usuario usuario = Usuario.finder.byId(uId);
		if (usuario == null) {
			return notFound();
		}

		usuario.delete();

		return ok();
	}
}
