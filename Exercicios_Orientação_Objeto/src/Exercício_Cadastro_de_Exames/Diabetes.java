package Exercício_Cadastro_de_Exames;

public class Diabetes {
	
	private int idExame;
	private int nivelGricose;
	private String nomePaciente;
	
	public void exame(int idExame,String nomePaciente,int nivelGricose) {
		this.idExame = idExame;
		this.nomePaciente = nomePaciente;
		this.nivelGricose = nivelGricose;
	}
	
	public String obterDiagnostico(){
		
		if (nivelGricose <= 99) {
			return "Normal";
		}else if(nivelGricose > 99 && nivelGricose <= 125) {
			return "Pré-diabetico";
		}else {
			return "Diabetico";
		}
	}
	
	public int getIdExame() {
		return idExame;
	}
	public int getNivelGricose() {
		return nivelGricose;
	}
	public void setNivelGricose(int nivelGricose) {
		this.nivelGricose = nivelGricose;
	}
	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
}
