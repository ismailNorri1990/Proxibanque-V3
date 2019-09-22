package ma.jobintech.proxibanquev3.dao.conseillerclient;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ma.jobintech.proxibanquev3.entities.ConseillerClient;
@RequestScoped
public class ConseillerClientDaoImpl implements IConseillerClientDao {

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;

	@Override
	public ConseillerClient getConseillerClientByLogin(String login) {
		return entityManager.find(ConseillerClient.class, login);
	}


}
