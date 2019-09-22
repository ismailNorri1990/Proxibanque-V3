package ma.jobintech.proxibanquev3.metier.conseillerclient;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ma.jobintech.proxibanquev3.dao.conseillerclient.IConseillerClientDao;
import ma.jobintech.proxibanquev3.entities.ConseillerClient;


@Stateless
public class ConseillerClientEJB implements IConseillerClientEJBRemote, IConseillerClientEJBLocal {


	@Inject 
	IConseillerClientDao conseillerClientDao;

	@Override
	public ConseillerClient recupererConseillerClient(String login) {
		return conseillerClientDao.getConseillerClientByLogin(login);
				 
	}
	
   

}
