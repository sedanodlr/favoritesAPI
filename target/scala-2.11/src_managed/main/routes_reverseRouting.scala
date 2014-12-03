// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:8ee6140d7cd81e8c789893b620a3b0b57c4a4354
// @DATE:Wed Dec 03 18:24:08 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers {

// @LINE:37
class ReverseAssets {


// @LINE:37
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:33
// @LINE:31
// @LINE:29
class ReverseTelefonos {


// @LINE:31
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefono")
}
                        

// @LINE:33
def delete(uId:Long, tId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefono/" + implicitly[PathBindable[Long]].unbind("tId", tId))
}
                        

// @LINE:29
def index(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefonos")
}
                        

}
                          

// @LINE:19
// @LINE:15
class ReverseFavoritos {


// @LINE:19
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favorito")
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
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/tag")
}
                        

// @LINE:23
def index(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/tags")
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
                  


// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:37
class ReverseAssets {


// @LINE:37
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:33
// @LINE:31
// @LINE:29
class ReverseTelefonos {


// @LINE:31
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefono"})
      }
   """
)
                        

// @LINE:33
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.delete",
   """
      function(uId,tId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefono/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tId", tId)})
      }
   """
)
                        

// @LINE:29
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.index",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefonos"})
      }
   """
)
                        

}
              

// @LINE:19
// @LINE:15
class ReverseFavoritos {


// @LINE:19
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favorito"})
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
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/tag"})
      }
   """
)
                        

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.index",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/tags"})
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
        


// @LINE:37
// @LINE:33
// @LINE:31
// @LINE:29
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:15
// @LINE:11
// @LINE:9
// @LINE:7
// @LINE:5
// @LINE:3
package controllers.ref {


// @LINE:37
class ReverseAssets {


// @LINE:37
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:33
// @LINE:31
// @LINE:29
class ReverseTelefonos {


// @LINE:31
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "create", Seq(classOf[Long]), "POST", """ Crear telefono de un usuario""", _prefix + """usuario/$uId<[0-9]*>/telefono""")
)
                      

// @LINE:33
def delete(uId:Long, tId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.delete(uId, tId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """ Borrar un telefono de un usuario""", _prefix + """usuario/$uId<[0-9]*>/telefono/$tId<[0-9]*>""")
)
                      

// @LINE:29
def index(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.index(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "index", Seq(classOf[Long]), "GET", """################################## TELEFONOS ###############################################
 Obtener los telefonos de un usuario""", _prefix + """usuario/$uId<[0-9]*>/telefonos""")
)
                      

}
                          

// @LINE:19
// @LINE:15
class ReverseFavoritos {


// @LINE:19
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "create", Seq(classOf[Long]), "POST", """ Obtener los favoritos de un tag
GET 	/favorito/$favoritoId<[0-9]*>/tags   controllers.Favoritos.tags(favoritoId: Long)
 Crear favorito de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favorito""")
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
   controllers.Tags.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "create", Seq(classOf[Long]), "POST", """ Crear un tag de un favorito""", _prefix + """usuario/$uId<[0-9]*>/tag""")
)
                      

// @LINE:23
def index(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.index(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "index", Seq(classOf[Long]), "GET", """#################################### TAGS ###################################################
 Obtener los tags de un favorito""", _prefix + """usuario/$uId<[0-9]*>/tags""")
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
        
    