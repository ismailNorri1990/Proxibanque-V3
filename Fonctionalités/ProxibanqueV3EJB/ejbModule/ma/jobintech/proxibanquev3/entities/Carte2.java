package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: TypeCarteBancaire
 *
 */
@Entity
@DiscriminatorValue("Carte2")

public class Carte2 extends CarteBancaire implements Serializable {
	
	
	private String libelleTypeCarteBancaire;
	private Long codeTypeCarteBancaire;
	private static final long serialVersionUID = 1L;
	
	
	public Carte2() {
		super();
	}   
	
	public String getLibelleCarteBancaire() {
		return this.libelleTypeCarteBancaire;
	}

	public void setLibelleCarteBancaire(String libelleCarteBancaire) {
		this.libelleTypeCarteBancaire = libelleCarteBancaire;
	}   
	public Long getCodeCarteBancaire() {
		return this.codeTypeCarteBancaire;
	}

	public void setCodeCarteBancaire(Long codeCarteBancaire) {
		this.codeTypeCarteBancaire = codeCarteBancaire;
	}
	public Carte2(String libelleCarteBancaire, Long codeCarteBancaire) {
		super();
		this.libelleTypeCarteBancaire = libelleCarteBancaire;
		this.codeTypeCarteBancaire = codeCarteBancaire;
	}

	
	
	
	
   
}
