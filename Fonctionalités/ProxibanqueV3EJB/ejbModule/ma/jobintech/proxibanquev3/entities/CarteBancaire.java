package ma.jobintech.proxibanquev3.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 @Entity
public class CarteBancaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long codeCarteBancaire;
	private boolean active;

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
