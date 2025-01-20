
package com.mycompany.ejercicio14;


public class Ejercicio14 {
    public static void main(String[] args) {
        
zonaGeneral zona1 = new zonaGeneral("grada");
zonaGeneral zona2 = new zonaGeneral("tribuna");
zonaGeneral zona3 = new zonaGeneral("palco");

Estadio estadio1 = new Estadio("gururu", "guroro" ,zona1 , zona2, zona3);



  zona1.venderEntradas(10);
  zona2.venderEntradas(10);
  zona3.venderEntradas(10);
     estadio1.mostrarEntradas();


    } 
    
}
