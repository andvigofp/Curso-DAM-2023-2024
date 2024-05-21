package org.andres.example.Ejercicio5.Colecciones;

import org.andres.example.Ejercicio5.Colecciones.MEJ5;

import java.util.Scanner;

/**
 * Escribir un programa que pida el nombre completo al usuario y lo muestre sin vocales (mayúsculas,minúsculas
 * y acentuadas). Por ejemplo, “Álvaro Pérez” se mostrará “lvr Prz”
 */
public class Ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MEJ5 metodos = new MEJ5();
        //Pedir al usuario el nombre completo
        String nombreCompleto = metodos.peditNombreCompleto(teclado);

        // Eliminar vocales y mostrar el resultado
        String nombreSinVocales = metodos.eleminarVocales(nombreCompleto);
        System.out.println("Nombre sin vocales: " + nombreSinVocales);
    }
}
