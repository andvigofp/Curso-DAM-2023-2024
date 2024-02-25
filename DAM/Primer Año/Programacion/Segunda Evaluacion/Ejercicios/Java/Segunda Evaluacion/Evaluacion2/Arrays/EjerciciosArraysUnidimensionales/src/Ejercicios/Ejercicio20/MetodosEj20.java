package Ejercicios.Ejercicio20;

import java.util.Scanner;

public class MetodosEj20 {

    //Método para introducir el total de reyes
    public static void totalReyes() {
        System.out.print("Introduzca el número total de nombres de reyes: ");
    }

    //Método para ir intrdouciendo los nombres de los reyes
    public static String[] solicitarNombresReyes(Scanner scanner, int totalNombres) {
        String[] nombresReyes = new String[totalNombres];
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO:");
        for (int i = 0; i < totalNombres; i++) {
            nombresReyes[i] = scanner.nextLine();
        }
        return nombresReyes;
    }

    //Método para contar cuántas veces aparece cada nombre de rey
    public static void mostrarNombresReyesConOrdinal(String[] nombresReyes) {
        int[] contadorNombres = new int[nombresReyes.length];
        for (int i = 0; i < nombresReyes.length; i++) {
            String nombreActual = nombresReyes[i];
            contadorNombres[i] = 1; // Por defecto, cada nombre tiene ordinal 1º
            for (int j = 0; j < i; j++) {
                if (nombresReyes[j].equals(nombreActual)) {
                    contadorNombres[i]++;
                }
            }
        }

        //Mostrar los nombres de los reyes con su denominación ordinal
        System.out.println("\nLos reyes introducidos son:");
        for (int i = 0; i < nombresReyes.length; i++) {
            System.out.println(nombresReyes[i] + " " + obtenerOrdinal(contadorNombres[i]));
        }
    }

    //Método para obtener la denominación ordinal
    public static String obtenerOrdinal(int numero) {
        if (numero == 1) {
            return "1º";
        } else if (numero == 2) {
            return "2º";
        } else if (numero == 3) {
            return "3º";
        } else {
            return numero + "º";
        }
    }
}