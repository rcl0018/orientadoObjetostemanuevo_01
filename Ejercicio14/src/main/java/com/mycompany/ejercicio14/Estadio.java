

package com.mycompany.ejercicio14;

public class Estadio {
    private String ciudad;
    private String empresaGEntiona;
    private zonaGeneral grada;
    private zonaGeneral tribuna;
    private zonaGeneral palco;

    public Estadio(String ciudad, String empresaGEntiona, zonaGeneral grada, zonaGeneral tribuna, zonaGeneral palco) {
        this.ciudad = ciudad;
        this.empresaGEntiona = empresaGEntiona;
        this.grada = grada;
        this.tribuna = tribuna;
        this.palco = palco;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmpresaGEntiona() {
        return empresaGEntiona;
    }

    public void setEmpresaGEntiona(String empresaGEntiona) {
        this.empresaGEntiona = empresaGEntiona;
    }

    public zonaGeneral getGrada() {
        return grada;
    }

    public void setGrada(zonaGeneral grada) {
        this.grada = grada;
    }

    public zonaGeneral getTribuna() {
        return tribuna;
    }

    public void setTribuna(zonaGeneral tribuna) {
        this.tribuna = tribuna;
    }

    public zonaGeneral getPalco() {
        return palco;
    }

    public void setPalco(zonaGeneral palco) {
        this.palco = palco;
    }


    public void mostrarEntradas(){
        int total = this.grada.getAsientosDisponibles()+ this.tribuna.getAsientosDisponibles()+this.palco.getAsientosDisponibles();
        System.out.println(total);
    
    }
    
    

  
    
    
    
    
}
