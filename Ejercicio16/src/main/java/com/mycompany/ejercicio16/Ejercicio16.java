

package com.mycompany.ejercicio16;

import java.util.Scanner;


public class Ejercicio16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Titular titular1 = new Titular("juan", "77433245L", "calle almodovar 5");
        Titular titular2 = new Titular("Angel", "77433245L", "calle almodovar 5");
        Titular titular3 = new Titular("Manuel", "77433245L", "calle almodovar 5");
        
        CuentaBancaria cuenta1 = new CuentaBancaria(titular1, 1004243,100);
        CuentaBancaria cuenta2 = new CuentaBancaria(titular2, 1005555,100);
        CuentaBancaria cuenta3 = new CuentaBancaria(titular3, 1006666,100);
        
        cuenta1.añadirSaldo(100);
        cuenta2.añadirSaldo(20);
        
        System.out.println("Cual es tu cuenta bancaria, indentificate con tu nombre");
        String nombreIdentificarse = sc.nextLine();
        System.out.println("Que quieres añadir o retirar");
        String añadirRetirar = sc.nextLine();
        System.out.println("Cuanto dinero quieres ");
        int dinero = sc.nextInt();
        if (añadirRetirar.equals("añadir")) {
            
       
        switch (nombreIdentificarse) {
            case "juan":
                
                break;
            case "Angel":
                
                break;
            case "Manuel":
                
                break;
            default:
                throw new AssertionError();
        }
         }else if (añadirRetirar.equals("retirar")) {
            
        }
        System.out.println(Banco.dineroTotal);  

    }
}
