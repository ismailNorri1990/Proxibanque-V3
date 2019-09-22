package ma.jobintech.proxibanquev3.metier.client;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Client;

public interface IClientEJB {

	public boolean ajouterClient(Client client);
	public boolean supprimerClient(Long id);
	public boolean modifierClient(Client client);
	public Client recupererClient (Long id);
	public List<Client> recuperClients();
}
