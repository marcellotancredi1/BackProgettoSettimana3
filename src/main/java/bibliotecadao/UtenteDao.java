package bibliotecadao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import biblioteca.jpautil.JpaUtil;
import biblioteca.user.Prestito;
import biblioteca.user.Utente;



public class UtenteDao {

	public void inserisci(Utente U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(U);
		em.getTransaction().commit();
		em.close();
	}
	public void modifica(Integer U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(U);
		em.getTransaction().commit();
		em.close();
	}
	public void elimina(Integer U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(recuperadaid(U));
		em.getTransaction().commit();
		em.close();
	}
	public Utente recuperadaid(Integer U) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		Utente utente=em.find(Utente.class, U);
		em.getTransaction().commit();
		em.close();
		return utente;
	}


	public List<Prestito> searchbyNameT(Integer T){
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		Utente utente = recuperadaid(T);
		System.out.println("---------------------------------------------------");
		System.out.println(utente.toString());
		List<Prestito> prestito = utente.getPrestiti();
		prestito.stream().filter(ele->ele.getDatarestituzioneeffettiva()==null).toList();

		List<Prestito> filtrato = prestito.stream().filter(ele->ele.getDatarestituzioneeffettiva()==null).toList();
		for (Prestito ele : filtrato) {
			System.out.println(ele.getPrestato().toString());
		}
		return filtrato;
}
}
