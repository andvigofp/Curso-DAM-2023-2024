package Boeltin1.FicherosTexto;

public class LanzadorHilos {

    public static void lanzarHilos(String[] archivos) {
        //Crear un hilo por cada archivo
        Thread[] hilos = new Thread[archivos.length];
        for (int i = 0; i < archivos.length; i++) {
            hilos[i] = new Thread(new ContadorCaracteresConHilos(archivos[i]));
            hilos[i].start();
        }

        //Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


