package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Particulier")
public class Particulier extends Client implements Serializable {
	/**
	 * 
	 */
	
	private String nom;
	private String prenom;
	private String libelleTypeClient;
	private Long codeTypeClient;
	
	private static final long serialVersionUID = 1L;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getLibelleTypeClient() {
		return libelleTypeClient;
	}
	public void setLibelleTypeClient(String libelleTypeClient) {
		this.libelleTypeClient = libelleTypeClient;
	}
	public Long getCodeTypeClient() {
		return codeTypeClient;
	}
	public void setCodeTypeClient(Long codeTypeClient) {
		this.codeTypeClient = codeTypeClient;
	}
	public Particulier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Particulier(String libelleTypeClient, Long codeTypeClient) {
		super();
		this.libelleTypeClient = libelleTypeClient;
		this.codeTypeClient = codeTypeClient;
	}
	
	
}
