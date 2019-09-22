package ma.jobintech.proxibanquev3.testmain;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import ma.jobintech.proxibanquev3.entities.Client;
import ma.jobintech.proxibanquev3.metier.client.IClientEJBRemote;

public class TestMainClient {

	public static void main(String[] args) {

		try {
			Context ctx = new InitialContext();
			IClientEJBRemote proxy = (IClientEJBRemote) ctx.lookup("ejb:/ProxibanqueV3EJB/ClientEJB!ma.jobintech.proxibanquev3.metier.Client.IClientEJBRemote");
			
			ArrayList<Client> cl = (ArrayList<Client>) proxy.recuperClients();
			
			for (Client client : cl) {
				System.out.println(client.getAdresse());
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
