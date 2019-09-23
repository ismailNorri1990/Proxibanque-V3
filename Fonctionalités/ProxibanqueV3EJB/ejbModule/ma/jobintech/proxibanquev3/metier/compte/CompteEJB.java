package ma.jobintech.proxibanquev3.metier.compte;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.compte.ICompteDao;
import ma.jobintech.proxibanquev3.entities.Compte;

/**
 * Session Bean implementation class ICompteEJB
 */
@Stateless

public class CompteEJB implements ICompteEJBRemote, ICompteEJBLocal{

	@Inject
	ICompteDao compteDao;

	
	@Override
	public boolean ajouterCompte(Compte compte) {
		compteDao.addCompte(compte);
		return true;
	}

	@Override
	public boolean supprimerCompte(Long id) {
		compteDao.deleteCompte(id);
		return true;
	}

	@Override
	public boolean modifierCompte(Compte compte) {
		compteDao.updateCompte(compte);
		return true;
	}

	@Override
	public Compte recupererCompte(Long id) {
		return compteDao.getCompteById(id);
	}

	@Override
	public List<Compte> recuperComptes() {
		return compteDao.getAllComptes();
	}
	
	@Override
	public boolean virement(Double montant ,Long comptePay , Long compteRemove) {
		verser(montant, comptePay);
		retirer(montant, compteRemove);
		return true;
	}

	@Override
	public Compte recupCpteParNumCpte(Long numeroCompte) {
		return compteDao.getCompteByNumeroCompte(numeroCompte);
	}

	@Override
	public boolean verser(double montant, long numeroCompte) {
		compteDao.pay(montant, numeroCompte);
		return true;
	}

	@Override
	public boolean retirer(double montant, long numeroCompte) {
		compteDao.remove(montant, numeroCompte);
		return true;
	}


}
