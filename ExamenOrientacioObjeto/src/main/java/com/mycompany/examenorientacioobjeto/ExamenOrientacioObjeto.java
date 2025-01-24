
package com.mycompany.examenorientacioobjeto;

import java.util.Scanner;


public class ExamenOrientacioObjeto {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Piloto [] pilotos = { 
        new Piloto ("pedro","22",20),
        new Piloto ("juan","21",0), 
    };
    
    Competicion rally1 = new Competicion("rally desierto", "españia", pilotos);
    
        System.out.println("Nombre a introducir timepo ");
        String nombrePiloto = sc.nextLine();
        System.out.println("Tiempo a introducir ");
        int timepoNuevo = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < pilotos.length; i++) {
            if (pilotos[i].getNombre().equals(nombrePiloto)) {
                pilotos[i].sumarTimepoPiloto(timepoNuevo);   
            }
        }
        rally1.imprimirPiloto();

        sc.close();
    }
}
