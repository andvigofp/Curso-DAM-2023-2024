package org.andres.example.Ejercicio5.Colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MEJ5 {
    private static final Set<Character> VOCALES = new HashSet<>();

    static {
        char[] vocalesArray = {'a', 'e', 'i', 'o', 'u', 'á', 'é', 'í', 'ó', 'ú',
                'A', 'E', 'I', 'O', 'U', 'Á', 'É', 'Í', 'Ó', 'Ú'};

        for (char vocal : vocalesArray) {
            VOCALES.add(vocal);
        }
    }
    //Método para pedir el nombre al usuario
    public  String peditNombreCompleto(Scanner teclado) {
        System.out.println("Ingrese su nombre completo");
        return teclado.nextLine();
    }

    //Método para eleminar las vocales
    public String eleminarVocales(String input) {
        StringBuilder resultado = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!VOCALES.contains(c)) {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }
}
