package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Comptes")
public class Compte implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double solde;
	private Long numeroDeCompte;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date dateDeCreation;
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
    private Client client ;
	
	@OneToOne
	private TypeCompte typeCompte;
	
	@OneToMany
	private Collection<CarteBancaire> listeCarte;

	public Compte() {
		super();
	}   
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public Double getSolde() {
		return this.solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}   
	public Long getNumeroDeCompte() {
		return this.numeroDeCompte;
	}

	public void setNumeroDeCompte(Long numeroDeCompte) {
		this.numeroDeCompte = numeroDeCompte;
	}   
	public Date getDateDeCreation() {
		return this.dateDeCreation;
	}

	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	
	public Compte(Double solde, Long numeroDeCompte, Date dateDeCreation) {
		super();
		this.solde = solde;
		this.numeroDeCompte = numeroDeCompte;
		this.dateDeCreation = dateDeCreation;
	}
	public Compte(Double solde, Long numeroDeCompte, Date dateDeCreation, Client client, TypeCompte typeCompte,
			Collection<CarteBancaire> listeCarte) {
		super();
		this.solde = solde;
		this.numeroDeCompte = numeroDeCompte;
		this.dateDeCreation = dateDeCreation;
		this.client = client;
		this.typeCompte = typeCompte;
		this.listeCarte = listeCarte;
	}
	
	
   
}
