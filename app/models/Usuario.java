package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Usuario extends Model {
	
	@Id 
    Long id;
	
	@Required
	public String nombre;
	
	@Required
	public String apellidos;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	public List<Favorito> favoritos = new ArrayList<Favorito>();
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="usuario")
	public List<Telefono> telefonos = new ArrayList<Telefono>();	
	
	
	public static Finder<Long, Usuario> finder = new Finder<Long, Usuario>(Long.class, Usuario.class);
	
	/*
	 *  User Methods
	 */
	public static List<Usuario> findAll(int offset, int size){
		return finder.setMaxRows(size).setFirstRow(offset).findList();
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
