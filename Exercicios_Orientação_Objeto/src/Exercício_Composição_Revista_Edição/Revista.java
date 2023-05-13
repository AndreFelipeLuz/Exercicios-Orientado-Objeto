package Exercício_Composição_Revista_Edição;

import java.util.ArrayList;
import java.util.List;

public class Revista {
	private int codigo;
	private String titulo;
	private int reciclagemProduzida;
	private List<Edicao> listaEdicao;
	
	public Revista(int codigo,String titulo) {
		this.codigo = codigo;
		this.titulo = titulo;
		reciclagemProduzida = 0;
		listaEdicao = new ArrayList<>();
	}

	public void adicionarEdicao(int numero,int tiragem,int qtdeVendida) {
		listaEdicao.add(new Edicao(numero, tiragem, qtdeVendida));
	}
	
	public void removerEdicao(Edicao edicao) {
		listaEdicao.remove(edicao);
	}
	
	public String reciclarEdicao(int edicao) {
		
		for (int i = 0; i < listaEdicao.size(); i++) {
			if (listaEdicao.get(i).getNumero() == edicao) {
				if (listaEdicao.get(i).obterQtdeReciclagem() == 0) {
					return "Não houve exemplares para reciclar.";
				}else if(listaEdicao.get(i).getReciclou()) {
					return "Edição Ja Reciclada!";
				}else {
					listaEdicao.get(i).reciclarExemplares();
					reciclagemProduzida += listaEdicao.get(i).obterQtdeReciclagem();
					return "Reciclagem Realizada!";
				}
			}
		}return "Edição não encontrada.";
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getCodigo() {
		return codigo;
	}

	public int getReciclagemProduzida() {
		return reciclagemProduzida;
	}

	public List<Edicao> getListaEdicao() {
		return listaEdicao;
	}
	
}
