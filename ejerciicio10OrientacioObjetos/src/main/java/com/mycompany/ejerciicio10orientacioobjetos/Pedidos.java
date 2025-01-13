
package com.mycompany.ejerciicio10orientacioobjetos;


public class Pedidos {
    private int pequeña;
    private int mediana;
    private int grande;
    private Ingredientes[] ingredientes; 
    
    
    public Pedidos(Ingredientes[] i){
        this.pequeña = 5;
        this.mediana = 7;
        this.grande = 10;
        this.ingredientes = i;
        
    }
    
    public int getPequeña(){
        return this.pequeña;
    }
    public void setPequeña(int pequeña){
        this.pequeña = pequeña;
    }

    public int getMediana() {
        return mediana;
    }

    public void setMediana(int mediana) {
        this.mediana = mediana;
    }

    public int getGrande() {
        return grande;
    }

    public void setGrande(int grande) {
        this.grande = grande;
    }

    public Ingredientes[] getIngredienets() {
        return ingredientes;
    }

    public void setIngredienets(Ingredientes[] ingredienets) {
        this.ingredientes = ingredienets;
    }


  public void ImprimirIngredientes(){

      for (int i = 0; i < ingredientes.length; i++) {
          System.out.println(this.ingredientes[i]);
          
          
      }
    
  }
    

    
    
    
}
