package ma.jobintech.proxibanquev3.dao.typecarte;

import java.util.List;

import ma.jobintech.proxibanquev3.entities.Carte1;


public interface ITypeCarteBancaireDao {
	public boolean addTypeCarteBancaire(Carte1 typeCarteBancaire);
	public boolean deleteTypeCarteBancaire(Long id);
	public boolean updateTypeCarteBancaire(Carte1 typeCarteBancaire);
	public Carte1 getTypeCarteBancaireById(Long id);
	public List<Carte1> getAllTypeCartesBancaires();
}
