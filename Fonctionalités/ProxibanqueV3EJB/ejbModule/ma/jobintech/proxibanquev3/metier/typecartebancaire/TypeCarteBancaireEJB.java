package ma.jobintech.proxibanquev3.metier.typecartebancaire;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.typecarte.ITypeCarteBancaireDao;
import ma.jobintech.proxibanquev3.entities.TypeCarteBancaire;


@Stateless

public class TypeCarteBancaireEJB implements ITypeCarteBancaireEJBRemote, ITypeCarteBancaireEJBLocal{

	@Inject
	ITypeCarteBancaireDao typeCarteBancaireDao;

	
	@Override
	public boolean ajouterTypeCarteBancaire(TypeCarteBancaire typeCarte) {
		typeCarteBancaireDao.addTypeCarteBancaire(typeCarte);
		return true;
	}

	@Override
	public boolean supprimerTypeCarteBancaire(Long id) {
		typeCarteBancaireDao.deleteTypeCarteBancaire(id);
		return true;
	}

	@Override
	public boolean modifierTypeCarteBancaire(TypeCarteBancaire typeCarteBancaire) {
		typeCarteBancaireDao.updateTypeCarteBancaire(typeCarteBancaire);
		return true;
	}

	@Override
	public TypeCarteBancaire recupererTypeCarteBancaire(Long id) {
		return typeCarteBancaireDao.getTypeCarteBancaireById(id);
	}

	@Override
	public List<TypeCarteBancaire> recuperTypeCartesBancaires() {
		return typeCarteBancaireDao.getAllTypeCartesBancaires();
	}


}
