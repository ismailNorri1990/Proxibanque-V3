package ma.jobintech.proxibanquev3.dao.typecarte;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Carte1;

@ApplicationScoped
public class TypeCarteBancaireDaoImpl implements ITypeCarteBancaireDao {

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;

	@Override
	public boolean addTypeCarteBancaire(Carte1 typeCarteBancaire) {
		entityManager.persist(typeCarteBancaire);
		return true;
	}

	@Override
	public boolean deleteTypeCarteBancaire(Long id) {
		Carte1 typecartebancaire = getTypeCarteBancaireById(id);
		entityManager.remove(typecartebancaire);
		return true;
	}

	@Override
	public boolean updateTypeCarteBancaire(Carte1 typeCarteBancaire) {
		entityManager.merge(typeCarteBancaire);
		return true;
	}

	@Override
	public Carte1 getTypeCarteBancaireById(Long id) {
		return entityManager.find(Carte1.class, id);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Carte1> getAllTypeCartesBancaires() {
		Query query = entityManager.createQuery("Select tc from TypeCarteBancaire tc");
		return query.getResultList(); 
	}



}
