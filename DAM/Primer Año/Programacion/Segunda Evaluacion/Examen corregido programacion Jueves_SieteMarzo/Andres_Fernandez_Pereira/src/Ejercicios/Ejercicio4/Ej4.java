package Ejercicios.Ejercicio4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables de tipo entero
        int filas, columnas;
        //Para pedir al usario de cuanto va ser el tamaño de la fila y columna
        filas = MetodoEj4.pedirFilas(teclado);
        columnas = MetodoEj4.pedirColumna(teclado);
        //Array de un tamaño de filas y columnas que pusiera el usuario por teclado
        int[][] numeros = new int[filas][columnas];
        //Introdir vaores por teclado
        MetodoEj4.introducirValoresMatriz(teclado,numeros);
        //Mostrar el resultado del array
        MetodoEj4.mostrarArray(numeros);
        //Mostrar los valores que sean mayores ue cero, menor que cero o igual que cero
        MetodoEj4.contarValoresMatriz(numeros);
    }
}
