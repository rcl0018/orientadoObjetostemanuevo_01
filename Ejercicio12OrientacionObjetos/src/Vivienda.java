public class Vivienda {
    private String nombreP;
    private int valorVivienda;
    private String DireccionVivienda;
    private Habitacion[] habitacione;

    public Vivienda(String nP, int vV, String dV, Habitacion[] hab) {
        this.nombreP = nP;
        this.valorVivienda = vV;
        this.DireccionVivienda = dV;
        this.habitacione = hab;
    }

    public void imprimirHabitaciones(){
        System.out.println(" Nombre de la vivienda " + this.nombreP +" valor de la vivienda " +this.valorVivienda+ "EUROS" + " Direccion de vivienda "+this.DireccionVivienda);
        for (int i = 0; i < habitacione.length; i++) {
            System.out.println("la habitacion numero " + i +": "+ this.habitacione[i].getNombreEstanciayLados());
        }
    }

    public void metrosTotales(){
        int metrosTotales =0;
        for (int i = 0; i < habitacione.length; i++) {
            metrosTotales += this.habitacione[i].calcularVivienda();
        }
        System.out.println("Los metros totales son: " + metrosTotales);


    }


}
