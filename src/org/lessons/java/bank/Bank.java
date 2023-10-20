package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();

        Conto conto = new Conto(nomeUtente);
        System.out.println("Queste sono le info del tuo conto: ");
        System.out.println(conto.getInfoBankaccount() + conto.getSaldoFormatted());
        int scelta = 0;
        while (scelta != 4) {
            System.out.println("Menu:");
            System.out.println("1. Versa una somma di denaro");
            System.out.println("2. Preleva una somma di denaro");
            System.out.println("3. Visualizza il tuo saldo contabilizzato ");
            System.out.println("4. Esci");
            System.out.print("Scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la somma da versare: ");
                    double versamento = scanner.nextDouble();
                    conto.versamento(versamento);
                    System.out.println("Saldo attuale: " + conto.getSaldoFormatted());
                    break;
                case 2:
                    System.out.print("Inserisci la somma da prelevare: ");
                    double prelievo = scanner.nextDouble();
                    conto.prelievo(prelievo);
                    System.out.println("Saldo attuale: " + conto.getSaldoFormatted());
                    break;
                case 3:
                    System.out.println("visualizza il tuo saldo");
                    System.out.println("Saldo attuale: " + conto.getSaldoFormatted());
                case 4:
                    System.out.println("Grazie per averci scelto. Arrivederci!");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }

    }
}
