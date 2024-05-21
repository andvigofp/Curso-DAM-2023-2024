package org.andres.example.Ejercicio5.SinColecciones;

import java.util.Scanner;

/**
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas,minúsculas
 * y acentuadas). Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Solicitar el nombre completo al usuario
        String nombreCompleto = MEJ5.peditNombreCompleto(teclado);

        String nombreSinVocales = MEJ5.eliminarVocales(nombreCompleto);

        //Mostrar el resultado
        System.out.println("Nombre sin vocales: " + nombreSinVocales);

        teclado.close();
    }

}
