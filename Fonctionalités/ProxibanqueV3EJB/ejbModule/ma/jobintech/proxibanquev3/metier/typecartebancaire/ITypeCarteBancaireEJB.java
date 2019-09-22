package ma.jobintech.proxibanquev3.metier.typecartebancaire;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeCarteBancaire;

public interface ITypeCarteBancaireEJB {

	boolean ajouterTypeCarteBancaire(TypeCarteBancaire typeCarte);

	boolean supprimerTypeCarteBancaire(Long id);

	boolean modifierTypeCarteBancaire(TypeCarteBancaire typeCarte);

	TypeCarteBancaire recupererTypeCarteBancaire(Long id);

	List<TypeCarteBancaire> recuperTypeCartesBancaires();

}