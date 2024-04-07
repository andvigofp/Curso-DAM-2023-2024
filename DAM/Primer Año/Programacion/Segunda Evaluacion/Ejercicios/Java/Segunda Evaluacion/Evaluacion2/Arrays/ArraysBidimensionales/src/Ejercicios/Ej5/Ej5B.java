package Ejercicios.Ej5;

import Ejercicios.Ej4.MetodosEj4;

public class Ej5B {
    /**
     * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
     */

    public static void main(String[] args) throws InterruptedException {
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[MetodosEje5B.num_MaxFila()][MetodosEje5B.num_MaxColum()];

        //Para pedir al usuario por teclado
        MetodosEje5B.generarNumerosAleatorios(numeros);

        System.out.println();
        //Suma por cada fila
        MetodosEje5B.sumaFila(numeros);
        //SumaTotal columnas
        MetodosEje5B.sumaTotal(numeros);

    }
}
