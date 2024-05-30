package org.andres.example.Ejercicio4;

import org.andres.example.Ejercicio2.MEJ2;

public class Ej4 {
    public static void main(String[] args) {
        //Leer la frase desde teclado
        String frase  = MEJ4.leerFrase();

        //Verificar sí la frase es
       if (MEJ4.esPalindromo(frase)) {
           System.out.println("Es palindromo: ");
       }else {
           System.out.println("No es palindromo");
       }
    }
}
