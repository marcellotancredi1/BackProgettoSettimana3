package bibliotecadao;

import javax.persistence.EntityManager;

import biblioteca.jpautil.JpaUtil;
import biblioteca.user.Prestito;

public class PrestitoDao {
	public void inserisci(Prestito U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(U);
		em.getTransaction().commit();
		em.close();
	}
	public void modifica(Prestito U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(U);
		em.getTransaction().commit();
		em.close();
	}
	public void elimina(Prestito U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recuperadaid(U));
		em.getTransaction().commit();
		em.close();
	}
	public Prestito recuperadaid(Prestito U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		return em.find(Prestito.class,U.getId());
	}
	
	
	
}
