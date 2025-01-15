
package com.mycompany.ejercicio13;

import java.util.Scanner;


public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        Autor autor1 = new Autor("pedro", "nacionalidad");
        Autor autor2 = new Autor("manuel", "nacionalidad");
        Autor autor3 = new Autor("manuel", "nacionalidad");
        Autor autor4 = new Autor("manuel", "nacionalidad");
        Autor autor5 = new Autor("manuel", "nacionalidad");
        
        Editorial editorial1 = new Editorial("editorial1", "pais", 3);
        Editorial editorial2 = new Editorial("editorial1", "pais", 3);
        Editorial editorial3 = new Editorial("editorial1", "pais", 3);
        Editorial editorial4 = new Editorial("editorial1", "pais", 3);
        Editorial editorial5 = new Editorial("editorial1", "pais", 3);
       
        Libros libro1 = new Libros("libro1",autor1,editorial1,"fo3ofb3",true);
        Libros libro2 = new Libros("libro1",autor2,editorial2,"fo3ofb3",true);
        Libros libro3 = new Libros("libro1",autor3,editorial3,"fo3ofb3",true);
        Libros libro4 = new Libros("libro1",autor4,editorial4,"fo3ofb3",true);
        Libros libro5 = new Libros("libro1",autor5,editorial5,"fo3ofb3",true);
        
        
        System.out.println("Que quieres hacer reservar o devolver");
        String respuesta1 = sc.nextLine();
        
        
        System.out.println("Que libro quieres reservar ");
        String numbre = sc.nextLine();
        
        
        
    }
    
}
