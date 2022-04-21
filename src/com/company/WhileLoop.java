package com.company;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;
        while(count < 10){
            count++;
            if(count == 6)
                //continue; // salta el valor 6 y continua a la siguiente iteracion
                break; //rompeel flujo de ejecucion
                System.out.println("hola mundo" + count); //sin uso de las {}

        }

    }
}
