package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class Ej2_ArraySort {
    /**
     * Necesitamos crear un programa para mostrar el rating de los 8 jugadores de un torneo de ajedrez. Primero
     * se le pedirá al usuario que introduzca el rating de todos los jugadores (habitualmente valores entre 1000 y
     * 2800, de tipo entero) y luego muestre el rating en orden descendente (de la más alta a la más baja). Se podrá
     * utilizar el método de ordenación de la clase Array. Puedes emplear el método sort().
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Array de números con una longitud de 8
        int[] numero = new int[MetodoEj2_ArraySort.longitud()];
        //Para pedr al usuario que ponga el raking de 0-7 posciones
        MetodoEj2_ArraySort.ingresarRaking(teclado,numero);
        //Para ordenar el raking con Array.sort() de mayor a menor
        MetodoEj2_ArraySort.ordenarRaking(numero);
        //Para mostrar el resultado del raking
        MetodoEj2_ArraySort.mostrarRaking(numero);
    }
}
