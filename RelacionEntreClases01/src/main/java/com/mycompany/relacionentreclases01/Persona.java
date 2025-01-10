
package com.mycompany.relacionentreclases01;


public class Persona {
    private String nombre;
    private String dni;
    private String nacionalidad;
    
    public Persona(String nom, String dn,String naciona){
        this.nombre = nom;
        this.dni = dn;
        this.nacionalidad = naciona;
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

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
    
    public String toString(){
    return "Nombre: " + this.nombre + " dni: " + this.dni + " nacionalidad: " + this.nacionalidad;
            }
    
    
}
