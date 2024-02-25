package Ejercicios.Ejercicio20;

import Ejercicios.Ejercicio19.MetodoEj19;

import java.util.Scanner;

public class Ejercicio20 {
    /**
     *
     * Implementa un programa que calcule la denominación ordinal de los reyes de una secuencia
     * histórica. El programa solicitará la cantidad de reyes que se van a introducir, y a continuación recibirá
     * los nombres de los reyes. Presentará por pantalla dichos nombres, pero colocándoles el ordinal
     * correspondiente. Así, por ejemplo, si hay dos Felipes en los nombres de los reyes, el primero debería
     * aparecer como Felipe 1º y el segundo como Felipe 2º.
     *
     * Ejemplo 1:
     *
     * 	Introduzca el número total de nombres de reyes: 7
     * 	Vaya intrdouciendo los nombres de los reyes y pulsando INTRO.
     * 	Felipe
     * 	Carlos
     * 	Carlos
     * 	Fernando
     * 	Carlos
     * 	Carlos
     * 	Felipe
     *
     * 	Los reyes introducidos son:
     * 	Felipe 1º
     * 	Carlos 1º
     * 	Carlos 2º
     * 	Fernando 1º
     * 	Carlos 3º
     * 	Carlos 4º
     * 	Felipe 2º
     */


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        MetodosEj20.totalReyes();
        int totalNombres = teclado.nextInt();
        teclado.nextLine(); // Consumir el salto de línea

        String[] nombresReyes =MetodosEj20.solicitarNombresReyes(teclado, totalNombres);

        MetodosEj20.mostrarNombresReyesConOrdinal(nombresReyes);
}
}
