package org.andres.Ejercicios.Examen.ejercicio1;

public class Fondo {
    private int saldo;

    public double saldo() {

        return saldo;
    }

    public Fondo(int saldo) {

        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }
    public synchronized void ingresar(int cobro){
        saldo+=cobro;
    }
}
