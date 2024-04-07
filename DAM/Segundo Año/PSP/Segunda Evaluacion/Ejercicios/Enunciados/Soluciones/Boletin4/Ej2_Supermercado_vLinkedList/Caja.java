package Ej2_Supermercado_vLinkedList;

import java.util.LinkedList;
import java.util.Random;

public class Caja {
    private static final int MAX_TIME = 1000;

    LinkedList<Integer> cola = new LinkedList<>();
    int idCaja;

    public Caja(int id) {
        this.idCaja = id;
    }

    private boolean estaColaVacia() {
        if (cola.size() == 0)
            return true;
        else
            return false;
    }

    synchronized public void esperarEnCola(int id_cliente) throws InterruptedException {
        // Añado el cliente a la cola de la caja
        cola.addLast(id_cliente);

        while (cola.peek() != id_cliente) {
            // Me bloqueo hasta que sea mi turno
            wait();
        }
    }

    synchronized public void atender(int importePago) throws InterruptedException {
        // Si he terminado de atender, vacio la cola, si no, modifico el siguiente cliente a atender
        cola.removeFirst();
        int tiempo_atencion = new Random().nextInt(MAX_TIME);
        Thread.sleep(tiempo_atencion);
        ResultadosTotales.ganancias += importePago;
        // Acabo de atender, y despierto al siguiente cliente esperando
        notify();
    }

    synchronized public void imprimir() {
        // Se imprimen los clientes en la cola
        System.out.print("Caja " + idCaja + ": ");
        for (int c: cola) {
            System.out.print( c + " ");
        }
        System.out.println();
    }

}
