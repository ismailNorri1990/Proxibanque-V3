package ma.jobintech.proxibanquev3.dao.client;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Client;

public interface IClientDao {
	public boolean addClient(Client client);
	public boolean deleteClient(Long id);
	public boolean updateClient(Client client);
	public Client getClientById(Long id);
	public List<Client> getAllClients();
}
