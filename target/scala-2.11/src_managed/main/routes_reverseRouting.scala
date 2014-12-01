// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:69fa375be046bd79df5daff4a6e1bf5b266d86f2
// @DATE:Mon Dec 01 10:46:14 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers {

// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseUsuarios {


// @LINE:1
def index(pag:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("pag", pag))
}
                        

// @LINE:5
def delete(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:2
def retrieve(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:3
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario")
}
                        

// @LINE:4
def update(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTelefonos {


// @LINE:8
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefono")
}
                        

// @LINE:9
def delete(uId:Long, tId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefono/" + implicitly[PathBindable[Long]].unbind("tId", tId))
}
                        

// @LINE:7
def index(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/telefonos")
}
                        

}
                          

// @LINE:11
class ReverseAssets {


// @LINE:11
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          
}
                  


// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseUsuarios {


// @LINE:1
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.index",
   """
      function(pag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pag", pag)})
      }
   """
)
                        

// @LINE:5
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.delete",
   """
      function(uId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:2
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieve",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:3
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
      }
   """
)
                        

// @LINE:4
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.update",
   """
      function(uId) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

}
              

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTelefonos {


// @LINE:8
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefono"})
      }
   """
)
                        

// @LINE:9
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.delete",
   """
      function(uId,tId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefono/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("tId", tId)})
      }
   """
)
                        

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Telefonos.index",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/telefonos"})
      }
   """
)
                        

}
              

// @LINE:11
class ReverseAssets {


// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              
}
        


// @LINE:11
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
package controllers.ref {


// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
// @LINE:1
class ReverseUsuarios {


// @LINE:1
def index(pag:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.index(pag), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "index", Seq(classOf[Integer]), "GET", """""", _prefix + """usuarios/$pag<[0-9]*>""")
)
                      

// @LINE:5
def delete(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.delete(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "delete", Seq(classOf[Long]), "DELETE", """""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:2
def retrieve(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieve(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "retrieve", Seq(classOf[Long]), "GET", """""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:3
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "create", Seq(), "POST", """""", _prefix + """usuario""")
)
                      

// @LINE:4
def update(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.update(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "update", Seq(classOf[Long]), "PUT", """""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

}
                          

// @LINE:9
// @LINE:8
// @LINE:7
class ReverseTelefonos {


// @LINE:8
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "create", Seq(classOf[Long]), "POST", """""", _prefix + """usuario/$uId<[0-9]*>/telefono""")
)
                      

// @LINE:9
def delete(uId:Long, tId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.delete(uId, tId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """""", _prefix + """usuario/$uId<[0-9]*>/telefono/$tId<[0-9]*>""")
)
                      

// @LINE:7
def index(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Telefonos.index(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Telefonos", "index", Seq(classOf[Long]), "GET", """""", _prefix + """usuario/$uId<[0-9]*>/telefonos""")
)
                      

}
                          

// @LINE:11
class ReverseAssets {


// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          
}
        
    