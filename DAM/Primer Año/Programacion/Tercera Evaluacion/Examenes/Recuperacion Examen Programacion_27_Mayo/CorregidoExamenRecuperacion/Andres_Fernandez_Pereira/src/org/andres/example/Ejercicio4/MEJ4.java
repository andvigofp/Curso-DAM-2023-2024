package org.andres.example.Ejercicio4;

import java.util.Scanner;

public class MEJ4 {
    //Método para leer una frase
    public static String leerFrase() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intrdozuca una frase");
        return teclado.nextLine();
    }

    //Método para combrobrar si una frase es palíndromo
    public static boolean esPalindromo(String frase) {

        //Eliminar espacios en blanco y convertir a minúsucula
        String fraseProcesada = frase.replaceAll("\\s+", "").toLowerCase();

        //Verificar si la frase es igual de izquierda a derecha
        int n = fraseProcesada.length();
        for (int i = 0; i < n / 2; i++) {
            if (fraseProcesada.charAt(i) != fraseProcesada.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
