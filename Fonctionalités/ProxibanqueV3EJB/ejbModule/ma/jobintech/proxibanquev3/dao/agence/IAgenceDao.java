package ma.jobintech.proxibanquev3.dao.agence;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Agence;

public interface IAgenceDao {
		public boolean addAgence(Agence agence);
		public boolean deleteAgence(Long id);
		public boolean updateAgence(Agence agence);
		public Agence getAgenceById(Long id);
		public List<Agence> getAllAgences();

}
