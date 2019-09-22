package ma.jobintech.proxibanquev3.dao.conseillerclient;

import ma.jobintech.proxibanquev3.entities.ConseillerClient;

public interface IConseillerClientDao {
		ConseillerClient getConseillerClientByLogin(String login);
}
