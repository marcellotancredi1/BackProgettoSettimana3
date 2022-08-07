package biblioteca.user;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import biblioteca.ElementoBiblioteca;

@Entity

public class Prestito {
	@ManyToOne
	private Utente utente;
	@OneToOne
	private ElementoBiblioteca prestato;
	private LocalDate datainizioPrestito;
	private boolean Scaduto;
	private LocalDate datarestituzioneeffettiva;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	public Prestito() {
		super();
	}
	public Prestito(Utente utente, ElementoBiblioteca prestato, LocalDate datainizioPrestito,
			LocalDate datarestituzioneeffettiva) {
		super();
		this.utente = utente;
		this.prestato = prestato;
		this.datainizioPrestito = datainizioPrestito;
		Scaduto = datainizioPrestito.plusDays(30).isBefore(LocalDate.now());
		this.datarestituzioneeffettiva = datarestituzioneeffettiva;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public ElementoBiblioteca getPrestato() {
		return prestato;
	}
	public void setPrestato(ElementoBiblioteca prestato) {
		this.prestato = prestato;
	}
	public LocalDate getDatainizioPrestito() {
		return datainizioPrestito;
	}
	public void setDatainizioPrestito(LocalDate datainizioPrestito) {
		this.datainizioPrestito = datainizioPrestito;
	}
	public boolean isScaduto() {
		return Scaduto;
	}
	public void setScaduto(boolean scaduto) {
		Scaduto = scaduto;
	}
	public LocalDate getDatarestituzioneeffettiva() {
		return datarestituzioneeffettiva;
	}
	public void setDatarestituzioneeffettiva(LocalDate datarestituzioneeffettiva) {
		this.datarestituzioneeffettiva = datarestituzioneeffettiva;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
