package org.andres.example.Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class Ej12 {
    public static void main(String[] args) {
        List<Cartas> mano = MEJ12.generarMano();
        MEJ12.mostrarCartas(mano);
        int totalPuntos = MEJ12.calcularPuntos(mano);
        System.out.println("Tienes " + totalPuntos + " puntos.");
    }
}
