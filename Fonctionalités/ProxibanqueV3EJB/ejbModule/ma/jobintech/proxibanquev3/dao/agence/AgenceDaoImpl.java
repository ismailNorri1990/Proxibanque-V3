package ma.jobintech.proxibanquev3.dao.agence;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Agence;
import ma.jobintech.proxibanquev3.entities.Client;

@ApplicationScoped
public class AgenceDaoImpl implements IAgenceDao{

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;
	
	@Override
	public boolean addAgence(Agence agence) {
		entityManager.persist(agence);
		return true;
	}

	@Override
	public boolean deleteAgence(Long id) {
		entityManager.remove(id);
		return true;
	}

	@Override
	public boolean updateAgence(Agence agence) {
		entityManager.merge(agence);
		return true;
	}

	@Override
	public Agence getAgenceById(Long id) {
		return entityManager.find(Agence.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Agence> getAllAgences() {
		Query query = entityManager.createQuery("Select a from Agence a");
		return query.getResultList();
	}

}
