package com.company;

public class CocheMain {

    public static void main(String[] args) {

        String coche = " alfa romero";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 1430.45, 5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.9;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

    }
}
