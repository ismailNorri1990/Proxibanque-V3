package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeCompte implements Serializable {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelleTypeCompte;
	private Long codeTypeCompte;
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(fetch = FetchType.LAZY)
	private Collection<Compte> listeCompte;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public TypeCompte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeCompte(String libelleTypeCompte, Long codeTypeCompte) {
		super();
		this.libelleTypeCompte = libelleTypeCompte;
		this.codeTypeCompte = codeTypeCompte;
	}
}
