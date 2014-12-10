// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:683bee9aa1c95d0fa558a2190c53b0e2fb52ed26
// @DATE:Wed Dec 10 19:11:49 CET 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:3
private[this] lazy val controllers_Assets_at0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Assets_at0_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """################################ DOCUMENTACION ##########################################
Obtener pagina principal de la documentacion""", Routes.prefix + """"""))
        

// @LINE:4
private[this] lazy val controllers_Assets_at1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/html/_site/assets.css"))))
private[this] lazy val controllers_Assets_at1_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/html/_site/assets.css"""))
        

// @LINE:5
private[this] lazy val controllers_Assets_at2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("public/html/_site/assets.js"))))
private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """public/html/_site/assets.js"""))
        

// @LINE:9
private[this] lazy val controllers_Usuarios_getUsers3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("pag", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_getUsers3_invoker = createInvoker(
controllers.Usuarios.getUsers(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "getUsers", Seq(classOf[Integer]),"GET", """################################## USUARIOS ###############################################
 Obtener todos los usuarios """, Routes.prefix + """usuarios/$pag<[0-9]*>"""))
        

// @LINE:11
private[this] lazy val controllers_Usuarios_retrieve4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_retrieve4_invoker = createInvoker(
controllers.Usuarios.retrieve(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "retrieve", Seq(classOf[Long]),"GET", """ Obtener un usuario por el id""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:13
private[this] lazy val controllers_Usuarios_getUserByEmail5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("email", """[^/]+""",true))))
private[this] lazy val controllers_Usuarios_getUserByEmail5_invoker = createInvoker(
controllers.Usuarios.getUserByEmail(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "getUserByEmail", Seq(classOf[String]),"GET", """ obtener usuario por el email""", Routes.prefix + """usuario/$email<[^/]+>"""))
        

// @LINE:15
private[this] lazy val controllers_Usuarios_create6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario"))))
private[this] lazy val controllers_Usuarios_create6_invoker = createInvoker(
controllers.Usuarios.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "create", Nil,"POST", """ Crear un usuario""", Routes.prefix + """usuario"""))
        

// @LINE:17
private[this] lazy val controllers_Usuarios_update7_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_update7_invoker = createInvoker(
controllers.Usuarios.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "update", Seq(classOf[Long]),"PUT", """ Actualizar un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:19
private[this] lazy val controllers_Usuarios_delete8_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_delete8_invoker = createInvoker(
controllers.Usuarios.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "delete", Seq(classOf[Long]),"DELETE", """ Eliminar un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:23
private[this] lazy val controllers_Favoritos_getFavoritos9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favoritos"))))
private[this] lazy val controllers_Favoritos_getFavoritos9_invoker = createInvoker(
controllers.Favoritos.getFavoritos(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "getFavoritos", Seq(classOf[Long]),"GET", """################################## FAVORITOS ################################################
 Obtener los favoritos de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favoritos"""))
        

// @LINE:25
private[this] lazy val controllers_Favoritos_create10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favorito"))))
private[this] lazy val controllers_Favoritos_create10_invoker = createInvoker(
controllers.Favoritos.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "create", Seq(classOf[Long]),"POST", """ Crear favorito de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favorito"""))
        

