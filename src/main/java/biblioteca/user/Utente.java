package biblioteca.user;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity


public class Utente {
@OneToMany(mappedBy = "utente" )
	private List<Prestito> prestiti=new ArrayList();
	private String nome;
	private String cognome;
	private String eta;
	@Id
	private Integer numerotessera;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	
	public Integer getNumerotessera() {
		return numerotessera;
	}
	public void setNumerotessera(Integer numerotessera) {
		this.numerotessera = numerotessera;
	}
	public Utente() {
		super();
	}
	public Utente(String nome, String cognome, String eta, Integer numerotessera) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		this.numerotessera = numerotessera;
	}
	public List<Prestito> getPrestiti() {
		return prestiti;
	}
	public void setPrestiti(List<Prestito> prestiti) {
		this.prestiti = prestiti;
	}
	
	

}
