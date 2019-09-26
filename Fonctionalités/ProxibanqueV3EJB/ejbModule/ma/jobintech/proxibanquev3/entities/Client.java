package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Client")
public class Client implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODE")
	private long id;
	private Long telephone;
	private String adresse;
	private int code_postal;
	private String ville;
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "CLIENT_ID")
	private ConseillerClient conseillerClient;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
	private List<Compte> compte = new ArrayList<Compte>();

	public Client(Long telephone, String adresse, int code_postal, String ville, ConseillerClient conseillerClient,
			List<Compte> compte) {
		super();
		this.telephone = telephone;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.conseillerClient = conseillerClient;
		this.compte = compte;
	}

	public ConseillerClient getConseillerClient() {
		return conseillerClient;
	}

	public void setConseillerClient(ConseillerClient conseillerClient) {
		this.conseillerClient = conseillerClient;
	}

	public List<Compte> getCompte() {
		return compte;
	}

	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCode_postal() {
		return this.code_postal;
	}

	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Client() {
		super();
	}

	public Client(Long telephone, String adresse, int code_postal, String ville) {
		super();

		this.telephone = telephone;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
	}

}
