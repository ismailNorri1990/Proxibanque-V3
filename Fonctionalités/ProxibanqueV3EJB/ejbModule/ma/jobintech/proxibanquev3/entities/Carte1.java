package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TypeCarteBancaire
 *
 */
@Entity
@DiscriminatorValue("Carte1")

public class Carte1 extends CarteBancaire implements Serializable {
	
	
	private String libelleTypeCarteBancaire;
	private Long codeTypeCarteBancaire;
	private static final long serialVersionUID = 1L;
	
	
	public Carte1() {
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
	public Carte1(String libelleCarteBancaire, Long codeCarteBancaire) {
		super();
		this.libelleTypeCarteBancaire = libelleCarteBancaire;
		this.codeTypeCarteBancaire = codeCarteBancaire;
	}

	
	
	
	
   
}
