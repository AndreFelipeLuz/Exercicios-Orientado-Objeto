package Herança_Exercício_Navio;

import java.util.ArrayList;
import java.util.List;

public class App {

	static List<NavioGraneleiro> navsG = new ArrayList<NavioGraneleiro>();
	static List<NavioContainer> navsC = new ArrayList<NavioContainer>();
	
	public static void main(String[] args) {
		navsG.add(new NavioGraneleiro(10, "Estrela do Mar", 4, 50000, 4));
		navsG.add(new NavioGraneleiro(25, "Cruzeiro do Sul", 3, 80000, 6));
		
		navsC.add(new NavioContainer(33, "BelaFera", 2, 100000, 30, 2));
		navsC.add(new NavioContainer(48, "Arrecifes", 2, 120000, 30, 2));
		navsC.add(new NavioContainer(52, "�guas Belas", 2, 90000, 25, 0));
	}

}
