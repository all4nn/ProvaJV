package principal.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Sequencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sequencia;
	
	@ManyToOne
	private Individuo individuo;
	
	public Sequencia() {
		
	}
	
	public Sequencia(String sequencia, Individuo individuo) {
		this.sequencia = sequencia;
		this.individuo = individuo;
	}
	
	public String getNome() {
		return sequencia;
	}
	public void setNome(String sequencia) {
		this.sequencia = sequencia;
	}
	
	public int getId() {
		return this.id;
	}

}
