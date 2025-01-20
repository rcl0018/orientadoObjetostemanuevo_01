
package com.mycompany.ejercicio14;

public class zonaGeneral {
    
    private String tipoZona;
    private int asientosDisponibles;
    

    public zonaGeneral(String tipoZona) {
        this.tipoZona = tipoZona;

        
        switch (this.tipoZona) {
            case "grada":
                this.asientosDisponibles = 100;
                break;
            case "tribuna":
                this.asientosDisponibles = 50;
                break; 
            case "palco":
                this.asientosDisponibles = 20;
                break;
            default:
                break;
        }
        
    }

    public String getTipoZona() {
        return tipoZona;
    }

    public void setTipoZona(String tipoZona) {
        this.tipoZona = tipoZona;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }
    
    
    public void venderEntradas(int cantidad){
        this.asientosDisponibles-=cantidad;
        
    }
    public void entradasDisponibles(){
        System.out.println("quedan un total de " + this.asientosDisponibles);
    }
    

    
    
    
}
