
package com.mycompany.ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
         Autor autor1 = new Autor("pedro", "Espaniola ");
            Autor autor2 = new Autor("manuel", "Espania ");
            Autor autor3 = new Autor("manuel", "Espania ");
            Autor autor4 = new Autor("manuel", "Espania ");
            Autor autor5 = new Autor("manuel", "Espania ");

            Editorial editorial1 = new Editorial("yoigo", "Espania", 3);
            Editorial editorial2 = new Editorial("editorial2", "pais", 3);
            Editorial editorial3 = new Editorial("editorial3", "pais", 3);
            Editorial editorial4 = new Editorial("editorial4", "pais", 3);
            Editorial editorial5 = new Editorial("editorial5", "pais", 3);

            Libro libro1 = new Libro("jorge el curioso",autor1,editorial1,"fo3ofb3",true);
            Libro libro2 = new Libro("Libro2",autor2,editorial2,"fo3ofb3",false);
            Libro libro3 = new Libro("Libro3",autor3,editorial3,"fo3ofb3",true);
            Libro libro4 = new Libro("Libro4",autor4,editorial4,"fo3ofb3",false);
            Libro libro5 = new Libro("Libro5",autor5,editorial5,"fo3ofb3",true);
        

                    Libro[] libros = {libro1,libro2,libro3,libro4,libro5};
            for (int i = 0; i < libros.length; i++) {
                libros[i].imprimirDisponiblerReservado();

            }

            System.out.println("Que libro quieres reservar ");
            String nombre = sc.nextLine();

            if (nombre.equals("jorge el curioso")){
                libro1.estadoSiNo();
            }else if (nombre.equals("Libro2")) {
                libro2.estadoSiNo();
            }else if (nombre.equals("Libro3")) {
                libro3.estadoSiNo();
            }else if (nombre.equals("Libro4")) {
                libro4.estadoSiNo();
            }else if (nombre.equals("Libro5")) {
                libro5.estadoSiNo();
            }

        

        
        
        
    }
    
}
