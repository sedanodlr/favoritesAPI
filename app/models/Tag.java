package models;

import java.util.ArrayList;
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
	
	@ManyToMany(mappedBy= "tags")
	@JsonIgnore
	public List<Favorito> favoritos;
	
	public static Finder<Long, Tag> finder = new Finder<Long, Tag>(Long.class, Tag.class);
	
	/*
	 *  Favorite Methods
	 */
	public void addFavorito(Favorito favorito)	{
		favoritos.add(favorito);
	}
	
	public List<Favorito> getFavoritos()	{
		return favoritos;
	}
	
	public Favorito getFavorito(Long favoritoId)	{
		return finder.byId(id).getFavorito(favoritoId);
	}

	/*
	 *  Id Methods
	 */
	public Long getId()	{
		return id;
	}
	
	public void setId(Long id)	{
		this.id = id;
	}
	
	/*
	 *  TagName Methods
	 */
	public String getTagName()	{
		return tagName;
	}
	
	public void setTagName(String tagName)	{
		this.tagName = tagName;
	}
	/*
	 * To compare two tag object
	 */
	@Override
	public boolean equals(Object obj)	{
		if(obj == this)	{
			return true;
		}
		if(!(obj instanceof Tag)){
			return false;
		}
		
		Tag tag = (Tag)obj;
		
		return (tag.id == this.id);
	}
}
