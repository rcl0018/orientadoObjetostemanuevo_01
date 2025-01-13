                                           /*Asociacion Compuesta*/
package com.mycompany.relacioentreclases02;


public class RelacioEntreClases02 {

    /*
    Crea una clase equipo que tenga nombre,ciudad, numSocios y jugadores
    De los jugadoreds se sabe su nombre, posicion, salario y edad
    
    */
    
    /*En la clase Equipo debe haver¡¡ver un metodo especial que imprima todos los nobre de uss jugadores (solo los nombre)
*/
    public static void main(String[] args) {
        
        
        //Creamos los jugadores uno a uno
    Jugador j1 = new Jugador("asa", "delantero", 102,21);
    Jugador[] jugadores = {j1,new Jugador("dad", "defensa", 2323,3232)};
        
        Equipo equipo1 = new Equipo ("real mdrid", "Madrid", 10000,jugadores);
        equipo1.imprimirListaJugadores();
    }
    
}
