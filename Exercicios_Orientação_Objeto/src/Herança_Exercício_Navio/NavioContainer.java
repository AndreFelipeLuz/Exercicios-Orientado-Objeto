package Herança_Exercício_Navio;

public class NavioContainer extends Navio {
	
	private int quantidadeGuindaste;
	private int quantidadeCamadas;
	
	public NavioContainer(int id,String nome,int quantitadePoroes,double capacidadeCarga,int quantidadeCamadas,int quantidadeGuindaste){
		this.id = id;
		this.nome = nome;
		this.quantitadePoroes = quantitadePoroes;
		this.capacidadeCarga = capacidadeCarga;
		this.quantidadeCamadas = quantidadeCamadas;
		this.quantidadeGuindaste = quantidadeGuindaste;
	}

	public int getQuantidadeGuindaste() {
		return quantidadeGuindaste;
	}

	public void setQuantidadeGuindaste(int quantidadeGuindaste) {
		this.quantidadeGuindaste = quantidadeGuindaste;
	}

	public int getQuantidadeCamadas() {
		return quantidadeCamadas;
	}

	public void setQuantidadeCamadas(int quantidadeCamadas) {
		this.quantidadeCamadas = quantidadeCamadas;
	}
	
	
	
}
