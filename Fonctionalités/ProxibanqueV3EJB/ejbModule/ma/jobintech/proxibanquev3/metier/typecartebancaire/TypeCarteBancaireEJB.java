package ma.jobintech.proxibanquev3.metier.typecartebancaire;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.typecarte.ITypeCarteBancaireDao;
import ma.jobintech.proxibanquev3.entities.Carte1;


@Stateless

public class TypeCarteBancaireEJB implements ITypeCarteBancaireEJBRemote, ITypeCarteBancaireEJBLocal{

	@Inject
	ITypeCarteBancaireDao typeCarteBancaireDao;

	
	@Override
	public boolean ajouterTypeCarteBancaire(Carte1 typeCarte) {
		typeCarteBancaireDao.addTypeCarteBancaire(typeCarte);
		return true;
	}

	@Override
	public boolean supprimerTypeCarteBancaire(Long id) {
		typeCarteBancaireDao.deleteTypeCarteBancaire(id);
		return true;
	}

	@Override
	public boolean modifierTypeCarteBancaire(Carte1 typeCarteBancaire) {
		typeCarteBancaireDao.updateTypeCarteBancaire(typeCarteBancaire);
		return true;
	}

	@Override
	public Carte1 recupererTypeCarteBancaire(Long id) {
		return typeCarteBancaireDao.getTypeCarteBancaireById(id);
	}

	@Override
	public List<Carte1> recuperTypeCartesBancaires() {
		return typeCarteBancaireDao.getAllTypeCartesBancaires();
	}


}
