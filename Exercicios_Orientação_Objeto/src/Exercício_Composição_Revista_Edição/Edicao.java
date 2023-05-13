package Exercício_Composição_Revista_Edição;

import java.util.Date;

public class Edicao {
	private int numero;
	private Date data;
	private int tiragem;
	private int qtdeVendida;
	private Boolean reciclou;
	
	public Edicao(int numero,int tiragem,int qtdeVendida){
		this.numero = numero;
		this.data = new Date();
		this.tiragem = tiragem;
		this.qtdeVendida = qtdeVendida;
		reciclou = false;
	}
	
	public void reciclarExemplares() {
		reciclou = true;
	}
	
	public int obterQtdeReciclagem() {
		return tiragem - qtdeVendida;
	}

	public int getTiragem() {
		return tiragem;
	}

	public void setTiragem(int tiragem) {
		this.tiragem = tiragem;
	}

	public int getQtdeVendida() {
		return qtdeVendida;
	}

	public int getNumero() {
		return numero;
	}

	public Date getData() {
		return data;
	}

	public Boolean getReciclou() {
		return reciclou;
	}
	
}
