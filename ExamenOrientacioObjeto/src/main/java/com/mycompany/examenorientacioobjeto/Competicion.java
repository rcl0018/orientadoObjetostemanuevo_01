
package com.mycompany.examenorientacioobjeto;

public class Competicion {
    private String nombreCompeticion;
    private String paisDesarrolla;
    private Piloto[] piloto;

    public Competicion(String nombreCompeticion, String paisDesarrolla, Piloto[] piloto) {
        this.nombreCompeticion = nombreCompeticion;
        this.paisDesarrolla = paisDesarrolla;
        this.piloto = piloto;
    }

    public String getNombreCompeticion() {
        return nombreCompeticion;
    }

    public void setNombreCompeticion(String nombreCompeticion) {
        this.nombreCompeticion = nombreCompeticion;
    }

    public String getPaisDesarrolla() {
        return paisDesarrolla;
    }

    public void setPaisDesarrolla(String paisDesarrolla) {
        this.paisDesarrolla = paisDesarrolla;
    }

    public Piloto[] getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto[] piloto) {
        this.piloto = piloto;
    }

    @Override
    public String toString() {
        return "Competicion{" + "nombreCompeticion=" + nombreCompeticion + ", paisDesarrolla=" + paisDesarrolla + ", piloto=" + piloto + '}';
    }
    
    // mostrar una lista de clasificacion no esta ordenada
    
        public void imprimirPiloto(){
            for (int i = 0; piloto.length > 0; i++) {
                System.out.println("El piloto " + this.piloto[i].getNombre()+ "con un tiempo de " + this.piloto[i].getTimepoMinutos());     
            }
            
            
    }
        
    
}
