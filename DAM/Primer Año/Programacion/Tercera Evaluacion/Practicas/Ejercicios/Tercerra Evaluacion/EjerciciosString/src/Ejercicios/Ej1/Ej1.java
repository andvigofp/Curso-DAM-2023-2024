package Ejercicios.Ej1;

/**
 * Crear una cadena de caracteres e imprimir todos los caracteres que la componen. Hay que
 * utilizar el método charAt.
 */
public class Ej1 {

    public static void main(String[] args) {
        //Variable tipo string
        String st1 = "Hola Andrés";
        //B
        for (int i=0; i<st1.length(); i++) {
            System.out.println( st1.charAt(i));
        }
    }
}
