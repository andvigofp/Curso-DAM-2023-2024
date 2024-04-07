package CincoHilos;

public class Principal {
    private static int contador = 0;

    public static void main(String[] args) {
        //Crear 5 hilos
       Thread[] h1  = new Thread[5];


       for (int i = 0; i<h1.length; i++) {
           h1[i] = new Thread(new incrementa());
           h1[i].start();
       }

        //Esperar a que todos los hilos terminen
       for (Thread hilo: h1) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
       }
        //Imprimir el resultado final
        System.out.println("Resultado sin sincronización: " + contador);

       contador =0;

        for (int i =0; i<h1.length; i++) {
            h1[1] = new Thread(new IncrementadorSincronizado());
            h1[1].start();
        }

        // Esperar a que todos los hilos terminen
        for (Thread hilo : h1) {
            try {
                hilo.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Imprimir el resultado final con sincronización
        System.out.println("Resultado con sincronización: " + contador);
    }
    }

