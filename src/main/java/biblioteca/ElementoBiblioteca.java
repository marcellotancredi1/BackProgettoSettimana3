package biblioteca;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
	public abstract class ElementoBiblioteca {
@Id
		private String codiceIsbn;
		private String titolo;
		private int annoPublicazione;
		private int numPagine;
		public ElementoBiblioteca(String codiceIsbn, String titolo, int annoPublicazione, int numPagine) {
			this.codiceIsbn = codiceIsbn;
			this.titolo = titolo;
			this.annoPublicazione = annoPublicazione;
			this.numPagine = numPagine;
		}
		public String getCodiceIsbn() {
			return codiceIsbn;
		}
		public void setCodiceIsbn(String codiceIsbn) {
			this.codiceIsbn = codiceIsbn;
		}
		public String getTitolo() {
			return titolo;
		}
		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}
		public int getAnnoPublicazione() {
			return annoPublicazione;
		}
		public void setAnnoPublicazione(int annoPublicazione) {
			this.annoPublicazione = annoPublicazione;
		}
		public int getNumPagine() {
			return numPagine;
		}
		public void setNumPagine(int numPagine) {
			this.numPagine = numPagine;
		}
		
		//PER TRANSFORMARE VARIABILI IN STRINGHE E FARLE LEGGERE IN CONSOLE
		@Override
		public String toString() {
			return "GestioneLibri [codiceIsbn=" + codiceIsbn + ", titolo=" + titolo + ", annoPublicazione="
					+ annoPublicazione + ", numPagine=" + numPagine + "]";
		}
		public ElementoBiblioteca() {
			super();
		}
		
		
		
		
	}



