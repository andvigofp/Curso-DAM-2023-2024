package org.example.CalcularMedia;

public class Hilo extends Thread{
   private int [] aray;
   private int inicio;
   private int fin;
   private double media;

    public Hilo(int[] aray, int inicio, int fin) {
        this.aray = aray;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        calcularMedia();
    }

    private void calcularMedia() {
        double suma=0;
        for (int i= inicio; i<fin; i++) {
            suma += aray[i];
        }
        media = suma/(fin-inicio);
    }

    public double getMedia() {
        return media;
    }


}
