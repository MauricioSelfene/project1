package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche1 = new CocheElectrico();

        CocheElectrico coche2 = new CocheElectrico();

        cocheHibrido coche3 = new cocheHibrido();


        //polimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new cocheHibrido();

        if (coche4 instanceof Coche) {
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico) {
            System.out.println("Coche electrico");
        }
        if (coche4 instanceof cocheHibrido) {
            System.out.println("Coche hibrido");
        }

    }
}
