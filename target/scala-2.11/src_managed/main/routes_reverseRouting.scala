// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:7d3dc6056f1411e29cca743f0509826de2db65de
// @DATE:Thu Dec 04 13:44:05 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:39
// @LINE:35
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers {

// @LINE:39
class ReverseAssets {


// @LINE:39
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:35
class ReverseTelefonos {


// @LINE:35
def delete(uId:Long, tId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefono/" + implicitly[PathBindable[Long]].unbind("tId", tId))
}
                        

}
                          

// @LINE:19
// @LINE:17
// @LINE:15
class ReverseFavoritos {


// @LINE:17
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favorito")
}
                        

// @LINE:19
def delete(uId:Long, fId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favorito/" + implicitly[PathBindable[Long]].unbind("fId", fId))
}
                        

// @LINE:15
def index(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favoritos")
}
                        

}
                          

// @LINE:25
// @LINE:23
class ReverseTags {


// @LINE:25
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "favorito/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/tag")
}
                        

// @LINE:23
def index(fId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "favorito/" + implicitly[PathBindable[Long]].unbind("fId", fId) + "/tags")
}
                        

}
                          

// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseUsuarios {


// @LINE:3
def index(pag:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("pag", pag))
}
                        

// @LINE:11
def delete(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:5
def retrieve(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:7
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario")
}
                        

// @LINE:9
def update(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

}
                          
}
                  


// @LINE:39
// @LINE:35
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:39
class ReverseAssets {


// @LINE:39
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:35
class ReverseTelefonos {


// @LINE:35
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.delete",
   """
      function(uId,tId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefono/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tId", tId)})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:17
// @LINE:15
class ReverseFavoritos {


// @LINE:17
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favorito"})
      }
   """
)
                        

// @LINE:19
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.delete",
   """
      function(uId,fId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fId", fId)})
      }
   """
)
                        

// @LINE:15
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.index",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favoritos"})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:23
class ReverseTags {


// @LINE:25
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/tag"})
      }
   """
)
                        

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.index",
   """
      function(fId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fId", fId) + "/tags"})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseUsuarios {


// @LINE:3
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.index",
   """
      function(pag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pag", pag)})
      }
   """
)
                        

// @LINE:11
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.delete",
   """
      function(uId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:5
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieve",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:7
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
      }
   """
)
                        

// @LINE:9
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.update",
   """
      function(uId) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

}
              
}
        


// @LINE:39
// @LINE:35
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.ref {


// @LINE:39
class ReverseAssets {


// @LINE:39
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:35
class ReverseTelefonos {


// @LINE:35
def delete(uId:Long, tId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.delete(uId, tId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """################################## TELEFONOS ###############################################
 Obtener los telefonos de un usuario
GET     /usuario/$uId<[0-9]*>/telefonos              controllers.Telefonos.index(uId: Long)
 Crear telefono de un usuario
POST    /usuario/$uId<[0-9]*>/telefono               controllers.Telefonos.create(uId: Long)
 Borrar un telefono de un usuario""", _prefix + """usuario/$uId<[0-9]*>/telefono/$tId<[0-9]*>""")
)
                      

}
                          

// @LINE:19
// @LINE:17
// @LINE:15
class ReverseFavoritos {


// @LINE:17
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "create", Seq(classOf[Long]), "POST", """ Crear favorito de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favorito""")
)
                      

// @LINE:19
def delete(uId:Long, fId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.delete(uId, fId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """ Borrar favorito de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>""")
)
                      

// @LINE:15
def index(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.index(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "index", Seq(classOf[Long]), "GET", """################################## FAVORITOS ################################################
 Obtener los favoritos de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favoritos""")
)
                      

}
                          

// @LINE:25
// @LINE:23
class ReverseTags {


// @LINE:25
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "create", Seq(classOf[Long]), "POST", """ Crear un tag a un favorito""", _prefix + """favorito/$uId<[0-9]*>/tag""")
)
                      

// @LINE:23
def index(fId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.index(fId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "index", Seq(classOf[Long]), "GET", """#################################### TAGS ###################################################
 Obtener los tags de un favorito""", _prefix + """favorito/$fId<[0-9]*>/tags""")
)
                      

}
                          

// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
class ReverseUsuarios {


// @LINE:3
def index(pag:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.index(pag), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "index", Seq(classOf[Integer]), "GET", """################################## USUARIOS ###############################################
 Obtener todos los usuarios """, _prefix + """usuarios/$pag<[0-9]*>""")
)
                      

// @LINE:11
def delete(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.delete(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "delete", Seq(classOf[Long]), "DELETE", """ Eliminar un usuario""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:5
def retrieve(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieve(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "retrieve", Seq(classOf[Long]), "GET", """ Obtener un usuario""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:7
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "create", Seq(), "POST", """ Crear un usuario""", _prefix + """usuario""")
)
                      

// @LINE:9
def update(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.update(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "update", Seq(classOf[Long]), "PUT", """ Actualizar un usuario""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

}
                          
}
        
    