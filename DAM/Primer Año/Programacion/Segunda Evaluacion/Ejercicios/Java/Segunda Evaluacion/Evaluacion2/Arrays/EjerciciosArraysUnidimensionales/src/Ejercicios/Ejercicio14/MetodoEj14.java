package Ejercicios.Ejercicio14;

import java.util.Scanner;

public class MetodoEj14 {

    //Método para pedir datos al usuario
    public static void pediUsario(String palabra[], Scanner teclado) {
        for (int i = 0; i < palabra.length; i++) {
            System.out.print("Ingrese la palabra " + (i) + ": ");
            palabra[i] = teclado.nextLine().trim(); // Eliminar espacios en blanco al principio y al final de la palabra
        }
    }

    public static void resultadoArrayInicial(String palabra[]) {
        //Mostrar el contenido del array junto al índice horizontalmente
        System.out.println("\nArray Incial:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < palabra.length; i++) {
            System.out.print("|\t " + i + "   ");

        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Valor ");
        for (int j = 0; j < palabra.length; j++) {
            System.out.print("\t| " + palabra[j] + " ");

        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    //Método para ostrar las palabras ingresadas con sus colores correspondientes
    public static void palabrasordenas(String palabras[], String colores[]) {
        // Mostrar las palabras ingresadas con sus colores correspondientes
        System.out.println("\nArray Final:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("|\t " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Valor ");
            for (String palabra : palabras) {
                boolean esColor = false;
                for (String color : colores) {
                    if (palabra.equalsIgnoreCase(color)) {
                        System.out.print("\t | "+palabra.substring(0, 1).toUpperCase() + palabra.substring(1) + " "); // Convertir la primera letra a mayúscula
                        esColor = true;
                        break;
                    }
                }
                if (!esColor) {
                    System.out.print("\t | "+palabra.substring(0, 1).toUpperCase() + palabra.substring(1) + " "); // Convertir la primera letra a mayúscula
                }
            }
        }
    }
