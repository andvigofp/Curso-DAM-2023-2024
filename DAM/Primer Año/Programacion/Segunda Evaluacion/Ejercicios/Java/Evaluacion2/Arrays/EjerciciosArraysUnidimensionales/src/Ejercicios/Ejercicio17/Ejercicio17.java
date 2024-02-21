package Ejercicios.Ejercicio17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio17 {
    /**
     *Escribe un programa que muestre por pantalla un array de 10 números enteros generados al azar
     * entre 0 y 100. A continuación, el programa debe pedir un número al usuario. Se debe comprobar que
     * el número introducido por teclado se encuentra dentro del array, en caso contrario se mostrará un
     * mensaje por pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
     * correctamente. A continuación, el programa rotará el array hacia la derecha las veces que haga falta
     * hasta que el número introducido quede situado en la posición 0 del array. Por último, se mostrará el
     * array rotado por pantalla.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int[] array = MetdodosEj17.generarArrayAleatorio(random, 10, 0, 100);
        MetdodosEj17.mostrarArray("Array generado:", array);

        int numero = MetdodosEj17.obtenerNumeroValido(teclado, array);
        MetdodosEj17.rotarArrayHastaPosicionCero(array, numero);
        MetdodosEj17.mostrarArray("Array rotado con el número " + numero + " en la posición 0:", array);

    }
}