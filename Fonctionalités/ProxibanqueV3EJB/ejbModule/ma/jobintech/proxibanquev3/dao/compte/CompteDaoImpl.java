package ma.jobintech.proxibanquev3.dao.compte;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ma.jobintech.proxibanquev3.entities.Compte;
import ma.jobintech.proxibanquev3.entities.TypeClient;

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

		@SuppressWarnings("unchecked")
		@Override
		public List<Compte> getAllComptes() {
			Query query = entityManager.createQuery("Select c from Compte c");
			return query.getResultList();
		}

		@Override
		public double augmenterCompte(double montant) {
			
			return 0;
		}

		@Override
		public double diminuerCompte(double montant) {
		
			return 0;
		}

}
