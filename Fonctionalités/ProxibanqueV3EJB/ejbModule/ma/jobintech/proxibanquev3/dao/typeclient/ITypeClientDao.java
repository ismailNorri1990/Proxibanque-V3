package ma.jobintech.proxibanquev3.dao.typeclient;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeClient;

public interface ITypeClientDao {

	boolean addTypeClient(TypeClient typeClient);

	boolean deleteTypeClient(Long id);

	boolean updateTypeClient(TypeClient typeClient);

	TypeClient getTypeClientById(Long id);

	List<TypeClient> getAllTypeClients();



}