package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import play.data.validation.Constraints.Email;
import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import play.i18n.Messages;

@Entity
public class Usuario extends Model {
	
	@Id 
    Long id;
	
	@Required
	@NotNull
	public String nombre;
	
	@Required
	@NotNull
	public String apellidos;
	
	@Email
	@NotNull
	public String email;
	
	@Required
	@NotNull
	public String password;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	public List<Favorito> favoritos = new ArrayList<Favorito>();
	
	
	public static Finder<Long, Usuario> finder = new Finder<Long, Usuario>(Long.class, Usuario.class);
	
	/*
	 *  User Methods
	 */
	public static List<Usuario> findAll(int offset, int size){
		return finder.setMaxRows(size).setFirstRow(offset).findList();
	}
	
	public static List<Usuario> findByName(String nombre, int size, int offset)	{
		return finder.where().eq("nombre",nombre).setMaxRows(size).setFirstRow(offset).findList();
	}
	
	public static List<Usuario>	findByApellidos(String apellidos, int size, int offset)	{
		return finder.where().eq("apellidos", apellidos).setMaxRows(size).setMaxRows(offset).findList();
	}
	
	public static Usuario findByEmail (String email)	{
		return finder.where().eq("email",email).findUnique();
	}
	
	public String validateUser()	{
		if(this.nombre.length() < 3 || this.apellidos.length() < 3)	{
			return Messages.get("error_nombre_usuario");
		}
		if(finder.where().eq("email",email).findRowCount() != 0)  {
			return Messages.get("error_email_existente");
		}
		return null;
	}  
	
	public static String validatePassword(Usuario usuario) {
		if(usuario == finder.where().eq("id",usuario.id).findUnique())	{
			return null;
		}
		else	{
			return Messages.get("error_password_incorrecto");
		}
	}
	
	public boolean changeData(Usuario newData) {
		boolean changed = false;
		
		if (newData.nombre != null) {
			this.nombre = newData.nombre;
			changed = true;
		}
		
		if (newData.apellidos != null) {
			this.apellidos = newData.apellidos;
			changed = true;
		}
		
		return changed;
	}
	
	/*
	 *  Favorite Methods
	 */
	public void addFavorito(Favorito favorito)	{
		favoritos.add(favorito);
		favorito.setUsuario(this);
	}
	
	public List<Favorito> getFavoritos() {
		return favoritos;
	}
	
	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}
	
	/*
	 *  Id Methods
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/*
	 *  Name Methods 
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
	/*
	 *  Lastname Methods
	 */
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/*
	 *  Email Methods
	 */
	public String getEmail()	{
		return email;
	}
	
	public void setEmail(String email)	{
		this.email = email;
	}
	
	public boolean checkEmailExist()	{
		if(finder.where().eq("email",email).findRowCount() == 0)	
			return true;
		else	
			return false;
	}
	/*
	 * To compare two users object
	 */
	@Override
	public boolean equals(Object obj)	{
		if(obj == this)	{
			return true;
		}
		if(!(obj instanceof Usuario))	{
			return false;
		}
		
		Usuario usuario = (Usuario)obj;
		
		return (usuario.id == this.id);
	}
}
