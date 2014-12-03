package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Favorito extends Model {

	@Id
	public Long id;
	
	@Required
	public String nombre;
	
	@Required
	public String url;
	
	@ManyToOne
	@JsonIgnore
	public Usuario usuario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	public List<Tag> tags = new ArrayList<Tag>();
	
	public static Finder<Long, Favorito> finder = new Finder<Long, Favorito>(Long.class,Favorito.class);
	
	/*
	 *  User Functions
	 */
	public Usuario getUsuario()	{
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/*
	 *  Tag Functions
	 */
	public void addTag(Tag tag) {
		tags.add(tag);
		
	}
	
	public List<Tag> getTags()	{
		return tags;
	}
	
	public void setTags(List<Tag> tags)	{
		this.tags = tags;
	}
	
	/*
	 *  Id Functions
	 */
	public Long getId()	{
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	/*
	 *  nombre Functions
	 */
	public String getNombre()	{
		return nombre;
	}
	
	public void setNombre(String nombre)	{
		this.nombre = nombre;
	}
	
	/*
	 * URL functions 
	 */
	public String getUrl()	{
		return url;
	}
	
	public void setUrl(String url)	{
		this.url = url;
	}
    
	/*
	 *  Favorite functions
	 */
	public static List<Favorito> findAll(int size,int offset)	{
		return finder.setMaxRows(size).setFirstRow(offset).findList();
	}
	
	public static List<Favorito> findByUserId(Long id,int size, int offset)	{
		return finder.where().eq("usuario_id",id).setMaxRows(size).setFirstRow(offset).findList();
	}
	
	public static List<Favorito> findByNombre(String nombre,int size, int offset)	{
		return finder.where().eq("nombre",nombre).setMaxRows(size).setFirstRow(offset).findList();
	}
	
	public static List<Favorito> findByUrl(String url,int size, int offset)	{
		return finder.where().eq("url",url).setMaxRows(size).setFirstRow(offset).findList();
	}
	
	/*
	@Override
	//Nos ayuda a saber si dos objetos son iguales 
	public boolean equals(Object obj)	{
		if(obj == this)	{
			return true;
		}
		if(!(obj instanceof Usuario))	{
			return false;
		}
		
		Usuario u = (Usuario)obj;
		
		return (u.id == this.id);
	}*/
}

