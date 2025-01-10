
package com.mycompany.relacionentreclases01;


public class Coche {
    private Persona propietario;
    private String marca;
    private int km;
    
    public Coche(Persona p, String m, int k){
        this.propietario = p;
        this.marca = m;
        this.km = k;
    };

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
    
    public String toString(){
        return "Propietarios " + this.propietario.getNombre() + " Marca: " + this.marca + " km: " + this.km;
    }
}
