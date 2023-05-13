package Exercício_Agregação_Viagem;

import java.time.LocalDate;
import java.util.Date;

public class Viagem {
    private int idViagem;
    private String destino;
    private Date dataInicial;
    private Date dataFinal;
    private int kmPercorrido;
    private Veiculo veiculo;
 

    public Viagem(int idViagem, String destino, Date dataInicial, Date dataFinal, int kmPercorrido) {
        this.idViagem = idViagem;
        this.destino = destino;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.kmPercorrido = kmPercorrido;
    }

    public int getIdViagem() {
        return idViagem;
    }
    public String getDestino() {
        return destino;
    }
    public Date getDataInicial() {
        return dataInicial;
    }
    public Date getDataFinal() {
        return dataFinal;
    }
    public int getKmPercorrido() {
        return kmPercorrido;
    }


    public boolean iniciarViagem(Veiculo veiculo){
        if (veiculo.getStatus() == 'V') {
            return false; 
        }
        this.dataInicial = new Date();
        this.veiculo = veiculo;
        this.veiculo.registrarViagem();
        return true;
    }
    public void finalizarViagem(int kmOdometro){
        this.dataFinal = new Date(); 
        this.kmPercorrido += calcularKmPercorrido(kmOdometro);
        this.veiculo.registrarRetorno(kmOdometro);
    }
    public int calcularKmPercorrido(int kmOdometro){
        return kmOdometro -= this.veiculo.getKmOdometro();
    }
}
