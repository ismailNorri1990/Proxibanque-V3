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
	public boolean virement(double montant) {
		
		return false;
	}


}
