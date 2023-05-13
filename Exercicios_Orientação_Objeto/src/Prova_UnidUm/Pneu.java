package Prova_UnidUm;

public class Pneu {
	
	private int idPneu;
	private String modelo;
	private double indiceDeUso;
	private char estado;
	private int horasDeUso;
	
	public Pneu(int idPneu, String modelo, double indiceDeUso) {
		super();
		this.idPneu = idPneu;
		this.modelo = modelo;
		this.indiceDeUso = indiceDeUso;
		this.estado = 'N';
		this.horasDeUso = 0;
	}

	public boolean desgastar(int horaInicial, int horaFinal) {
		final double INDICE_DESGASTE = 0.12345;
		if (this.estado=='N' || this.estado=='U') {
			
			if (this.estado=='N') {
				this.estado='U';
			}
			int horas = horaFinal-horaInicial;
			this.indiceDeUso -= (horas) * 60 * INDICE_DESGASTE;
			if (this.indiceDeUso<=0) {
				this.estado='F';
			}
			this.horasDeUso += horas;
			
			return true; 
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getIdPneu() {
		return idPneu;
	}

	public double getIndiceDeUso() {
		return indiceDeUso;
	}

	public char getEstado() {
		return estado;
	}

	public int getHorasDeUso() {
		return horasDeUso;
	}
	
	
	

}







