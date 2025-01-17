
package com.mycompany.ejercicio16;


public class CuentaBancaria {
    private Titular titular;
    private int numerCuentaBancaria;
    private int saldo;

    public CuentaBancaria(Titular titular, int numerCuentaBancaria, int saldo) {
        this.titular = titular;
        this.numerCuentaBancaria = numerCuentaBancaria;
        this.saldo = saldo;
        Banco.dineroTotal += saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getNumerCuentaBancaria() {
        return numerCuentaBancaria;
    }

    public void setNumerCuentaBancaria(int numerCuentaBancaria) {
        this.numerCuentaBancaria = numerCuentaBancaria;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    

    public void añadirSaldo(int cantidad){
        this.saldo+=cantidad;
        Banco.dineroTotal +=cantidad;
    }
      
    public void restarSaldo(int cantidad){
        this.saldo-=cantidad;
        Banco.dineroTotal -=cantidad;
    }
    public void mostrarSaldo(int cantidad){
        System.out.println(cantidad);
    }
}
