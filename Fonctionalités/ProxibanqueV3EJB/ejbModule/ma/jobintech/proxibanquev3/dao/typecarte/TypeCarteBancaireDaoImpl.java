package ma.jobintech.proxibanquev3.dao.typecarte;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.TypeCarteBancaire;

@ApplicationScoped
public class TypeCarteBancaireDaoImpl implements ITypeCarteBancaireDao {

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;

	@Override
	public boolean addTypeCarteBancaire(TypeCarteBancaire typeCarteBancaire) {
		entityManager.persist(typeCarteBancaire);
		return true;
	}

	@Override
	public boolean deleteTypeCarteBancaire(Long id) {
		entityManager.remove(id);
		return true;
	}

	@Override
	public boolean updateTypeCarteBancaire(TypeCarteBancaire typeCarteBancaire) {
		entityManager.merge(typeCarteBancaire);
		return true;
	}

	@Override
	public TypeCarteBancaire getTypeCarteBancaireById(Long id) {
		return entityManager.find(TypeCarteBancaire.class, id);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeCarteBancaire> getAllTypeCartesBancaires() {
		Query query = entityManager.createQuery("Select tc from TypeCarteBancaire tc");
		return query.getResultList(); 
	}



}
