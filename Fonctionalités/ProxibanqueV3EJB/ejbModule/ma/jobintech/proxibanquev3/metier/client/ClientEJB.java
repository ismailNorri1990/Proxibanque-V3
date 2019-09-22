package ma.jobintech.proxibanquev3.metier.client;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.client.IClientDao;
import ma.jobintech.proxibanquev3.entities.Client;

/**
 * Session Bean implementation class ClientEJB
 */
@Stateless
public class ClientEJB implements IClientEJBRemote, IClientEJBLocal {

	@Inject
	IClientDao clientDao;

	
	@Override
	public boolean ajouterClient(Client client) {
		clientDao.addClient(client);
		return true;
	}

	@Override
	public boolean supprimerClient(Long id) {
		clientDao.deleteClient(id);
		return true;
	}

	@Override
	public boolean modifierClient(Client client) {
		clientDao.updateClient(client);
		return true;
	}

	@Override
	public Client recupererClient(Long id) {
		return clientDao.getClientById(id);
	}

	@Override
	public List<Client> recuperClients() {
		return clientDao.getAllClients();
	}

}
