package ma.jobintech.proxibanquev3web.ihm;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;

import ma.jobintech.proxibanquev3.entities.Client;
import ma.jobintech.proxibanquev3.metier.client.IClientEJBLocal;

@SessionScoped
public class ListeClientsBean implements Serializable {

	private static final long serialVersionUID = 4279452769150151848L;
	
	@EJB
	IClientEJBLocal iclientEjbLocal;

	public void recuperClients() {
		List<Client> liste = iclientEjbLocal.recuperClients();
	}
	
	
	

}
