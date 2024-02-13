package Ejercicios.Ejercicio17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = MetdodosEj17.generarArrayAleatorio(random, 10, 0, 100);
        MetdodosEj17.mostrarArray("Array generado:", array);

        int numero = MetdodosEj17.obtenerNumeroValido(scanner, array);
        MetdodosEj17.rotarArrayHastaPosicionCero(array, numero);
        MetdodosEj17.mostrarArray("Array rotado con el número " + numero + " en la posición 0:", array);

    }
}