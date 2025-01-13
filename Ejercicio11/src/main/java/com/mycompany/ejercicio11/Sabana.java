
package com.mycompany.ejercicio11;

public class Sabana {

    private Persona per;
    private int metrosCuadrados;
    private int presupuesto;
    private String aviertaAlPublici;
    private Animale[] animal;

    public Sabana(Persona per, int mC, int pre, String aC, Animale[] an) {
        this.per = per;
        this.metrosCuadrados = mC;
        this.presupuesto = pre;
        this.aviertaAlPublici = aC;
        this.animal = an;
    }



    
    
    public void imprimirSabana() {
            System.out.println(this.per +" "+ 
                    this.metrosCuadrados +" "+this.presupuesto +" " +
                    this.aviertaAlPublici +" "+ "tiene los siguienetes animales");
        for (int i = 0; i < this.animal.length; i++) {
            System.out.println(this.animal[i]);

        }
    }

}
