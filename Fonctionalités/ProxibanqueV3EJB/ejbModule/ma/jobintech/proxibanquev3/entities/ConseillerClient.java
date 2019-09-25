package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	 @OneToMany(mappedBy = "conseillerClient",cascade = CascadeType.ALL)
	 private List<Client> listeClient = new ArrayList<Client>();
	

	public ConseillerClient(String login, String password, List<Client> listeClient) {
		super();
		this.login = login;
		this.password = password;
		this.listeClient = listeClient;
	}

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

}
