package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TypeCarteBancaire
 *
 */
@Entity

public class TypeCarteBancaire implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelleTypeCarteBancaire;
	private Long codeTypeCarteBancaire;
	private static final long serialVersionUID = 1L;

	
	public TypeCarteBancaire() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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
	public TypeCarteBancaire(String libelleCarteBancaire, Long codeCarteBancaire) {
		super();
		this.libelleTypeCarteBancaire = libelleCarteBancaire;
		this.codeTypeCarteBancaire = codeCarteBancaire;
	}
	
	
	
   
}
