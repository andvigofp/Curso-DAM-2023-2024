package org.andres.example.Examen.Ejercicio5;

import java.util.Scanner;

/**
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas,minúsculas
 * y acentuadas). Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreCompleto = MEJ5.pedirNombre(teclado);

        String nombreSinVocales = MEJ5.eliminarVocales(nombreCompleto);

        System.out.println("Nombre sin vocales: " + nombreSinVocales);

        teclado.close();
    }
}
