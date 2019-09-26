package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Entreprise")
public class Entreprise extends Client implements Serializable {
	/**
	 * 
	 */
	
	private String raison_social;
	private String libelleTypeClient;
	private Long codeTypeClient;
	
	private static final long serialVersionUID = 1L;

	
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
	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entreprise(String libelleTypeClient, Long codeTypeClient) {
		super();
		this.libelleTypeClient = libelleTypeClient;
		this.codeTypeClient = codeTypeClient;
	}
	public String getRaison_social() {
		return raison_social;
	}
	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
	}
	
	
}
