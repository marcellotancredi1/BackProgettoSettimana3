package bibliotecadao;

import javax.persistence.EntityManager;

import biblioteca.ElementoBiblioteca;
import biblioteca.jpautil.JpaUtil;

public class ElementoBibliotecaDao {

	public void inserisci(ElementoBiblioteca U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(U);
		em.getTransaction().commit();
		em.close();
	}
	public void modifica(ElementoBiblioteca U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(U);
		em.getTransaction().commit();
		em.close();
	}
	public void elimina(ElementoBiblioteca U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recuperadaid(U.getCodiceIsbn()));
		em.getTransaction().commit();
		em.close();
	}
	public ElementoBiblioteca recuperadaid(String U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		return em.find(ElementoBiblioteca.class, U);
	}

}
