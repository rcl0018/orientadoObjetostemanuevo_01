
package com.mycompany.ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        /*creamos la vivienda*/
        System.out.println("Dime tu nombre ");
        String nom = sc.next();
        System.out.println("Dime el valor de la vivienda");
        int valor = sc.nextInt();
        System.out.println("Cual es la direccion de la vivienda");
        String direccion = sc.next();
        System.out.println("Cuantas habitaciones tiene");
        int nHabitaciones = sc.nextInt();
        
        
        /*creamos las habitaciones*/
        Habitacion []habitacioni =new Habitacion[nHabitaciones];
        
        for (int i = 0; i < habitacioni.length; i++) {
            System.out.println("Nombre de la estancia");
            String nombreEstancia = sc.next();
            System.out.println("dime el lado 1 y el lado2 ");
            int lado1 = sc.nextInt();
            int lado2 = sc.nextInt();
            habitacioni[i] = 
        }

        
        
        
        
        
        
        
    }
}
