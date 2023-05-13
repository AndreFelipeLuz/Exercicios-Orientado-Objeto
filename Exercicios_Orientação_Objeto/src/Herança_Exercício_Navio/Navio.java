package Herança_Exercício_Navio;

public class Navio {
	
	protected int id;
	protected String nome;
	protected int quantitadePoroes;
	protected double capacidadeCarga;
	protected String disponibilidade;

	public Navio() {
		disponibilidade = "Vazio";
	}
	
	public void iniciaCarregamento() {
		disponibilidade = "Carregando";
	}
	public void bloqueiaCarregamento() {
		disponibilidade = "Lotado";
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantitadePoroes() {
		return quantitadePoroes;
	}

	public void setQuantitadePoroes(int quantitadePoroes) {
		this.quantitadePoroes = quantitadePoroes;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public int getId() {
		return id;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}
}
