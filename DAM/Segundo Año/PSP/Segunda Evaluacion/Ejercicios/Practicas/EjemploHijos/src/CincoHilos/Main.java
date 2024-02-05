package CincoHilos;

public class Main {
    private static int contador = 0;

    public static void main(String[] args) {
        // Crear 5 hilos
        Thread[] hilos = new Thread[5];

        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(new Incrementador());
            hilos[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimir el resultado final
        System.out.println("Resultado sin sincronización: " + contador);

        // Reiniciar el contador para la versión sincronizada
        contador = 0;

        // Crear 5 hilos con sincronización
        for (int i = 0; i < hilos.length; i++) {
            hilos[i] = new Thread(new IncrementadorSincronizado());
            hilos[i].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : hilos) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimir el resultado final con sincronización
        System.out.println("Resultado con sincronización: " + contador);
    }

    // Clase que implementa la lógica de incremento sin sincronización
    static class Incrementador implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5000; i++) {
                contador++;
            }
        }
    }

    // Clase que implementa la lógica de incremento con sincronización
    static class IncrementadorSincronizado implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5000; i++) {
                synchronized (Main.class) {
                    contador++;
                }
            }
        }
    }
}
