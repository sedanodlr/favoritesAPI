// @SOURCE:C:/Users/Jose/workspace/favorites/conf/routes
// @HASH:683bee9aa1c95d0fa558a2190c53b0e2fb52ed26
// @DATE:Wed Dec 10 19:11:49 CET 2014

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
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:5
// @LINE:4
// @LINE:3
package controllers {

// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
class ReverseUsuarios {


// @LINE:19
def delete(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:11
def retrieve(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:13
def getUserByEmail(email:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[String]].unbind("email", dynamicString(email)))
}
                        

// @LINE:15
def create(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario")
}
                        

// @LINE:17
def update(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("PUT", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId))
}
                        

// @LINE:9
def getUsers(pag:Integer): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuarios/" + implicitly[PathBindable[Integer]].unbind("pag", pag))
}
                        

}
                          

// @LINE:33
// @LINE:31
class ReverseTags {


// @LINE:33
def create(fId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "favorito/" + implicitly[PathBindable[Long]].unbind("fId", fId) + "/tag")
}
                        

// @LINE:31
def getTags(fId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "favorito/" + implicitly[PathBindable[Long]].unbind("fId", fId) + "/tags")
}
                        

}
                          

// @LINE:27
// @LINE:25
// @LINE:23
class ReverseFavoritos {


// @LINE:25
def create(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favorito")
}
                        

// @LINE:27
def delete(uId:Long, fId:Long): Call = {
   import ReverseRouteContext.empty
   Call("DELETE", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favorito/" + implicitly[PathBindable[Long]].unbind("fId", fId))
}
                        

// @LINE:23
def getFavoritos(uId:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "usuario/" + implicitly[PathBindable[Long]].unbind("uId", uId) + "/favoritos")
}
                        

}
                          

// @LINE:39
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseAssets {


// @LINE:39
// @LINE:5
// @LINE:4
// @LINE:3
def at(file:String): Call = {
   (file: @unchecked) match {
// @LINE:3
case (file) if file == "html/_site/index.html" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "html/_site/index.html")))
  Call("GET", _prefix)
                                         
// @LINE:4
case (file) if file == "html/_site/assets.css" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "html/_site/assets.css")))
  Call("GET", _prefix + { _defaultPrefix } + "public/html/_site/assets.css")
                                         
// @LINE:5
case (file) if file == "html/_site/assets.js" =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "html/_site/assets.js")))
  Call("GET", _prefix + { _defaultPrefix } + "public/html/_site/assets.js")
                                         
// @LINE:39
case (file)  =>
  implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
  Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:39
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:5
// @LINE:4
// @LINE:3
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
class ReverseUsuarios {


// @LINE:19
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.delete",
   """
      function(uId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:11
def retrieve : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.retrieve",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:13
def getUserByEmail : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.getUserByEmail",
   """
      function(email) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email))})
      }
   """
)
                        

// @LINE:15
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario"})
      }
   """
)
                        

// @LINE:17
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.update",
   """
      function(uId) {
      return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId)})
      }
   """
)
                        

// @LINE:9
def getUsers : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Usuarios.getUsers",
   """
      function(pag) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuarios/" + (""" + implicitly[PathBindable[Integer]].javascriptUnbind + """)("pag", pag)})
      }
   """
)
                        

}
              

// @LINE:33
// @LINE:31
class ReverseTags {


// @LINE:33
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.create",
   """
      function(fId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fId", fId) + "/tag"})
      }
   """
)
                        

// @LINE:31
def getTags : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Tags.getTags",
   """
      function(fId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fId", fId) + "/tags"})
      }
   """
)
                        

}
              

// @LINE:27
// @LINE:25
// @LINE:23
class ReverseFavoritos {


// @LINE:25
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.create",
   """
      function(uId) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favorito"})
      }
   """
)
                        

// @LINE:27
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.delete",
   """
      function(uId,fId) {
      return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favorito/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("fId", fId)})
      }
   """
)
                        

