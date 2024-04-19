package org.andres.Ejercicios.PracticasPSP.Recipiente;

public class Lanzador {
    public static void main(String[] args) {
        Recipiente recipiente= new Recipiente();
        Productor productor = new Productor(recipiente, "Productor");
        Consumidor consumidor = new Consumidor(recipiente, "Consumidor");
        productor.start();
        consumidor.start();
    }
}
