package com.company;

public class Funciones {

    public static void main(String[] args) {



        holaMundo("mauricio");
        
        //Tareas que se pueden volver repetitivas
        //System.out.println("Hola mundo");
        //System.out.println("Hola mundo");
        //System.out.println("Hola mundo");

        String hola = retornaTextoHolaMundo();
        System.out.println(hola + " Hola mundo");


    }

    public static void holaMundo() {  //puclic para usar los metodos de forma publica y protected para usar funciones hijas

        System.out.println("Hola mundo ");

    }

    public static void holaMundo(String name) {

        System.out.println("Hola mundo " + name);
        System.out.println("Hola mundo");

    }

    private static String retornaTextoHolaMundo() { //debe devolver el tipo de dato asinado ejemplo String.

        return "Devolver texto";

    }

    private static int suma(int numero1, int numero2){  // ya que es una Fn que devolvera con el return numeros seria int suma
        return numero1 + numero2;
    }

}
