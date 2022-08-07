package biblioteca;

import javax.persistence.Entity;

@Entity

public class LibroElementoBiblioteca extends ElementoBiblioteca {
	
	private String genere;
	private String autore;
	public LibroElementoBiblioteca(String codiceIsbn, String titolo, int annoPublicazione, int numPagine, String genere, String autore) {
		super(codiceIsbn, titolo, annoPublicazione, numPagine);
		this.genere = genere;
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	@Override
	public String toString() {
		return "LibroElementoBiblioteca [genere=" + genere + ", autore=" + autore + ", toString()=" + super.toString()
				+ "]";
	}
	public LibroElementoBiblioteca() {
		super();
	}

	
	
	
	
}
