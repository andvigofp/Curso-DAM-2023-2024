package Ejercicios.Ej5;

import Ejercicios.Ej4.Metodos;

public class Ej5 {
    /**
     * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
     */

    public static void main(String[] args) throws InterruptedException {
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[Ejercicios.Ej5.Metodos.num_MaxFila()][Ejercicios.Ej5.Metodos.num_MaxColum()];

        //Para pedir al usuario por teclado
        Ejercicios.Ej5.Metodos.generarNumerosAleatorios(numeros);

        System.out.println();
        //SumaFila
        Ejercicios.Ej5.Metodos.sumaFila(numeros);
        //SumaTotañ
        Metodos.sumaTotal(numeros);

    }
}
