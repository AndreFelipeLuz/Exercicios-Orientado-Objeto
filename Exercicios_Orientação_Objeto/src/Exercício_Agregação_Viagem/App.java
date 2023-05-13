package Exercício_Agregação_Viagem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        Date dataInicio = formatar.parse("25/05/2023");
        Date dataFinal = formatar.parse("03/06/2023");
        Viagem viajar = new Viagem(1, "Canadá", dataInicio, dataFinal, 0);
        System.out.println("ID DE VIAGEM: " + viajar.getIdViagem());
        System.out.println("DESTINO: " + viajar.getDestino());
        System.out.println("DATA DO INICIO DA VIAGEM: " +viajar.getDataInicial());
        System.out.println("DATA DO FIM DA VIAGEM: " +viajar.getDataFinal());

        Veiculo veiculo1 = new Veiculo(1, "PX42S", 'D', 2000);
        System.out.println("===================================");
        System.out.println("ID DO VEICULO: " + veiculo1.getIdVeiculo());
        System.out.println("PLACA: "+veiculo1.getPlaca());
        System.out.println("STATUS: "+veiculo1.getStatus());
        System.out.println("KILOMETRAGEM: " +veiculo1.getKmOdometro());

        viajar.iniciarViagem(veiculo1);
        System.out.println("===================================");
        System.out.println("ID DE VIAGEM: " + viajar.getIdViagem());
        System.out.println("DESTINO: " + viajar.getDestino());
        System.out.println("DATA DO INICIO DA VIAGEM: " +viajar.getDataInicial());
        System.out.println("STATUS: "+veiculo1.getStatus());

        viajar.finalizarViagem(10000);
        System.out.println("===================================");
        System.out.println("ID DE VIAGEM: " + viajar.getIdViagem());
        System.out.println("DESTINO: " + viajar.getDestino());
        System.out.println("DATA DO FIM DA VIAGEM: " +viajar.getDataFinal());
        System.out.println("KILOMÊTRO PERCORRIDO: "+viajar.getKmPercorrido());
        System.out.println("===================================");
        System.out.println("ID DO VEICULO: " + veiculo1.getIdVeiculo());      
        System.out.println("PLACA: "+veiculo1.getPlaca());
        System.out.println("STATUS: "+veiculo1.getStatus());
        System.out.println("KILOMETRAGEM: " +veiculo1.getKmOdometro());
        veiculo1.revisar();
        System.out.println("VEICULO EM MANUNTEÇÃO,STATUS: "+veiculo1.getStatus());

    }
}
