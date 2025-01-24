
package com.mycompany.examenorientacioobjeto;


public class Piloto {
    private String nombre;
    private String edad;
    private int timepoMinutos;

    public Piloto(String nombre, String edad, int timepoMinutos) {
        this.nombre = nombre;
        this.edad = edad;
        this.timepoMinutos = timepoMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getTimepoMinutos() {
        return timepoMinutos;
    }

    public void setTimepoMinutos(int timepoMinutos) {
        this.timepoMinutos = timepoMinutos;
    }

    @Override
    public String toString() {
        return "Piloto{" + "nombre=" + nombre + ", edad=" + edad + ", timepoMinutos=" + timepoMinutos + '}';
    }
    
    
// este metodo nos suma los daros de el timepo que vamos introduciendo
    public void sumarTimepoPiloto(int timepoNuevo){
        this.timepoMinutos += timepoNuevo;

    }
    

}
