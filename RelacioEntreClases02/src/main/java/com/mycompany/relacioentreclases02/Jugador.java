
package com.mycompany.relacioentreclases02;


public class Jugador {
    private String nombre;
    private String posicion;
    private int salario;
    private int edad;

    public Jugador(String n, String p, int s, int e) {
        this.nombre = n;
        this.posicion = p;
        this.salario = s;
        this.edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", salario=" + salario + ", edad=" + edad + '}';
    }


    
    
    
}
