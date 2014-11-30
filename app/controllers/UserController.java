package controllers;

import models.User;
import play.mvc.Controller;
import play.mvc.Results;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.User;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.Form;
import play.i18n.Messages;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Results;

public class UserController extends Controller {
	
	// CREAR USUARIO
	public static Result createUser()	{
		JsonNode Json = request().body().asJson();
		User user = null;
		user.name = Json.get("name").asText();
		user.lastname = Json.get("lastname").asText();
		user.email = Json.get("email").asText();
		
		user.save();
		return created();
	}
}
