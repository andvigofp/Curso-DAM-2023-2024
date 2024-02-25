package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Cola cola = new Cola();

        Productor producto1 = new Productor(cola, 1);
        Consumidor cons1 = new Consumidor(cola, 1);

        producto1.start();
        cons1.start();
    }

}
