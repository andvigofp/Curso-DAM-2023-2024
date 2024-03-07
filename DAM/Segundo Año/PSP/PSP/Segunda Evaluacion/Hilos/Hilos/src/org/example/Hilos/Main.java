package org.example.Hilos;

import org.example.Hilos.Hilo1;
import org.example.Hilos.Hilo2;

public class Main {
    public static void main(String[] args) {
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        h1.start();
        h2.start();
    }
}