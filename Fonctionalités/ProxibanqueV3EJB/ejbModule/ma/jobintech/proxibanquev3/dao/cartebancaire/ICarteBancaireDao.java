package ma.jobintech.proxibanquev3.dao.cartebancaire;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.CarteBancaire;

public interface ICarteBancaireDao {

	boolean addCarteBancaire(CarteBancaire carteBancaire);

	boolean deleteCarteBancaire(Long id);

	boolean updateCarteBancaire(CarteBancaire carteBancaire);

	CarteBancaire getCarteBancaireById(Long id);

	List<CarteBancaire> getAllCarteBancaires();

}