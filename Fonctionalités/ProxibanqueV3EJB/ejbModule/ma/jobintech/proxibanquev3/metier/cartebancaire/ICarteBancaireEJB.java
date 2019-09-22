package ma.jobintech.proxibanquev3.metier.cartebancaire;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.CarteBancaire;

public interface ICarteBancaireEJB {

	public boolean ajouterCarteBancaire(CarteBancaire carteBancaire);
	public boolean supprimerCarteBancaire(Long id);
	public boolean modifierCarteBancaire(CarteBancaire carteBancaire);
	public CarteBancaire recupererCarteBancaire (Long id);
	public List<CarteBancaire> recuperCarteBancaires();
}
