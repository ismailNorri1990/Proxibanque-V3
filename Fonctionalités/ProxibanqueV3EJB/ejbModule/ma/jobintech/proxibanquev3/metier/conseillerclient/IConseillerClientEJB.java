package ma.jobintech.proxibanquev3.metier.conseillerclient;

import ma.jobintech.proxibanquev3.entities.ConseillerClient;

public interface IConseillerClientEJB  {

	public ConseillerClient recupererConseillerClient(String login);
}
