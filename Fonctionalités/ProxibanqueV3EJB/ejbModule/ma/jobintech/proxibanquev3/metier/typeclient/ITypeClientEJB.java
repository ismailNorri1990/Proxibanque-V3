package ma.jobintech.proxibanquev3.metier.typeclient;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeClient;

public interface ITypeClientEJB {

	boolean ajouterTypeClient(TypeClient typeClient);

	boolean supprimerTypeClient(Long id);

	boolean modifierTypeClient(TypeClient typeClient);

	TypeClient recupererTypeClient(Long id);

	List<TypeClient> recuperTypeClients();

}