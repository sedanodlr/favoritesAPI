// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:7d3dc6056f1411e29cca743f0509826de2db65de
// @DATE:Thu Dec 04 13:44:05 CET 2014


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
private[this] lazy val controllers_Usuarios_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuarios/"),DynamicPart("pag", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_index0_invoker = createInvoker(
controllers.Usuarios.index(fakeValue[Integer]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "index", Seq(classOf[Integer]),"GET", """################################## USUARIOS ###############################################
 Obtener todos los usuarios """, Routes.prefix + """usuarios/$pag<[0-9]*>"""))
        

// @LINE:5
private[this] lazy val controllers_Usuarios_retrieve1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_retrieve1_invoker = createInvoker(
controllers.Usuarios.retrieve(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "retrieve", Seq(classOf[Long]),"GET", """ Obtener un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:7
private[this] lazy val controllers_Usuarios_create2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario"))))
private[this] lazy val controllers_Usuarios_create2_invoker = createInvoker(
controllers.Usuarios.create(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "create", Nil,"POST", """ Crear un usuario""", Routes.prefix + """usuario"""))
        

// @LINE:9
private[this] lazy val controllers_Usuarios_update3_route = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_update3_invoker = createInvoker(
controllers.Usuarios.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "update", Seq(classOf[Long]),"PUT", """ Actualizar un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:11
private[this] lazy val controllers_Usuarios_delete4_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false))))
private[this] lazy val controllers_Usuarios_delete4_invoker = createInvoker(
controllers.Usuarios.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "delete", Seq(classOf[Long]),"DELETE", """ Eliminar un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>"""))
        

// @LINE:15
private[this] lazy val controllers_Favoritos_index5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favoritos"))))
private[this] lazy val controllers_Favoritos_index5_invoker = createInvoker(
controllers.Favoritos.index(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "index", Seq(classOf[Long]),"GET", """################################## FAVORITOS ################################################
 Obtener los favoritos de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favoritos"""))
        

// @LINE:17
private[this] lazy val controllers_Favoritos_create6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favorito"))))
private[this] lazy val controllers_Favoritos_create6_invoker = createInvoker(
controllers.Favoritos.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "create", Seq(classOf[Long]),"POST", """ Crear favorito de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favorito"""))
        

// @LINE:19
private[this] lazy val controllers_Favoritos_delete7_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/favorito/"),DynamicPart("fId", """[0-9]*""",false))))
private[this] lazy val controllers_Favoritos_delete7_invoker = createInvoker(
controllers.Favoritos.delete(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "delete", Seq(classOf[Long], classOf[Long]),"DELETE", """ Borrar favorito de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>"""))
        

// @LINE:23
private[this] lazy val controllers_Tags_index8_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("favorito/"),DynamicPart("fId", """[0-9]*""",false),StaticPart("/tags"))))
private[this] lazy val controllers_Tags_index8_invoker = createInvoker(
controllers.Tags.index(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "index", Seq(classOf[Long]),"GET", """#################################### TAGS ###################################################
 Obtener los tags de un favorito""", Routes.prefix + """favorito/$fId<[0-9]*>/tags"""))
        

// @LINE:25
private[this] lazy val controllers_Tags_create9_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("favorito/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/tag"))))
private[this] lazy val controllers_Tags_create9_invoker = createInvoker(
controllers.Tags.create(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "create", Seq(classOf[Long]),"POST", """ Crear un tag a un favorito""", Routes.prefix + """favorito/$uId<[0-9]*>/tag"""))
        

// @LINE:35
private[this] lazy val controllers_Telefonos_delete10_route = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("usuario/"),DynamicPart("uId", """[0-9]*""",false),StaticPart("/telefono/"),DynamicPart("tId", """[0-9]*""",false))))
private[this] lazy val controllers_Telefonos_delete10_invoker = createInvoker(
controllers.Telefonos.delete(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "delete", Seq(classOf[Long], classOf[Long]),"DELETE", """################################## TELEFONOS ###############################################
 Obtener los telefonos de un usuario
GET     /usuario/$uId<[0-9]*>/telefonos              controllers.Telefonos.index(uId: Long)
 Crear telefono de un usuario
POST    /usuario/$uId<[0-9]*>/telefono               controllers.Telefonos.create(uId: Long)
 Borrar un telefono de un usuario""", Routes.prefix + """usuario/$uId<[0-9]*>/telefono/$tId<[0-9]*>"""))
        

// @LINE:39
private[this] lazy val controllers_Assets_at11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at11_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuarios/$pag<[0-9]*>""","""controllers.Usuarios.index(pag:Integer)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.retrieve(uId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario""","""controllers.Usuarios.create()"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.update(uId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>""","""controllers.Usuarios.delete(uId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favoritos""","""controllers.Favoritos.index(uId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favorito""","""controllers.Favoritos.create(uId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>""","""controllers.Favoritos.delete(uId:Long, fId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """favorito/$fId<[0-9]*>/tags""","""controllers.Tags.index(fId:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """favorito/$uId<[0-9]*>/tag""","""controllers.Tags.create(uId:Long)"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """usuario/$uId<[0-9]*>/telefono/$tId<[0-9]*>""","""controllers.Telefonos.delete(uId:Long, tId:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:3
case controllers_Usuarios_index0_route(params) => {
   call(params.fromPath[Integer]("pag", None)) { (pag) =>
        controllers_Usuarios_index0_invoker.call(controllers.Usuarios.index(pag))
   }
}
        

// @LINE:5
case controllers_Usuarios_retrieve1_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_retrieve1_invoker.call(controllers.Usuarios.retrieve(uId))
   }
}
        

// @LINE:7
case controllers_Usuarios_create2_route(params) => {
   call { 
        controllers_Usuarios_create2_invoker.call(controllers.Usuarios.create())
   }
}
        

// @LINE:9
case controllers_Usuarios_update3_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_update3_invoker.call(controllers.Usuarios.update(uId))
   }
}
        

// @LINE:11
case controllers_Usuarios_delete4_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Usuarios_delete4_invoker.call(controllers.Usuarios.delete(uId))
   }
}
        

// @LINE:15
case controllers_Favoritos_index5_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Favoritos_index5_invoker.call(controllers.Favoritos.index(uId))
   }
}
        

// @LINE:17
case controllers_Favoritos_create6_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Favoritos_create6_invoker.call(controllers.Favoritos.create(uId))
   }
}
        

// @LINE:19
case controllers_Favoritos_delete7_route(params) => {
   call(params.fromPath[Long]("uId", None), params.fromPath[Long]("fId", None)) { (uId, fId) =>
        controllers_Favoritos_delete7_invoker.call(controllers.Favoritos.delete(uId, fId))
   }
}
        

// @LINE:23
case controllers_Tags_index8_route(params) => {
   call(params.fromPath[Long]("fId", None)) { (fId) =>
        controllers_Tags_index8_invoker.call(controllers.Tags.index(fId))
   }
}
        

// @LINE:25
case controllers_Tags_create9_route(params) => {
   call(params.fromPath[Long]("uId", None)) { (uId) =>
        controllers_Tags_create9_invoker.call(controllers.Tags.create(uId))
   }
}
        

// @LINE:35
case controllers_Telefonos_delete10_route(params) => {
   call(params.fromPath[Long]("uId", None), params.fromPath[Long]("tId", None)) { (uId, tId) =>
        controllers_Telefonos_delete10_invoker.call(controllers.Telefonos.delete(uId, tId))
   }
}
        

// @LINE:39
case controllers_Assets_at11_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at11_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     