package org.lessons.java.bank;

import java.util.Random;

public class Conto {
    private final int numeroConto;
    private String titolareConto;
    private double saldoConto = 0.0;

    //costruttore
    public Conto(String titolareConto) {
        this.numeroConto = generatoreRandomNumeroConto();
        this.titolareConto = titolareConto;
        this.saldoConto = 0.0;
        //generatore per creare un numero di conto random
    }

    private int generatoreRandomNumeroConto() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public String getTitolareConto() {
        return titolareConto;
    }

    public void setTitolareConto(String titolareConto) {
        this.titolareConto = titolareConto;
    }

    public double getSaldoConto() {
        return saldoConto;
    }

    //metodo per versare denaro su conto
    public void versamento(double aggiunta) {
        saldoConto += aggiunta;
        return;
    }

    //metodo per prelevare denaro
    public boolean prelievo(double aggiunta) {
        if (saldoConto >= aggiunta) {
            saldoConto -= aggiunta;
            return true;
        } else {
            System.out.println("Non hai abbastanza fondi.");
            return false;
        }
    }

    //metodo per acquisizione delle informazioni dsel conto
    public String getInfoBankaccount() {
        return "Numero Conto: " + numeroConto + ", Titolare Conto: " + titolareConto + "Il tuo Saldo: ";
    }

    public String getSaldoFormatted() {
        return String.format("%.2f€", saldoConto);
    }
}
