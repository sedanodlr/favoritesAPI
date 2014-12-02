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
	
	public static List<Usuario> findPagina(Integer pagina, Integer size) {
		return finder.orderBy("id").setMaxRows(size).setFirstRow(pagina*size).findList();
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
	
	public void addTelefono(Telefono telefono) {
		telefonos.add(telefono);
		telefono.setUsuario(this);
	}
	
	public void addFavorito(Favorito favorito)	{
		favoritos.add(favorito);
		favorito.setUsuario(this);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public List<Favorito> getFavoritos() {
		return favoritos;
	}
	
	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}
}
