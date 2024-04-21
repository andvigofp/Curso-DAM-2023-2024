package org.andres.Boletin4.SuperMercadoLinkedList;

import org.andres.Boletin4.SuperMercadoMarket.ResultadoTotales;

import java.util.LinkedList;
import java.util.Random;

public class Caja {
    private static final int MAX_TIME = 1000;

    LinkedList<Integer> cola = new LinkedList<>();
    int idCaja;

    public Caja(int id) {
        this.idCaja = id;
    }

    private boolean estadoColaVacia() {
        if (cola.size() ==0)
            return true;
        else
            return false;
    }

    synchronized public void esperandoEncCola(int idCliente) throws InterruptedException {
        //Añado  el cleinte a la cola de la caja
        cola.addLast(idCliente);

        while (cola.peek() != idCliente) {
            //Me bloqueo hasta que se mi turno
            wait();
        }

    }

    synchronized public void atender(int importePago) throws InterruptedException {
        //Si ha terminado de atender, vacio la cola, si no, modifico el siguiente cliente a atender
        cola.removeFirst();
        int tiempoAtencion = new Random().nextInt(MAX_TIME);
        Thread.sleep(tiempoAtencion);
        ResultadoTotales.ganancias +=importePago;
        //Acabo de atender, y despierto  al sigiente cliente esperando
        notify();
    }

    synchronized public void imprimir() {
        //Se imprimen los clientes en la cola
        System.out.print("Caja " + idCaja + ": ");
        for (int c: cola) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
