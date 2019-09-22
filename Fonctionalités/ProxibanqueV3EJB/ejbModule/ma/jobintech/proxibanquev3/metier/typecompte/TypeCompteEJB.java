package ma.jobintech.proxibanquev3.metier.typecompte;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.typecompte.ITypeCompteDao;
import ma.jobintech.proxibanquev3.entities.TypeCompte;

@Stateless
public class TypeCompteEJB implements ITypeCompteEJBRemote, ITypeCompteEJBLocal {

	@Inject
	ITypeCompteDao typeCompteDao;

	@Override
	public boolean ajouterTypeCompte(TypeCompte typeCompte) {
		typeCompteDao.addTypeCompte(typeCompte);
		return true;
	}

	@Override
	public boolean supprimerTypeCompte(Long id) {
		typeCompteDao.deleteTypeCompte(id);
		return true;
	}

	@Override
	public boolean modifierTypeCompte(TypeCompte typeCompte) {
		typeCompteDao.updateTypeCompte(typeCompte);
		return true;
	}

	@Override
	public TypeCompte recupererTypeCompte(Long id) {
		return typeCompteDao.getTypeCompteById(id);
	}

	@Override
	public List<TypeCompte> recuperTypeComptes() {
		return typeCompteDao.getAllTypeComptes();
	}

}
