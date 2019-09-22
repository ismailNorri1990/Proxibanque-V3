package ma.jobintech.proxibanquev3.dao.cartebancaire;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.CarteBancaire;
import ma.jobintech.proxibanquev3.entities.TypeClient;



@ApplicationScoped
public class CarteBancaireDaoImpl implements ICarteBancaireDao{

	@PersistenceContext(name = "ProxibanqueV3EJB")
	EntityManager entityManager;
	
	@Override
	public boolean addCarteBancaire(CarteBancaire carteBancaire) {
		entityManager.persist(carteBancaire);
		return true;
	}

	@Override
	public boolean deleteCarteBancaire(Long id) {
		CarteBancaire carteBancaire = getCarteBancaireById(id);
		entityManager.remove(carteBancaire);
		return true;
	}

	@Override
	public boolean updateCarteBancaire(CarteBancaire carteBancaire) {
		entityManager.merge(carteBancaire);
		return true;
	}

	@Override
	public CarteBancaire getCarteBancaireById(Long id) {
		return entityManager.find(CarteBancaire.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CarteBancaire> getAllCarteBancaires() {
		Query query = entityManager.createQuery("Select c from CarteBancaire c");
		return query.getResultList();
	}

}
