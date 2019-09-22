package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity

public class CarteBancaire implements Serializable {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codeCarteBancaire;
	private boolean active;
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	private Compte compte;
	
	@ManyToOne
	private TypeCarteBancaire typeCarteBancaire;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getCodeCarteBancaire() {
		return codeCarteBancaire;
	}

	public void setCodeCarteBancaire(Long codeCarteBancaire) {
		this.codeCarteBancaire = codeCarteBancaire;

	}

	public CarteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarteBancaire(boolean active) {
		super();
		this.active = active;
	}

	public CarteBancaire(Long codeCarteBancaire, boolean active, Compte compte, TypeCarteBancaire typeCarteBancaire) {
		super();
		this.codeCarteBancaire = codeCarteBancaire;
		this.active = active;
		this.compte = compte;
		this.typeCarteBancaire = typeCarteBancaire;
	}
	
	

}
