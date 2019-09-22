package ma.jobintech.proxibanquev3.dao.typecompte;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Client;
import ma.jobintech.proxibanquev3.entities.TypeCompte;

@ApplicationScoped

public class TypeCompteDao implements ITypeCompteDao {
	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;
	
	@Override
	public boolean addTypeCompte(TypeCompte typeCompte) {
		entityManager.persist(typeCompte);
		return true;
	}

	@Override
	public boolean deleteTypeCompte(Long id) {
		TypeCompte typecompte = getTypeCompteById(id);
		entityManager.remove(typecompte);
		return true;
	}

	@Override
	public boolean updateTypeCompte(TypeCompte typeCompte) {
		entityManager.merge(typeCompte);
		return true;
	}

	@Override
	public TypeCompte getTypeCompteById(Long id) {
		return entityManager.find(TypeCompte.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeCompte> getAllTypeComptes() {
		Query query = entityManager.createQuery("Select tc from TypeCompte tc");
		return query.getResultList();
	}

}
