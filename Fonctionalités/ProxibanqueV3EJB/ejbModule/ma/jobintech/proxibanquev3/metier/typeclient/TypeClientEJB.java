package ma.jobintech.proxibanquev3.metier.typeclient;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.typeclient.ITypeClientDao;
import ma.jobintech.proxibanquev3.entities.TypeClient;



/**
 * Session Bean implementation class ITypeTypeClientEJB
 */
@Stateless

public class TypeClientEJB implements ITypeClientEJBRemote, ITypeClientEJBLocal{

	@Inject
	ITypeClientDao typeClientDao;

	
	@Override
	public boolean ajouterTypeClient(TypeClient typeClient) {
		typeClientDao.addTypeClient(typeClient);
		return true;
	}

	@Override
	public boolean supprimerTypeClient(Long id) {
		typeClientDao.deleteTypeClient(id);
		return true;
	}

	@Override
	public boolean modifierTypeClient(TypeClient typeClient) {
		typeClientDao.updateTypeClient(typeClient);
		return true;
	}

	@Override
	public TypeClient recupererTypeClient(Long id) {
		return typeClientDao.getTypeClientById(id);
	}

	@Override
	public List<TypeClient> recuperTypeClients() {
		return typeClientDao.getAllTypeClients();
	}


}
