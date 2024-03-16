package Ej4_ParkingCamiones;

public class Barrera {
    private int plazas[];
    private int n_plazas;
    private int libres;

    Barrera(int N) {
        n_plazas = N;
        plazas = new int[N];
        for (int i = 0; i < n_plazas; i++) {
            plazas[i] = 0;
        }
        libres = n_plazas;
    }

    private int buscarPlazasContiguas() {
        int plaza = 0;
        do {
            if ((plazas[plaza] == 0) && (plazas[plaza + 1] == 0)) {
                return plaza;
            } else {
                plaza++;
            }
        } while (plaza < n_plazas - 1);

        return -1;
    }

    synchronized public int entraCoche(int coche) throws InterruptedException {
        int plaza = 0;
        imprimirEstadoParking();
        // Dejamos un hueco para asegurar que pueden entrar los camiones
        while (libres <= 1) {
            System.out.println("Coche " + coche + " esperando");
            wait();
        }
        while (plazas[plaza] != 0) {
            plaza++;
        }
        plazas[plaza] = coche;
        libres--;
        return plaza;
    }

    synchronized public int entrada_camion(int camion) throws InterruptedException {
        int plaza = 0;
        imprimirEstadoParking();
        // Mientras no haya plaza
        while ((plaza = buscarPlazasContiguas()) == -1) {
            System.out.println("Camion " + camion + " esperando");
            wait();
        }
        plazas[plaza] = camion;
        plazas[plaza + 1] = camion;
        libres -= 2;
        return plaza;
    }

    synchronized public void saleCoche(int plaza) {
        plazas[plaza] = 0;
        libres++;
        notifyAll();
    }

    synchronized public void salida_camion(int plaza) {
        plazas[plaza] = 0;
        plazas[plaza + 1] = 0;
        libres += 2;
        notifyAll();
    }

    public void imprimirEstadoParking() {
        System.out.print("Parking: ");
        for (int i = 0; i < n_plazas; i++) {
            System.out.print("[" + plazas[i] + "] ");
        }
        System.out.println("");
    }
}
