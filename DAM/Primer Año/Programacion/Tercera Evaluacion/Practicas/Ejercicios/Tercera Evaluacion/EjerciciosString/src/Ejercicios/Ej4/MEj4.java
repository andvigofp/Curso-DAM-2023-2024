package Ejercicios.Ej4;

import java.util.Scanner;

public class MEj4 {
//Método para solicitar una cadena de caracteres al usuario
public static String solicitarCadena(Scanner teclado) {
    System.out.println("Ingrese una cadena de carácetres");
    return teclado.nextLine();
}

//Método para solicitar un caracter al usuario
public static char solicitarCaracter(Scanner teclado)  {
    System.out.println("Ingrese un caracter  a contar: ");
    return teclado.next().charAt(0);
}

//Método para contar el número de veces que aparece un caracter en una cadena
public static int contarCaracter(String cadena, char caracter) {
    int contador=0;
    for (int i=0;  i<cadena.length(); i++) {
        if (cadena.charAt(i)==caracter) {
            contador++;
        }
    }
    return contador;
}
}
