package ma.jobintech.proxibanquev3.metier.agence;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Agence;

public interface IAgenceEJB {

	public boolean ajouterAgence(Agence agence);

	public boolean supprimerAgence(Long id);

	public boolean modifierAgence(Agence agence);

	public Agence recupererAgenceparId(Long id);

	public List<Agence> recupererAgences();

}