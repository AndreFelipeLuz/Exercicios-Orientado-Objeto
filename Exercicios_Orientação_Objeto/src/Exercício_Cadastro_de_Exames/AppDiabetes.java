package Exercício_Cadastro_de_Exames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppDiabetes {

	private static int contagemCadastro = 0, num;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		List<Diabetes> diabetesList = new ArrayList<>();

		for (int i = 0; i < 1;) {
			System.out.println("Digite um numero para\n1- Cadastrar \n2-Consultar \n3-Alterar \n4-Excluir \n5-Listar");
			num = scanner.nextInt();
			switch (num) {
			case 1:
				cadastrarExame(diabetesList);
				break;
			case 2:
				consultarExame(diabetesList);
				break;
			case 3:
				alterarExame(diabetesList);
				break;
			case 4:
				excluirExame(diabetesList);
				break;
			case 5:
				listarExame(diabetesList);
				break;
			case 0:
				System.out.println("Tarefa concluida");
				i = 2;
				break;
			default:
				System.err.println("Opção Invalida");
				break;
			}
		}
	}

	private static void cadastrarExame(List<Diabetes> diabetesList) {

		Diabetes diabetes = new Diabetes();
		System.out.println("Escreva o Id o Nome e a Quantidade de glicose nessa Ordem.");
		int idExame = scanner.nextInt();
		for (int i = 0; i < diabetesList.size();) {
			if (idExame == diabetesList.get(i).getIdExame()) {
				System.err.println("Id ja utilizado utilize outro");
				idExame = scanner.nextInt();
			} else {
				i++;
			}
		}

		diabetes.exame(idExame, scanner.next(), scanner.nextInt());
		diabetesList.add(diabetes);
	}

	private static void consultarExame(List<Diabetes> diabetesList) {
		System.out.println("Digite o numero de\n1 a " + diabetesList.size() + " para fazer a consulta do banco de dados");
		num = scanner.nextInt() - 1;

		if (diabetesList.get(num) != null) {
			System.out.println("Id: " + diabetesList.get(num).getIdExame());
			System.out.println("Nome: " + diabetesList.get(num).getNomePaciente());
			System.out.println("Nivel De Glicose: " + diabetesList.get(num).getNivelGricose());
			System.out.println("Diagnostico: " + diabetesList.get(num).obterDiagnostico());
		} else {
			System.err.println("Objeto Nulo ou Não Encontrado");
		}
	}

	private static void listarExame(List<Diabetes> diabetesList) {

		for (int i = 0; i < diabetesList.size(); i++) {
			if (diabetesList.get(i) != null) {
				System.out.println("Id: " + diabetesList.get(i).getIdExame());
				System.out.println("Nome: " + diabetesList.get(i).getNomePaciente());
				System.out.println("Nivel De Glicose: " + diabetesList.get(i).getNivelGricose());
				System.out.println("Diagnostico: " + diabetesList.get(i).obterDiagnostico());
			} else {
				System.out.println("Objeto Nulo");
			}
		}
	}
	private static void alterarExame(List<Diabetes> diabetesList) {
	    System.out.println("Digite o número de 1 a " + diabetesList.size() + " para fazer a alteração de suas informações");
	    int num = scanner.nextInt() - 1;
	    if (num >= 0 && num < diabetesList.size()) {
	        System.out.println("Digite um número para\n1- Alterar apenas o Nome \n2-Alterar apenas a Glicose  \n3-Alterar os dois ");
	        int numdois = scanner.nextInt();
	        switch (numdois) {
	            case 1:
	                diabetesList.get(num).setNomePaciente(scanner.next());
	                break;
	            case 2:
	                diabetesList.get(num).setNivelGricose(scanner.nextInt());
	                break;
	            case 3:
	                diabetesList.get(num).setNomePaciente(scanner.next());
	                diabetesList.get(num).setNivelGricose(scanner.nextInt());
	                break;
	            default:
	                System.err.println("Opção Inválida");
	                break;
	        }
	    } else {
	        System.err.println("Objeto Nulo ou Não Encontrado");
	    }
	    
	}
	private static void excluirExame(List<Diabetes> diabetesList) {
		System.out.println("Digite o numero para fazer a exclusão do banco de dados");
		num = scanner.nextInt()-1;
		
		if (diabetesList.get(num) != null) {
			diabetesList.set(num, diabetesList.get(diabetesList.size()));
			diabetesList.remove(diabetesList.size());
		}else {
	        System.err.println("Objeto Nulo ou Não Encontrado");
		}
	}
}