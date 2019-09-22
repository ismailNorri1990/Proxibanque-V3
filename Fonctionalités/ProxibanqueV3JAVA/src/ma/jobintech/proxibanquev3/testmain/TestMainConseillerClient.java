package ma.jobintech.proxibanquev3.testmain;

import javax.naming.Context;
import javax.naming.InitialContext;

import ma.jobintech.proxibanquev3.entities.ConseillerClient;
import ma.jobintech.proxibanquev3.metier.conseillerclient.IConseillerClientEJBRemote;

public class TestMainConseillerClient {

	public static void main(String[] args) {
		try {
			Context ctx = new InitialContext();
			IConseillerClientEJBRemote proxy = (IConseillerClientEJBRemote) ctx.lookup("ejb:/ProxibanqueV3EJB/ConseillerClientEJB!ma.jobintech.proxibanquev3.metier.conseillerclient.IConseillerClientEJBRemote");

			
			String login = "ismail";
			ConseillerClient c = proxy.recupererConseillerClient(login);
			System.out.println(c.getPassword().toString());
			
			}

catch(

	Exception e)
	{
		e.printStackTrace();
	}
}

}



