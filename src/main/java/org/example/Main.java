package org.example;
public class Main {
    public static void main(String[] args) {

        feladat();
        }

    private static void feladat() {
        Feladat f = new Feladat();
        f.bekeres();
        f.tombKiir();
        f.listaKiir();
        f.tartalmaz();
        f.sorbarendez();
        f.dbBetuk();
    }
}
