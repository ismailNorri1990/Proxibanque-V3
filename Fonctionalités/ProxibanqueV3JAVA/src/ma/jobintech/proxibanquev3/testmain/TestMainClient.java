package ma.jobintech.proxibanquev3.testmain;

import javax.naming.Context;
import javax.naming.InitialContext;

import ma.jobintech.proxibanquev3.metier.client.IClientEJBRemote;

public class TestMainClient {

	public static void main(String[] args) {

		try {
			Context ctx = new InitialContext();
			IClientEJBRemote proxy = (IClientEJBRemote) ctx.lookup("ejb:/ProxibanqueV3EJB/ClientEJB!ma.jobintech.proxibanquev3.metier.client.IClientEJBRemote");
			
//			Client client = new Client();
//			client.setNom("Ismail");
//			proxy.ajouterClient(client);
			
			
			proxy.supprimerClient(2l);
//			ArrayList<Client> cl = (ArrayList<Client>) proxy.ajouterClient(client);
//
//			for (Client client : cl) {
//				System.out.println(client.getAdresse());
//			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
