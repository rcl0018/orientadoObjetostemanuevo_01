
package com.mycompany.ejercicio13;


public class Libro {
    private String titulo;
    private Autor autor;
    private Editorial editorial;
    private String codigo;
    private boolean estado ;
    
    public Libro (String t, Autor a,Editorial e, String c,boolean es ){
    this.titulo = t;
    this.autor = a;
    this.editorial = e;
    this.codigo = c;
    this.estado = es;
    }
    
    public void imprimirDisponiblerReservado(){
        String a ="";
    if (this.estado){
         a = titulo + autor.toString() + editorial.toString() + codigo + " esta libre ";
        System.out.println(a);

    } else {
        a = titulo + autor.toString() + editorial.toString() + codigo + " esta ocupado ";
        System.out.println(a);
}

}
    
    
    pulic void reservarLibro(){

    }
    
    public void devolverLibro(){
    
    }

    public void estadoSiNo(){

        String estadosino ="";
        if (this.estado){
            estadosino =  "si esta libre";

        } else {
            estadosino= "no esta libre";}
        System.out.println("el libro " + this.titulo + " que as elegido " + estadosino );
    }
    
    
    
    
    
}
