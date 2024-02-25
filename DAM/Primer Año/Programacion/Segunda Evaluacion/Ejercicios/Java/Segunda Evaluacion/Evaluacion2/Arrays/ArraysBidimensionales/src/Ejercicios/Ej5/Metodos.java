package Ejercicios.Ej5;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


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
    public static void generarNumerosAleatorios(int[][] numeros) {
        //Numeros aleatorios
        Random random = new Random();
        int fila, columna, numeroAleatorio;

        Set<Integer> numerosgenerados = new HashSet<>(); //Para almacenar los números que ya han sido generados

        System.out.println("Números Aleatorios");
        for (fila = 0; fila < num_MaxFila(); fila++) {
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");

                do {
                    numeroAleatorio = random.nextInt(900) + 100;
                }while (numerosgenerados.contains(numeroAleatorio)); //Generar número aleatorio entre 100 y 999
                numeros[fila][columna] = numeroAleatorio; //Verificar si el número ya ha sido generado
                numerosgenerados.add(numeroAleatorio); //Agregar el número al conjunto de números generados
            }
        }

    }

    //Método para sumaFila
    public static void sumaFila(int[][] numeros) throws InterruptedException {

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila, fila, columna;
        for (fila = 0; fila < num_MaxFila(); fila++) {
            sumaFila = 0;
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.printf("%7d   ", numeros[fila][columna]);
                sumaFila += numeros[fila][columna];
            }
            Thread.sleep(1000); // Retardo de 1 segundo
            System.out.printf("|%7d fila%3d\n", sumaFila, fila);

        }
    }


    //Método para sumaColumna y Total
    public static void sumaTotal(int[][] numeros) throws InterruptedException {
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
            Thread.sleep(1000); // Retardo de 1 segundo
        }
        System.out.printf("|TOTAL|%7d  ", sumaTotal);
    }
    }



