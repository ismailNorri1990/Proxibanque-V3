package ma.jobintech.proxibanquev3.dao.typecarte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.TypeCarteBancaire;


public interface ITypeCarteBancaireDao {
	public boolean addTypeCarteBancaire(TypeCarteBancaire typeCarteBancaire);
	public boolean deleteTypeCarteBancaire(Long id);
	public boolean updateTypeCarteBancaire(TypeCarteBancaire typeCarteBancaire);
	public TypeCarteBancaire getTypeCarteBancaireById(Long id);
	public List<TypeCarteBancaire> getAllTypeCartesBancaires();
}
