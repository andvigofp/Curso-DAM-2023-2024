package org.andres.Boletin4.SuperMercadoMarket;

import java.util.Random;

public class Caja {
    private static final int MAX_TIME = 1000;
    class ClienteCola {
        int idCliente;
        ClienteCola sig;
    }

    ClienteCola inicioCola, finCola;
    int idCaja;

    public  Caja(int id) {
        inicioCola = null;
        finCola = null;
        this.idCaja = id;
    }

    private boolean estaColaVacia() {
        if (inicioCola == null)
            return true;
        else
            return false;
    }

    synchronized public void esperarEnCola (int id_Cliente) throws InterruptedException {
        //Añado el clienete a la cola de la caja
        ClienteCola nuevo;
        nuevo = new ClienteCola();
        nuevo.idCliente = id_Cliente;
        nuevo.sig = null;

        //Si la cola está vacia, lo inserto al inicio, si no lo referencia desde el último
        if (estaColaVacia()) {
            inicioCola = nuevo;
            finCola = nuevo;
        }else {
            finCola.sig = nuevo;
            finCola = nuevo;
        }
        while (inicioCola.idCliente != id_Cliente) {
            //Me bloqueo hasta que sea mi turno
            wait();
        }
    }

    synchronized public void atender(int importePago) throws InterruptedException {
        //Si he terminado de atender, vacio la cola, si no, modfico el siguiente cliente atender
        if (inicioCola == finCola) {
            inicioCola = null;
            finCola = null;
        }else {
            inicioCola = inicioCola.sig;
        }

        int tiempo_atencion = new Random().nextInt(MAX_TIME);
        Thread.sleep(tiempo_atencion);
        ResultadoTotales.ganancias += importePago;
        //Acabo de atender, y despierto al siguiente cliente esperando
        notify();
    }
    synchronized public void imprimir() {
        //Se imprimen los clientes en la cola
        ClienteCola reco = inicioCola;
        while (reco !=null) {
            System.out.print(reco.idCliente + " - ");
            reco = reco.sig;
        }
        System.out.println();
    }
}
