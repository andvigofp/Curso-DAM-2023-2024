package Ejercicios.Ejercicio13;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    /**
     *Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios
     * comprendidos entre 0 y 500 (ambos incluidos). A continuación, el programa mostrará el array y
     * preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el
     * array escribiendo el número destacado entre dobles asteriscos.
     */
    public static void main(String[] args) {
            //Leer por teclado
            Scanner teclado = new Scanner(System.in);
            //Para generar números aleatorios
            int[] array = MetodosEj13.generarNumerosAleatorios(100, 500);

             //Mostrar el resultado del array original
            System.out.println("Array original:");
            MetodosEj13.mostrarArray(array);

            //Pedir al usuario que número de rango quieres destagar mínimo o máximo
            System.out.println("\n¿Qué quieres destacar? (1 - mínimo, 2 - máximo)");
            int opcion = teclado.nextInt();

            //Condición si eleiges la opción 1 destacará mínimo o si eliges opción destarará el máximo
            if (opcion == 1) {
                int minimo = MetodosEj13.encontrarMinimo(array);
                System.out.println("\nArray con el número mínimo destacado:");
                MetodosEj13.mostrarArrayConDestacado(array, minimo);
            } else if (opcion == 2) {
                int maximo = MetodosEj13.encontrarMaximo(array);
                System.out.println("\nArray con el número máximo destacado:");
                MetodosEj13.mostrarArrayConDestacado(array, maximo);
            } else {
                System.out.println("Opción no válida. Saliendo del programa.");
            }
        }
    }
