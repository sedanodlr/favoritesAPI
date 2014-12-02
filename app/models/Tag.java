package models;

import java.util.List;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Tag extends Model {	
	
	@Id
	public Long id;
	
	@Required
	public String tagName;
	
	@ManyToMany(mappedBy = "tags")
	@JsonIgnore
	public List<Favorito> favoritos;
	
	public static Finder<Long, Tag> finder = new Finder<Long, Tag>(Long.class, Tag.class);
	
	public Long getId()	{
		return id;
	}
	
	public void setId(Long id)	{
		this.id = id;
	}
	
	public String getTagName()	{
		return tagName;
	}
	
	public void setTagName(String tagName)	{
		this.tagName = tagName;
	}
	
	public List<Favorito> getFavoritos()	{
		return favoritos;
	}
	
	public void setFavoritos(List<Favorito> favoritos)	{
		this.favoritos = favoritos;
	}
}
