
package com.mycompany.ejercicio16;
    

public class Titular {
   private String nombre;
   private String dni;
   private String direccion;
   
   public Titular(String n, String d, String di){
       this.nombre = n;
       this.dni = d;
       this.direccion = di;
       
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
        
    }
   
   
   
    
}