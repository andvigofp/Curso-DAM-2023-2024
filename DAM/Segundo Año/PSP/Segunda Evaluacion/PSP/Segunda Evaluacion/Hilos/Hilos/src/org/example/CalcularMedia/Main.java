package org.example.CalcularMedia;

public class Main {
    public static void main(String[] args) {
        //Crear un array de 1000 posiciones con valores del 1 al 1000
        int[] array = new int[1000];
        for (int i=0; i<1000; i++) {
            array[i] = i+1;
        }

        // Crear y lanzar hilos para calcular medias
        Hilo Hilo1 = new Hilo(array,0,250);
        Hilo Hilo2 = new Hilo(array, 250,500);
        Hilo Hilo3 = new Hilo(array,500,750);
        Hilo Hilo4 = new Hilo(array,750,1000);

        Hilo1.start();
        Hilo2.start();
        Hilo3.start();
        Hilo4.start();

        //Esperar a que todos los hilos terminen
        try {
            Hilo1.join();
            Hilo2.join();
            Hilo3.join();
            Hilo4.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Recoger y sumar las medias
        double sumaMedia = Hilo1.getMedia() + Hilo2.getMedia() + Hilo3.getMedia() + Hilo4.getMedia();

        //Imprimir el resultado
        System.out.println("La suma de la media es: " + sumaMedia);
    }
}
