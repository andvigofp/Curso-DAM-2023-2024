package org.andres.example.Examen.Ejercicio5;

import java.util.Scanner;

public class MEJ5 {
    public static String pedirNombre(Scanner teclado) {
        System.out.println("Ingrese su nombre completo: ");
        return teclado.nextLine();
    }

    public static String eliminarVocales(String cadena) {
        String vocales = "[aeiouáéíóúüAEIOUÁÉÍÓÚÜ]";

        return cadena.replaceAll(vocales, "");
    }
}
