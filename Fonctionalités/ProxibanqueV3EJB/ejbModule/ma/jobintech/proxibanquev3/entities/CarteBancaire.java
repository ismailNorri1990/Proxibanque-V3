package ma.jobintech.proxibanquev3.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Type_Carte")
public class CarteBancaire implements Serializable {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codeCarteBancaire;
	private boolean active;
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name="COMPTE")
	private Compte compte;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getCodeCarteBancaire() {
		return codeCarteBancaire;
	}

	public void setCodeCarteBancaire(Long codeCarteBancaire) {
		this.codeCarteBancaire = codeCarteBancaire;

	}

	public CarteBancaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CarteBancaire(boolean active) {
		super();
		this.active = active;
	}

	
	

}
