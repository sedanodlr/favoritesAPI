package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Favorito extends Model {
	
	@Id
	private Long id;
	
	@Required
	private String name;
	
	@Required
	private String url;
	
	@ManyToOne
	private Usuario usuario;
	
	public static Finder<Long, Favorito> finder = new Finder<Long, Favorito>(Long.class,Favorito.class);
	
	public Long getId()	{
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName()	{
		return name;
	}
	
	public void setName(String name)	{
		this.name = name;
	}
	
	public String getUrl()	{
		return url;
	}
	
	public void setUrl(String url)	{
		this.url = url;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}

