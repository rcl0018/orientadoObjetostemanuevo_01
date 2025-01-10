

package com.mycompany.relacionentreclases01;


public class RelacionEntreClases01 {

    public static void main(String[] args) {
        Persona persona1 = new Persona("maria", "88888K", "española");
        Coche coche1 = new Coche(persona1, "Opel", 10101);
        
        
        System.out.println(coche1);
    }
}
