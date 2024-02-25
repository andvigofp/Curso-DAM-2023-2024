package Ejercicios.Ej2;

import java.util.Scanner;

public class Metodos {

    //Método para número de fila de un arary
    public static int num_MaxFila() {
        return 4;
    }

    //Métdo para número de columna de un array
    public static int num_MaxColum() {
        return 5;
    }

    //Método para pedir número por teclado
    public static void pedirNumero(Scanner teclado, int[][] numeros) {
        int fila, columna;
        int totalPosiciones, poscionesRestantes;

        totalPosiciones = num_MaxFila()*num_MaxColum(); //Total de posiciones en la matriz
        poscionesRestantes = totalPosiciones; //Inicialmente todas las posiciones están vacías


        System.out.println("Por favor, introduzca los números (enteros) en el array");
        for (fila = 0; fila < num_MaxFila(); fila++) {
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                numeros[fila][columna] = teclado.nextInt();
                poscionesRestantes--; //// Reducir el contador de posiciones restantes
                System.out.println("Quedan " + poscionesRestantes + " posiciones por completar ");
            }
        }

    }

    //Método para sumaFila
    public static void sumaFila(int[][] numeros) {

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila, fila, columna;
        for (fila = 0; fila < num_MaxFila(); fila++) {
            sumaFila = 0;
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.printf("%7d   ", numeros[fila][columna]);
                sumaFila += numeros[fila][columna];
            }
            System.out.printf("|%7d fila%3d\n", sumaFila, fila);
        }
    }


    //Método para sumaColumna y Total
    public static void sumaTotal(int[][] numeros) {
        int sumaTotal=0, sumaColumna, fila, columna;
        // Muestra las sumas parciales de las columnas
        for(columna = 0; columna < num_MaxColum(); columna++) {
            System.out.print("----------------------------------------");
        }
        System.out.println("------------------------------------------");

        //Suma columna
        for(columna = 0; columna < num_MaxColum(); columna++) {
            sumaColumna = 0;
            for(fila = 0; fila < num_MaxFila(); fila++) {
                sumaColumna += numeros[fila][columna];

            }
            //Suma total de columna
            sumaTotal += sumaColumna;
            System.out.printf("%7d |columna%1d  ", sumaColumna, columna);
        }
        System.out.printf("|TOTAL|%7d  ", sumaTotal);
    }
    }



