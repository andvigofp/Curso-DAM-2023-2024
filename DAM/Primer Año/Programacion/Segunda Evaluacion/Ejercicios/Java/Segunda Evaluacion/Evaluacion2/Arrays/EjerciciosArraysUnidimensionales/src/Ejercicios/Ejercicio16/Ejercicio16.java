package Ejercicios.Ejercicio16;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    /**
     * Escribe un programa que rellene un array de 20 elementos con números enteros aleatorios
     * comprendidos entre 0 y 400 (ambos incluidos). A continuación, el programa mostrará el array y
     * preguntará si el usuario quiere resaltar los múltiplos de 5 o los múltiplos de 7. Seguidamente se
     * volverá a mostrar el array escribiendo los números que se quieren resaltar entre corchete
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        MetodoEj16 metodos = new MetodoEj16();

        // Realizar todas las operaciones llamando a métodos de la clase ResaltarMultiplosMetodos
        metodos.realizarOperaciones(teclado, random);
    }
}