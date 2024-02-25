package org.example.HiloCincoVeces;

public class Main {
    public static void main(String[] args) {
        //Crear 5 hilos
        for (int i=0; i<5; i++) {
            Hilo h1 = new Hilo();
            h1.start();
        }
    }
}
