package Ejercicios.Ej11;

import java.util.Scanner;

/**
 * Cadena espejo. Crea un programa que reciba una cadena de caracteres y la devuelva invertida
 * con efecto espejo, esto es, se concatena a la palabra original su inversa, compartiendo la
 * última letra, que hará de espejo, por lo que la palabra obtenida se lee igual hacia adelante que
 * hacia atrás. Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al introducir
 * “goma” devolverá “gomamog”
 */
public class Ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir al usuario una cadena de caracteres
        String cadena = MEj11.solicitarCadena(teclado, "Introduzca una cadena de caracteres: ");

        //Obtener la cadena espejo
        String cadenaEspejo = MEj11.obtnercadenaEspejo(cadena);

        //Mostrar el resultado
        System.out.println("La cadena espejo es: " + cadenaEspejo);

        teclado.close();
    }
}
