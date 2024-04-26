package org.andres.example.Ejercicio4;

import java.util.ArrayList;

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar palabras en
 * lugar de números.
 */
public class Ej4 {
    public static void main(String[] args) {
        ArrayList<String> lista = MEj4.generarListaPalabrasAleatorias();
        System.out.println("Lista generada: " + lista);

        double longitudPromedio = MEj4.calcularLongitudPromedio(lista);
        String palabraMasLarga = MEj4.encontrarPalabraMasLarga(lista);
        String palabraMasCorta = MEj4.encontrarPalabraMasCorta(lista);

        System.out.println("Longitud promedio: " + longitudPromedio);
        System.out.println("Palabra más larga: " + palabraMasLarga);
        System.out.println("Palabra más corta: " + palabraMasCorta);
    }
}
