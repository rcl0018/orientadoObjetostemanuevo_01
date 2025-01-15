public class Habitacion {

    private String nombreEstancia;
    private int lado1;
    private int lado2;

    public Habitacion(String nE, int l1, int l2){
        this.nombreEstancia = nE;
        this.lado1 = l1;
        this.lado2 = l2;
    }

    public String getNombreEstanciayLados() {
    return"La habitacion: "+ nombreEstancia +" mide el lado 1: "+ this.lado1 +" mide el lado 2: "+ this.lado2;
    }

    public int calcularVivienda(){
        int areaTotal =  this.lado1 * this.lado2;
        return areaTotal;
    }


}
