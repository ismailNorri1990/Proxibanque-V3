package ma.jobintech.proxibanquev3.metier.typecompte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeCompte;

public interface ITypeCompteEJB {

	boolean ajouterTypeCompte(TypeCompte typeCompte);

	boolean supprimerTypeCompte(Long id);

	boolean modifierTypeCompte(TypeCompte typeCompte);

	TypeCompte recupererTypeCompte(Long id);

	List<TypeCompte> recuperTypeComptes();

}