package principal.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Individuo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String codigo;
	
	@OneToMany
	private List<Sequencia> lista;	
	
	public Individuo() {
		
	}
	
	public Individuo(String nome, String codigo) {
		this.codigo = codigo;
		this.nome = nome;
		this.lista = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void addMed(Sequencia seq) {
		this.lista.add(seq);
	}

}
