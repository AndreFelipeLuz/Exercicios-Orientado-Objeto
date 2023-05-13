package Exercício_Composição_Revista_Edição;

public class App {

	public static void main(String[] args) {
		Revista revista = new Revista(1, "O Multiverso");

		revista.adicionarEdicao(52, 1000, 800);
		revista.adicionarEdicao(53, 900, 900);
		revista.adicionarEdicao(54, 1200, 1000);
		
		mostrarExibição(revista, 53);
		mostrarExibição(revista, 54);
		mostrarExibição(revista, 54);
		mostrarExibição(revista, 99);
	}
	
	public static void mostrarExibição(Revista revista,int codigo) {
		for (Edicao edicao : revista.getListaEdicao()) {
			if (edicao.getNumero() == codigo) {
				System.out.println("===================================");
				System.out.println("Número: " + edicao.getNumero());
				System.out.println("Data: " + edicao.getData());
				System.out.println("Tiragem: " + edicao.getTiragem());
				System.out.println("Quantidade vendida: " + edicao.getQtdeVendida());
				System.out.println("Reciclou: " + edicao.getReciclou());
				System.out.println(revista.reciclarEdicao(codigo));
				System.out.println("===================================");
				System.out.println();
			}
		}
	}
}
