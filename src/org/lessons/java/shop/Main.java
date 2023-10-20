package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        //creo dei prodotti
        Prodotto prodotto1 = new Prodotto("Palla", "fantastica palla da basket", 30.0, 22.0);
        Prodotto prodotto2 = new Prodotto("Racchetta", "Racchetta da tennis", 180.0, 22);
        Prodotto prodotto3 = new Prodotto("Arnica", "Pomata per contratture", 20.0, 10.0);

//stampo i prodotti
        System.out.println(prodotto1.getNome() + ": prezzo senza IVA:" + prodotto1.getPrezzo() + "€" + " prezzo con IVA: " + prodotto1.getPrezzoIva() + "€");
        System.out.println("Prodotto1: " + prodotto1.getNomeCompleto());
        System.out.println(prodotto2.getNome() + ": prezzo senza IVA:" + prodotto2.getPrezzo() + "€" + " prezzo con IVA: " + prodotto2.getPrezzoIva() + "€");
        System.out.println("Prodotto2: " + prodotto2.getNomeCompleto());
        System.out.println(prodotto3.getNome() + ": prezzo senza IVA:" + prodotto3.getPrezzo() + "€" + " prezzo con IVA: " + prodotto3.getPrezzoIva() + "€");
        System.out.println("Prodotto3: " + prodotto3.getNomeCompleto());
    }
}
