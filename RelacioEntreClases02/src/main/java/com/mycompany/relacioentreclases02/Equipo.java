
package com.mycompany.relacioentreclases02;


public class Equipo {
    
    private String nombre;
    private String ciudad;
    private int numeroSocios;
    private Jugador[] jugadores;
    
    public Equipo(String n, String c, int nS, Jugador[] j){
        this.nombre = n;
        this.ciudad = c;
        this.numeroSocios = nS;
        this.jugadores = j;
        
    }
    
    public void imprimirListaJugadores(){
        for (int i = 0; i < jugadores.length; i++) {
            System.out.println(this.jugadores[i].getNombre());
        }
    }
}
