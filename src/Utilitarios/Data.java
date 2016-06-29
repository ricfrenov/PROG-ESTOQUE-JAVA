package Utilitarios;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Data {

    public String mes, dia, ano, dia_semana, hora;
    SimpleDateFormat horaformatada = new SimpleDateFormat("HH:mm:ss");

    public void le_hora() {
        Date horaAtual = new Date();
        hora = horaformatada.format(horaAtual);
    }

    public void Le_Data() {
        Date Data = new Date();
        mes = "" + Data.getMonth();
        dia = "" + Data.getDate();
        ano = "" + (1900 + Data.getYear());
//        dia_semana = "" + Data.getDay();

        switch (Data.getDay()) {
            case 0:
                dia_semana = "Domingo";
                break;
            case 1:
                dia_semana = "Segunda";
                break;
            case 2:
                dia_semana = "Terca";
                break;
            case 3:
                dia_semana = "Quarta";
                break;
            case 4:
                dia_semana = "Quinta";
                break;
            case 5:
                dia_semana = "Sexta";
                break;
            case 6:
                dia_semana = "Sabado";
                break;
        }
        switch (Data.getMonth()) {
            case 0:
                mes = "Janeiro";
                break;
            case 1:
                mes = "Fevereiro";
                break;
            case 2:
                mes = "Março";
                break;
            case 3:
                mes = "Abril";
                break;
            case 4:
                mes = "Maio";
                break;
            case 5:
                mes = "Junho";
                break;
            case 6:
                mes = "Julho";
                break;
            case 7:
                mes = "Agosto";
                break;
            case 8:
                mes = "Setembro";
                break;
            case 9:
                mes = "Outubro";
                break;
            case 10:
                mes = "Novembro";
                break;
            case 11:
                mes = "Dezembro";
                break;
        }
    }
}