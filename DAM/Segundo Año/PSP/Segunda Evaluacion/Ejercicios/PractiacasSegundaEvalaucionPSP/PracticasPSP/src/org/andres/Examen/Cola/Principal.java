package org.andres.Examen.Cola;



public class Principal {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Productor productor = new Productor(cola);
        Consumidor consumidor = new Consumidor(cola);

        productor.start();
        consumidor.start();
    }
}
