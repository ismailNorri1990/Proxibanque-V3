package ma.jobintech.proxibanquev3.dao.compte;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Compte;

@ApplicationScoped
public class CompteDaoImpl implements ICompteDao {
	
		@PersistenceContext(name = "ProxibanqueV3EJB")
		EntityManager entityManager;
		
		@Override
		public boolean addCompte(Compte Compte) {
			entityManager.persist(Compte);
			return true;
		}

		@Override
		public boolean deleteCompte(Long id) {
			Compte compte = getCompteById(id);
			entityManager.remove(compte);
			return true;
		}

		@Override
		public boolean updateCompte(Compte Compte) {
			entityManager.merge(Compte);
			return true;
		}

		@Override
		public Compte getCompteById(Long id) {
			return entityManager.find(Compte.class, id);
		}
		
		@Override
		public Compte getCompteByNumeroCompte(Long numeroCompte) {
			Query query = entityManager.createQuery("Select cpte from Compte cpte where cpte.numeroDeCompte = :numeroCompte");
			return (Compte) query.getSingleResult();
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Compte> getAllComptes() {
			Query query = entityManager.createQuery("Select c from Compte c");
			return query.getResultList();
		}

		@Override
		public boolean pay(double montant, long numeroCompte) {
			
			Compte compte = getCompteByNumeroCompte(numeroCompte);
			compte.setSolde(compte.getSolde()+montant); 
			entityManager.persist(compte);
			return true;
		}

		@Override
		public boolean remove(double montant, long numeroCompte) {
			Compte compte = getCompteByNumeroCompte(numeroCompte);
			compte.setSolde(compte.getSolde()-montant);
			entityManager.persist(compte);
			return true;
		}



}
