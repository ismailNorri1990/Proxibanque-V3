package ma.jobintech.proxibanquev3.dao.compte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Compte;

public interface ICompteDao {

	boolean addCompte(Compte Compte);

	boolean deleteCompte(Long id);

	boolean updateCompte(Compte Compte);

	Compte getCompteById(Long id);

	List<Compte> getAllComptes();

}