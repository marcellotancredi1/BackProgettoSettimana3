package biblioteca;

import java.time.LocalDate;

import biblioteca.user.Prestito;
import biblioteca.user.Utente;
import bibliotecadao.ElementoBibliotecaDao;
import bibliotecadao.PrestitoDao;
import bibliotecadao.UtenteDao;

public class Archivio {

	public static void main(String[] args) {
		ElementoBibliotecaDao elementoDao = new ElementoBibliotecaDao();
		PrestitoDao prestitoDao = new PrestitoDao();
		UtenteDao utenteDao = new UtenteDao();
		LibroElementoBiblioteca libro1 = new LibroElementoBiblioteca("666", "Eeeeehhhhooohhh", 1999, 666, "sapessi", "Pacciani");	
		LibroElementoBiblioteca libro2 = new LibroElementoBiblioteca("asd", "AAAAAAAAA", 2001, 858, "sada", "Vanni");
		
		RivistaElementoBiblioteca rivista1 = new RivistaElementoBiblioteca("sfaerwt", "Insomma", 1999, 555, Periodicita.mensile);
		RivistaElementoBiblioteca rivista2 = new RivistaElementoBiblioteca("dfasd", "OOOOO", 2001, 858, Periodicita.semestrale);
		elementoDao.inserisci(libro1);
		elementoDao.inserisci(libro2);
		elementoDao.inserisci(rivista1);
		elementoDao.inserisci(rivista2);
		
		
		Utente utente1 = new Utente("sada", "wgrwtw", "55", 6464);
		Utente utente2 = new Utente("tue", "eewrew", "85", 9999);
		Utente utente3 = new Utente("oio", "ewrw", "33", 878);
		
		Prestito prestito1 = new Prestito(utente3, rivista2, LocalDate.of(2022, 6, 20), null);
		Prestito prestito2 = new Prestito(utente3, libro1, LocalDate.of(2022, 7, 20), null);
		Prestito prestito3 = new Prestito(utente3, rivista1, LocalDate.of(2022, 7, 23), LocalDate.of(2022, 8, 07));
		utenteDao.inserisci(utente1);
		utenteDao.inserisci(utente2);
		utenteDao.inserisci(utente3);

		prestitoDao.inserisci(prestito1);
		prestitoDao.inserisci(prestito2);
		prestitoDao.inserisci(prestito3);
		
		
		
		
		//utenteDao.searchbyNameT(9999);
		
		utenteDao.searchbyNameT(6464);
		utenteDao.searchbyNameT(9999);
		utenteDao.searchbyNameT(878);
		prestitoDao.recuperadaid(prestito3);
		System.out.println("@@@@@@@@@@@@@@@@@@#######################@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
	}

}
