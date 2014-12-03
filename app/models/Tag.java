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
	
	@ManyToOne
	@JsonIgnore
	public Favorito favorito;
	
	public static Finder<Long, Tag> finder = new Finder<Long, Tag>(Long.class, Tag.class);
	
	/*
	 *  Favorite functions
	 */
	public Favorito getFavorito()	{
		return favorito;
	}
	
	public void setFavorito(Favorito favorito)	{
		this.favorito = favorito;
	}
	
	/*
	 *  Id functions
	 */
	public Long getId()	{
		return id;
	}
	
	public void setId(Long id)	{
		this.id = id;
	}
	
	/*
	 *  TagName functions
	 */
	public String getTagName()	{
		return tagName;
	}
	
	public void setTagName(String tagName)	{
		this.tagName = tagName;
	}
}
