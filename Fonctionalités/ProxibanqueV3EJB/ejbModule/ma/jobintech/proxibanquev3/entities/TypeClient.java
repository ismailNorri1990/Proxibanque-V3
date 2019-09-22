package ma.jobintech.proxibanquev3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeClient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelleTypeClient;
	private Long codeTypeClient;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public TypeClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeClient(String libelleTypeClient, Long codeTypeClient) {
		super();
		this.libelleTypeClient = libelleTypeClient;
		this.codeTypeClient = codeTypeClient;
	}
	
	
}
