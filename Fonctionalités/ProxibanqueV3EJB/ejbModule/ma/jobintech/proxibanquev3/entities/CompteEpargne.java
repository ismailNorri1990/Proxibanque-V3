package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("CompteEpargne")
public class CompteEpargne extends Compte implements Serializable {
	/**
	 * 
	 */

	private String libelleTypeCompte;
	private Long codeTypeCompte;
	
	private static final long serialVersionUID = 1L;

	public String getLibelleTypeCompte() {
		return libelleTypeCompte;
	}
	public void setLibelleTypeCompte(String libelleTypeCompte) {
		this.libelleTypeCompte = libelleTypeCompte;
	}
	public Long getCodeTypeCompte() {
		return codeTypeCompte;
	}
	public void setCodeTypeCompte(Long codeTypeCompte) {
		this.codeTypeCompte = codeTypeCompte;
	}
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompteEpargne(String libelleTypeCompte, Long codeTypeCompte) {
		super();
		this.libelleTypeCompte = libelleTypeCompte;
		this.codeTypeCompte = codeTypeCompte;
	}
}
