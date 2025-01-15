import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {



                Scanner sc = new Scanner(System.in);



                //creamos la vivienda

                System.out.println("Dime tu nombre ");
                String nom = sc.nextLine();
                System.out.println("Dime el valor de la vivienda");
                int valor = sc.nextInt();
                sc.nextLine();
                System.out.println("Cual es la direccion de la vivienda");
                String direccion = sc.nextLine();
                System.out.println("Cuantas habitaciones tiene");
                int nHabitaciones = sc.nextInt();
        sc.nextLine();


                /*creamos las habitaciones*/
                Habitacion []habitacioni =new Habitacion[nHabitaciones];
                    int lado1 ;
                    int lado2 ;
        String nombreEstancia;

                for (int i = 0; i < habitacioni.length; i++) {
                    System.out.println("Nombre de la estancia");
                     nombreEstancia= sc.nextLine();
                    System.out.println("dime el lado 1 y el lado2 ");
                     lado1 = sc.nextInt();
                    sc.nextLine();
                     lado2 = sc.nextInt();
                    sc.nextLine();
                    habitacioni[i]=new Habitacion(nombreEstancia,lado1,lado2);
                }


        Vivienda vivienda1 = new Vivienda(nom,valor,direccion,habitacioni);
                vivienda1.metrosTotales();



    }
}