// @LINE:23
def getFavoritos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Favoritos.getFavoritos",
   """
      function(uId) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("uId", uId) + "/favoritos"})
      }
   """
)
                        

}
              

// @LINE:39
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseAssets {


// @LINE:39
// @LINE:5
// @LINE:4
// @LINE:3
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      if (file == """ + implicitly[JavascriptLitteral[String]].to("html/_site/index.html") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("html/_site/assets.css") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/html/_site/assets.css"})
      }
      if (file == """ + implicitly[JavascriptLitteral[String]].to("html/_site/assets.js") + """) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "public/html/_site/assets.js"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:39
// @LINE:33
// @LINE:31
// @LINE:27
// @LINE:25
// @LINE:23
// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
// @LINE:5
// @LINE:4
// @LINE:3
package controllers.ref {


// @LINE:19
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:11
// @LINE:9
class ReverseUsuarios {


// @LINE:19
def delete(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.delete(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "delete", Seq(classOf[Long]), "DELETE", """ Eliminar un usuario""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:11
def retrieve(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.retrieve(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "retrieve", Seq(classOf[Long]), "GET", """ Obtener un usuario por el id""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:13
def getUserByEmail(email:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.getUserByEmail(email), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "getUserByEmail", Seq(classOf[String]), "GET", """ obtener usuario por el email""", _prefix + """usuario/$email<[^/]+>""")
)
                      

// @LINE:15
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "create", Seq(), "POST", """ Crear un usuario""", _prefix + """usuario""")
)
                      

// @LINE:17
def update(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.update(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "update", Seq(classOf[Long]), "PUT", """ Actualizar un usuario""", _prefix + """usuario/$uId<[0-9]*>""")
)
                      

// @LINE:9
def getUsers(pag:Integer): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Usuarios.getUsers(pag), HandlerDef(this.getClass.getClassLoader, "", "controllers.Usuarios", "getUsers", Seq(classOf[Integer]), "GET", """################################## USUARIOS ###############################################
 Obtener todos los usuarios """, _prefix + """usuarios/$pag<[0-9]*>""")
)
                      

}
                          

// @LINE:33
// @LINE:31
class ReverseTags {


// @LINE:33
def create(fId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.create(fId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "create", Seq(classOf[Long]), "POST", """ Crear un tag a un favorito""", _prefix + """favorito/$fId<[0-9]*>/tag""")
)
                      

// @LINE:31
def getTags(fId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Tags.getTags(fId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Tags", "getTags", Seq(classOf[Long]), "GET", """#################################### TAGS ###################################################
 Obtener los tags de un favorito""", _prefix + """favorito/$fId<[0-9]*>/tags""")
)
                      

}
                          

// @LINE:27
// @LINE:25
// @LINE:23
class ReverseFavoritos {


// @LINE:25
def create(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.create(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "create", Seq(classOf[Long]), "POST", """ Crear favorito de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favorito""")
)
                      

// @LINE:27
def delete(uId:Long, fId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.delete(uId, fId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "delete", Seq(classOf[Long], classOf[Long]), "DELETE", """ Borrar favorito de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favorito/$fId<[0-9]*>""")
)
                      

// @LINE:23
def getFavoritos(uId:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Favoritos.getFavoritos(uId), HandlerDef(this.getClass.getClassLoader, "", "controllers.Favoritos", "getFavoritos", Seq(classOf[Long]), "GET", """################################## FAVORITOS ################################################
 Obtener los favoritos de un usuario""", _prefix + """usuario/$uId<[0-9]*>/favoritos""")
)
                      

}
                          

// @LINE:39
// @LINE:5
// @LINE:4
// @LINE:3
class ReverseAssets {


// @LINE:3
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """################################ DOCUMENTACION ##########################################
Obtener pagina principal de la documentacion""", _prefix + """""")
)
                      

}
                          
}
        
    