package ma.jobintech.proxibanquev3.metier.cartebancaire;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.cartebancaire.ICarteBancaireDao;
import ma.jobintech.proxibanquev3.entities.CarteBancaire;

/**
 * Session Bean implementation class CarteBancaireEJB
 */
@Stateless
public class CarteBancaireEJB implements ICarteBancaireEJBRemote, ICarteBancaireEJBLocal {

	@Inject
	ICarteBancaireDao carteBancaireDao;

	
	@Override
	public boolean ajouterCarteBancaire(CarteBancaire carteBancaire) {
		carteBancaireDao.addCarteBancaire(carteBancaire);
		return true;
	}

	@Override
	public boolean supprimerCarteBancaire(Long id) {
		carteBancaireDao.deleteCarteBancaire(id);
		return true;
	}

	@Override
	public boolean modifierCarteBancaire(CarteBancaire carteBancaire) {
		carteBancaireDao.updateCarteBancaire(carteBancaire);
		return true;
	}

	@Override
	public CarteBancaire recupererCarteBancaire(Long id) {
		return carteBancaireDao.getCarteBancaireById(id);
	}

	@Override
	public List<CarteBancaire> recuperCarteBancaires() {
		return carteBancaireDao.getAllCarteBancaires();
	}

}
