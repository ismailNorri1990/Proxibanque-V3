package ma.jobintech.proxibanquev3.dao.typecompte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeCompte;

public interface ITypeCompteDao {

	boolean addTypeCompte(TypeCompte typeCompte);

	boolean deleteTypeCompte(Long id);

	boolean updateTypeCompte(TypeCompte typeCompte);

	TypeCompte getTypeCompteById(Long id);

	List<TypeCompte> getAllTypeComptes();



}