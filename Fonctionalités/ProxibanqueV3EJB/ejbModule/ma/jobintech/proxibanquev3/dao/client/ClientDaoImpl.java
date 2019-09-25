package ma.jobintech.proxibanquev3.dao.client;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Client;

@ApplicationScoped
public class ClientDaoImpl implements IClientDao {

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;
	
	@Override
	public boolean addClient(Client client) {
		entityManager.persist(client);
		return true;
	}

	@Override
	public boolean deleteClient(Long id) {
		Client client = getClientById(id);
		entityManager.remove(client);
		return true;
	}

	@Override
	public boolean updateClient(Client client) {
		entityManager.merge(client);
		return true;
	}

	@Override
	public Client getClientById(Long id) {
		return entityManager.find(Client.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> getAllClients() {
		Query query = entityManager.createQuery("Select c from Client c");
		return query.getResultList();
	}

}
