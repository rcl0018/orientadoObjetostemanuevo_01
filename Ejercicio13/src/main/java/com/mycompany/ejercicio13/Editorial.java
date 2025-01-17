
package com.mycompany.ejercicio13;

public class Editorial {
    private String nombre;
    private String pais;
    private int cantidadLibrosPublicados;
    
    public Editorial(String n,String p, int cLP){
        this.nombre = n;
        this.pais = p;
        this.cantidadLibrosPublicados = cLP;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", pais=" + pais + ", cantidadLibrosPublicados=" + cantidadLibrosPublicados + '}';

    }
    
    
    
    
}
