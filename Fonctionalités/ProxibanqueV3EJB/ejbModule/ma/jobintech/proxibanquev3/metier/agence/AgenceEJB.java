package ma.jobintech.proxibanquev3.metier.agence;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.agence.IAgenceDao;
import ma.jobintech.proxibanquev3.entities.Agence;

/**
 * Session Bean implementation class IAgenceEJB
 */
@Stateless
public class AgenceEJB implements IAgenceEJBRemote, IAgenceEJBLocal{

	@Inject
	IAgenceDao agenceDao;
	

	@Override
	public boolean ajouterAgence(Agence agence) {
		agenceDao.addAgence(agence);
		return true;
	}

	@Override
	public boolean supprimerAgence(Long id) {
		agenceDao.deleteAgence(id);
		return true;
	}

	@Override
	public boolean modifierAgence(Agence agence) {
		agenceDao.updateAgence(agence);
		return true;
	}

	@Override
	public Agence recupererAgenceparId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Agence> recupererAgences() {
		return agenceDao.getAllAgences();
	}

  
}
