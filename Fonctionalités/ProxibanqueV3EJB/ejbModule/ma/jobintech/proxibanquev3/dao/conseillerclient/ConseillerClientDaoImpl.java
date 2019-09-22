package ma.jobintech.proxibanquev3.dao.conseillerclient;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.ConseillerClient;
@ApplicationScoped
public class ConseillerClientDaoImpl implements IConseillerClientDao {

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;

	@Override
	public ConseillerClient getConseillerClientByLogin(String login) {
		Query query = entityManager.createQuery("Select cc from ConseillerClient cc Where cc.login = :login");
		query.setParameter("login", login);
		return (ConseillerClient) query.getSingleResult();
	}


}
