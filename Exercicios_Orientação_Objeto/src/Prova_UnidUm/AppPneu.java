package Prova_UnidUm;

public class AppPneu {

	static boolean resultado;
	static Pneu pneu;
	
	public static void main(String[] args) {
		
		pneu = new Pneu(18, "Modelo tal", 110);
		
		System.out.println("Identificador: " + pneu.getIdPneu());
		System.out.println("Modelo       : " + pneu.getModelo());
		System.out.println("Índice de uso: " + pneu.getIndiceDeUso());
		System.out.println("Estado       : " + pneu.getEstado());
		System.out.println("Horas de uso : " + pneu.getHorasDeUso());
		
		resultado =  pneu.desgastar(4, 14);
		mostrarDesgaste();
		
		resultado = pneu.desgastar(15, 20);
		mostrarDesgaste();

		resultado = pneu.desgastar(21, 23);
		mostrarDesgaste();

	}

	public static void mostrarDesgaste() {
		if (resultado == true) {
			System.out.println("\nDesgaste registrado:");
			System.out.println("Índice de uso: " + pneu.getIndiceDeUso());
			System.out.println("Estado       : " + pneu.getEstado());
			System.out.println("Horas de uso : " + pneu.getHorasDeUso());			
		}
		else {
			System.out.println("\nDesgaste não registrado: Pneu fora de uso");
		}
		
	}
	
	
}




