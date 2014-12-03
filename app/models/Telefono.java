package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Telefono extends Model {
	
	@Id
	private Long id;
	
	@Required
	private String numero;
	
	@Required
	private Boolean movil;
	
	@ManyToOne
	private Usuario usuario;
	
	
	public static Finder<Long, Telefono> finder = new Finder<Long, Telefono>(Long.class, Telefono.class);
	
	/*
	 *  User functions
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/*
	 *  Id functions
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/*
	 *  Number functions
	 */
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	/*
	 *  Movil functions
	 */
	public Boolean getMovil() {
		return movil;
	}

	public void setMovil(Boolean movil) {
		this.movil = movil;
	}
}
