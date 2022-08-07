package biblioteca;

import javax.persistence.Entity;

@Entity

public class RivistaElementoBiblioteca extends ElementoBiblioteca {

	
	private Periodicita periodicita;

	public RivistaElementoBiblioteca(String codiceIsbn, String titolo, int annoPublicazione, int numPagine, Periodicita periodicita) {
		super(codiceIsbn, titolo, annoPublicazione, numPagine);
		this.periodicita = periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return "RivistaElementoBiblioteca [periodicita=" + periodicita + ", toString()=" + super.toString() + "]";
	}

	public RivistaElementoBiblioteca() {
		super();
	}


	
}
