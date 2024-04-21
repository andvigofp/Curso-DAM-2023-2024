package org.andres.Boletin4.parking;

public class Barrera {
    private int plazas[];
    private int n_plazas;
    private int libres;

    Barrera(int N) {
        n_plazas = N;
        plazas = new int[N];
        //Inializado parking
        for (int i=0; i<n_plazas; i++) {
            plazas[i] =0;
        }
        libres = n_plazas;
    }

    synchronized public int entradaCoches(int coche) throws InterruptedException {
        int plaza=0;
        imprimirEstadoParking();
        //El coche espera a que haya plazas para entrar
        while (libres==0) {
            System.out.println("coche " + coche + " esperando");
            wait();
        }

        while (plazas[plaza] !=0) {
            plaza++;
        }

        plazas[plaza] = coche;
        libres--;
        return plaza;
    }

    synchronized public void saleCoche(int plaza) {
        plazas[plaza] =0;
        libres++;
        notify();
    }

    public void imprimirEstadoParking() {
        System.out.println("Parking: ");
        for (int i=0; i<n_plazas; i++) {
            System.out.print("[" + plazas[i] + "] ");
        }
        System.out.println();
    }
}
