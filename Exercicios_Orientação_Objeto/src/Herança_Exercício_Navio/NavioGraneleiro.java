package Herança_Exercício_Navio;

public class NavioGraneleiro extends Navio {
	
	private int quantidadeEscotilhas;
	
	public NavioGraneleiro(int id,String nome,int quantitadePoroes,double capacidadeCarga,int quantidadeEscotilhas) {
		this.id = id;
		this.nome = nome;
		this.quantitadePoroes = quantitadePoroes;
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public int getQuantidadeEscotilhas() {
		return quantidadeEscotilhas;
	}

	public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
		this.quantidadeEscotilhas = quantidadeEscotilhas;
	}
	
	
}
