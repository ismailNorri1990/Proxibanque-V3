package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Client
 *
 */
@Entity
@Table(name = "CLIENTS")
public class Client implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODE")
	private Long id;
	private String nom;
	private String prenom;
	private String raison_social;
	private Long telephone;
	private String adresse;
	private int code_postal;
	private String ville;
	private static final long serialVersionUID = 1L;

	@OneToOne
	private ConseillerClient client;
	
	@OneToOne
	private TypeClient typeClient;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval=true)
	private Collection<Compte> compte;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}   
	public String getRaison_social() {
		return this.raison_social;
	}

	public void setRaison_social(String raison_social) {
		this.raison_social = raison_social;
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
		
	public Client(String nom, String prenom, String raison_social, Long telephone, String adresse, int code_postal,
			String ville) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.raison_social = raison_social;
		this.telephone = telephone;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
	}

	public Client(String nom, String prenom, String raison_social, Long telephone, String adresse, int code_postal,
			String ville, Agence agence, TypeClient typeClient, Collection<Compte> compte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.raison_social = raison_social;
		this.telephone = telephone;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.ville = ville;
		this.typeClient = typeClient;
		this.compte = compte;
	}


	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", raison_social=" + raison_social + ", telephone="
				+ telephone + ", adresse=" + adresse + ", code_postal=" + code_postal + ", ville=" + ville + ", client="
				+ client + ", typeClient=" + typeClient + ", compte=" + compte + "]";
	}
	
	
   
}
