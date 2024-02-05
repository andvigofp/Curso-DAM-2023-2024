package Ejercicios.Ejercicio15;

public class VariablesTipoChar {
    public static void main(String[] args) {
        /**
         * Escribe un programa que declare 5 variables de tipo char. A continuación, crea otra
         * variable como cadena de caracteres y asígnale como valor la concatenación de las
         * anteriores 5 variables. Por último, muestra la cadena de caracteres por pantalla
         * ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
         */
        //Variables tipo char
        char caracter1, caracter2, caracter3, caracter4, caracter5;
        //Para dejar fijo las lectras por caracter
        caracter1 = 'H';
        caracter2 = 'e';
        caracter3 = 'l';
        caracter4= 'l';
        caracter5 = 'o';
        //Si creas una variable tipo String, al intentar guardar  valores tipo char, no te deja
        //String cadena = caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
        //Primera solución poner un caracter en blanco
        String cadena1 = "" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
        //Segunda solución convertir caracter tipo char a String (Charater.toString)
        String cadena2 =Character.toString(caracter1) + Character.toString(caracter2) + Character.toString(caracter3) +Character.toString(caracter4) + Character.toString(caracter5);
        //Imprime el resultado por pantalla
        System.out.println("Primera solución cadena en blanco: " + cadena1);
        //Imprime el resultado por pantalla
        System.out.println("Segunda solución convertir char a String: " + cadena2);
    }
}
