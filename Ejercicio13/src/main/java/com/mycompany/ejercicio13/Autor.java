
package com.mycompany.ejercicio13;


public class Autor {
    private String nombre;
    private String nacionalidad;
    
    public Autor(String a, String n){
        this.nombre = n;
        this.nacionalidad = n;
    }

    @Override
    public String toString() {
        return "Autor{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    
    
}