// @LINE:27
private[this] lazy val controllers_Favoritos_delete11_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favorito/"),DynamicPart("fId", """[0-9]*""",false))))
private[this] lazy val controllers_Favoritos_delete11_invoker = createInvoker(
controllers.Favoritos.delete(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "delete", Seq(classOf[Long], classOf[Long]),"DELETE", """ Borrar favorito de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>"""))
        

// @LINE:31
private[this] lazy val controllers_Tags_getTags12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("favorito/"),DynamicPart("fId", """[0-9]*""",false),StaticPart("/tags"))))
private[this] lazy val controllers_Tags_getTags12_invoker = createInvoker(
controllers.Tags.getTags(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "getTags", Seq(classOf[Long]),"GET", """#################################### TAGS ###################################################
 Obtener los tags de un favorito""", Routes.prefix + """favorito/$fId<[0-9]*>/tags"""))
        

// @LINE:33
private[this] lazy val controllers_Tags_create13_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("favorito/"),DynamicPart("fId", """[0-9]*""",false),StaticPart("/tag"))))
private[this] lazy val controllers_Tags_create13_invoker = createInvoker(
controllers.Tags.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "create", Seq(classOf[Long]),"POST", """ Crear un tag a un favorito""", Routes.prefix + """favorito/$fId<[0-9]*>/tag"""))
        

// @LINE:39
private[this] lazy val controllers_Assets_at14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """#################################### ASSETS ###################################################
 Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Assets.at(path:String = "/public", file:String = "html/_site/index.html")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/html/_site/assets.css""","""controllers.Assets.at(path:String = "/public", file:String = "html/_site/assets.css")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """public/html/_site/assets.js""","""controllers.Assets.at(path:String = "/public", file:String = "html/_site/assets.js")"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$pag<[0-9]*>""","""controllers.Usuarios.getUsers(pag:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.retrieve(uId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$email<[^/]+>""","""controllers.Usuarios.getUserByEmail(email:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""","""controllers.Usuarios.create()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.update(uId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.delete(uId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favoritos""","""controllers.Favoritos.getFavoritos(uId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favorito""","""controllers.Favoritos.create(uId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>""","""controllers.Favoritos.delete(uId:Long, fId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """favorito/$fId<[0-9]*>/tags""","""controllers.Tags.getTags(fId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """favorito/$fId<[0-9]*>/tag""","""controllers.Tags.create(fId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:3
case controllers_Assets_at0_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/_site/index.html"))) { (path, file) =>
        controllers_Assets_at0_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:4
case controllers_Assets_at1_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/_site/assets.css"))) { (path, file) =>
        controllers_Assets_at1_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:5
case controllers_Assets_at2_route(params) => {
   call(Param[String]("path", Right("/public")), Param[String]("file", Right("html/_site/assets.js"))) { (path, file) =>
        controllers_Assets_at2_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:9
case controllers_Usuarios_getUsers3_route(params) => {
   call(params.fromPath[Integer]("pag", None)) { (pag) =>
        controllers_Usuarios_getUsers3_invoker.call(controllers.Usuarios.getUsers(pag))
   }
}
        

// @LINE:11
case controllers_Usuarios_retrieve4_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_retrieve4_invoker.call(controllers.Usuarios.retrieve(uId))
   }
}
        

// @LINE:13
case controllers_Usuarios_getUserByEmail5_route(params) => {
   call(params.fromPath[String]("email", None)) { (email) =>
        controllers_Usuarios_getUserByEmail5_invoker.call(controllers.Usuarios.getUserByEmail(email))
   }
}
        

// @LINE:15
case controllers_Usuarios_create6_route(params) => {
   call { 
        controllers_Usuarios_create6_invoker.call(controllers.Usuarios.create())
   }
}
        

// @LINE:17
case controllers_Usuarios_update7_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_update7_invoker.call(controllers.Usuarios.update(uId))
   }
}
        

// @LINE:19
case controllers_Usuarios_delete8_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_delete8_invoker.call(controllers.Usuarios.delete(uId))
   }
}
        

// @LINE:23
case controllers_Favoritos_getFavoritos9_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Favoritos_getFavoritos9_invoker.call(controllers.Favoritos.getFavoritos(uId))
   }
}
        

// @LINE:25
case controllers_Favoritos_create10_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Favoritos_create10_invoker.call(controllers.Favoritos.create(uId))
   }
}
        

// @LINE:27
case controllers_Favoritos_delete11_route(params) => {
   call(params.fromPath[Long]("uId", None), params.fromPath[Long]("fId", None)) { (uId, fId) =>
        controllers_Favoritos_delete11_invoker.call(controllers.Favoritos.delete(uId, fId))
   }
}
        

// @LINE:31
case controllers_Tags_getTags12_route(params) => {
   call(params.fromPath[Long]("fId", None)) { (fId) =>
        controllers_Tags_getTags12_invoker.call(controllers.Tags.getTags(fId))
   }
}
        

// @LINE:33
case controllers_Tags_create13_route(params) => {
   call(params.fromPath[Long]("fId", None)) { (fId) =>
        controllers_Tags_create13_invoker.call(controllers.Tags.create(fId))
   }
}
        

// @LINE:39
case controllers_Assets_at14_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     