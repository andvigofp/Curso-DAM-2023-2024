package org.andres.example.Ejercicio5.SinColecciones;

import java.util.Scanner;

public class MEJ5 {
    //Método para pedir el nombre al usuario
    public static String peditNombreCompleto(Scanner teclado) {
        System.out.println("Ingrese su nombre completo");
        return teclado.nextLine();
    }

    //Método para eliminar las vocales de una cadena
    public static String eliminarVocales(String cadena) {
        //Expresión regular que inguye todas las vocales (mayúscula, monúscula y acentuadas)
        String vocales = "[aeiouáéíóúüAEIOUÁÉÍÓÚÜ]";

        //Remplazar las vocales con una cadena vacía
        return cadena.replaceAll(vocales, "");
    }
}
