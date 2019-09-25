package ma.jobintech.proxibanquev3.metier.typecartebancaire;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Carte1;

public interface ITypeCarteBancaireEJB {

	boolean ajouterTypeCarteBancaire(Carte1 typeCarte);

	boolean supprimerTypeCarteBancaire(Long id);

	boolean modifierTypeCarteBancaire(Carte1 typeCarte);

	Carte1 recupererTypeCarteBancaire(Long id);

	List<Carte1> recuperTypeCartesBancaires();

}