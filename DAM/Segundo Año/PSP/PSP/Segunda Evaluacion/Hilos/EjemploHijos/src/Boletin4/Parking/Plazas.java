package Boletin4.Parking;

import java.util.LinkedList;
import java.util.Random;

public class Plazas {
    private static final int MAX_TIME = 1000;

    LinkedList<Integer> cola = new LinkedList<>();
    int idPlaza;

    public Plazas(int id) {
        this.idPlaza = id;
    }

    private boolean estadoColavacia() {
        if (cola.size()==0)
            return true;
        else
            return false;
    }

    synchronized public void esperarCola(int id_cliente) throws InterruptedException {
        cola.addLast(id_cliente);

        while (cola.peek() != id_cliente) {
            //Me bloqueo hasta que hasta que sea mi turno
            wait();
        }
    }
    synchronized public void atender(int importePago) throws InterruptedException {
        // Si he terminado de atender, vacio la cola, si no, modifico el siguiente cliente a atender
        cola.removeFirst();
        int tiempo_atencion = new Random().nextInt(MAX_TIME);
        Thread.sleep(tiempo_atencion);
        ResultadosTotales.ganacias += importePago;
        // Acabo de atender, y despierto al siguiente cliente esperando
        notify();
    }

    synchronized public void imprimir() {
        // Se imprimen los clientes en la cola
        System.out.print("Plazas " + idPlaza + ": ");
        for (int c: cola) {
            System.out.print( c + " ");
        }
        System.out.println();
    }

}
