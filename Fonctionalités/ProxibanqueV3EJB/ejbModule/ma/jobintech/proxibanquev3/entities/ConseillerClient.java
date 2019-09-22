package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: ConseillerClient
 *
 */
@Entity
@Table(name = "CONSEILLERS_CLIENTS")
public class ConseillerClient implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conseillerClient;
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private Agence agence;
	
	public Long getId_conseillerClient() {
		return this.id_conseillerClient;
	}

	public void setId_conseillerClient(Long id_conseillerClient) {
		this.id_conseillerClient = id_conseillerClient;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public ConseillerClient() {
		super();
	}

	public ConseillerClient(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public ConseillerClient(String login, String password, Agence agence) {
		super();
		this.login = login;
		this.password = password;
		this.agence = agence;
	}

}
