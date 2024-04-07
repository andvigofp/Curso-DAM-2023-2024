package Ejercicios.Ej5;

import Ejercicios.Ej4.MetodosEj4;

public class Ej5 {
    /**
     * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
     */

    public static void main(String[] args) throws InterruptedException {
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[MetodosEj5A.num_MaxFila()][MetodosEj5A.num_MaxColum()];

        //Para pedir al usuario por teclado
        MetodosEj5A.generarNumerosAleatorios(numeros);

        System.out.println();
        //Sumar por cada fila
        MetodosEj5A.sumaFila(numeros);
        //SumaTotal columna
        MetodosEj5A.sumaTotal(numeros);

    }
}
