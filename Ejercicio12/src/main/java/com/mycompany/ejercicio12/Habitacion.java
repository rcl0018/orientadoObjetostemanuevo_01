
package com.mycompany.ejercicio12;

public class Habitacion {
    private String nombreEstancia;
    private int lado1;
    private int lado2;
    
    public Habitacion(String nE, int l1, int l2){
        this.nombreEstancia = nE;
        this.lado1 = l1;
        this.lado2 = l2;
    }
    
    
    
    public void calcularVivienda(){
       int areaTotal =  this.lado1 * this.lado2;
        System.out.println("el area es de " + areaTotal + "m2");
    
    }
    
    
}
