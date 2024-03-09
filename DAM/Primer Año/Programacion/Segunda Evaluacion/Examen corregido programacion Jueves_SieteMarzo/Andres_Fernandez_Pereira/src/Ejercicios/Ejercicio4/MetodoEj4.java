package Ejercicios.Ejercicio4;

import java.util.Scanner;

public class MetodoEj4 {

    //Método para pedir la fila al usuario
    public static int pedirFilas(Scanner teclado) {
        System.out.println("Ingrese el número  de filas de la matriz");
        return teclado.nextInt();
    }

    //Método para pedir la columna al usuario
    public static int pedirColumna(Scanner teclado) {
        System.out.println("Ingrese el número de columnas de la matriz:");
        return teclado.nextInt();
    }

    //Método para introdicir valores del array
    public static void introducirValoresMatriz(Scanner teclado, int[][] numeros) {
        for (int fila=0; fila<numeros.length; fila++) {
            for (int columna=0; columna<numeros[fila].length; columna++) {
                System.out.println("Ingrese el valor para la psoción [" + fila + "][" + columna + "]:");
                numeros[fila][columna] = teclado.nextInt();
            }
        }
    }

    //Método para mostrar el resultado del array
    public static void mostrarArray(int[][] numeros) {
        for (int fila=0; fila<numeros.length; fila++) {
            for (int columna=0; columna<numeros[fila].length; columna++) {
                System.out.print(numeros[fila][columna] + "\t ");
            }
            System.out.println();
            System.out.println("----------------------------");
        }
    }

    //Método para contarValores dentro de un array, si es mayor que cero, menor que cero o igual que cero
    public static void contarValoresMatriz(int[][] numeros) {
        int mayorCero =0, menorescero=0, igualCero=0;
        for (int fila=0; fila<numeros.length; fila++) {
            for (int columna=0; columna<numeros[fila].length; columna++) {
                int auxiliar = numeros[fila][columna];
                if (auxiliar>0) {
                    mayorCero++;
                }else if (auxiliar<0) {
                    menorescero++;
                }else {
                    igualCero++;
                }
            }
        }
        System.out.println("Cantidad de valores mayores que cero: " + mayorCero);
        System.out.println("Cantidad de valores menores que cero: " + menorescero);
        System.out.println("Cantidad de valores iguales a cero: " + igualCero);
    }
 }
