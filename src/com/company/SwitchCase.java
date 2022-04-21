package com.company;

public class SwitchCase {

    public static void main(String[] args) {

         String weather = "sunny";

         switch (weather) {

             case "sunny":
                 System.out.println("El tiempo esta soleado");
                 break;

             case "cloudy":
                 System.out.println("El tiempo esta nublado");
                 break;
             default:
                 System.out.println("No se pudo identificar el clima");

         }

    }

}
