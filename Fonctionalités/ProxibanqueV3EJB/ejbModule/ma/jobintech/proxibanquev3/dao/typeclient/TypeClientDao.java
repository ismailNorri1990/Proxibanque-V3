package ma.jobintech.proxibanquev3.dao.typeclient;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.TypeClient;

@ApplicationScoped
public class TypeClientDao implements ITypeClientDao {
	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;
	
	@Override
	public boolean addTypeClient(TypeClient typeClient) {
		entityManager.persist(typeClient);
		return true;
	}

	@Override
	public boolean deleteTypeClient(Long id) {
		entityManager.remove(id);
		return true;
	}

	@Override
	public boolean updateTypeClient(TypeClient typeClient) {
		entityManager.merge(typeClient);
		return true;
	}

	@Override
	public TypeClient getTypeClientById(Long id) {
		return entityManager.find(TypeClient.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeClient> getAllTypeClients() {
		Query query = entityManager.createQuery("Select tc from TypeClient tc");
		return query.getResultList();
	}

}
