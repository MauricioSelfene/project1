package com.company;

public class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico(){ // Constructor vacio

    }

    public CocheElectrico(String motorElectrico){ //constructor que llama al metodo motorElectrico
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
