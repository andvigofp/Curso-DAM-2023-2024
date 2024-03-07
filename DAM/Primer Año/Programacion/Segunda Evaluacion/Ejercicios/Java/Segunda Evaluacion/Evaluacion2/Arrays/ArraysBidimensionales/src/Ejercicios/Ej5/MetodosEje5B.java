package Ejercicios.Ej5;

import java.util.Random;

public class MetodosEje5B {

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

      boolean[][] numerosGenerados = new boolean[num_MaxFila()][num_MaxColum()]; //Para almacenar los números que ya han sido generados

        System.out.println("Números Aleatorios");
        for (fila = 0; fila < num_MaxFila(); fila++) {
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");

                boolean generado=false;

                while (!generado) {
                    int numeroproVisional = random.nextInt(900) +100;

                    if (!numerosGenerados[fila][columna]) {
                        numerosGenerados[fila][columna]=true; //Agregar el número al conjunto de números generados
                        numeroAleatorio = numeroproVisional;
                        generado=true;

                        numeros[fila][columna] = numeroAleatorio; //Verificar si el número ya ha sido generado
                    }
                }

            }
        }

    }

    //Método para sumaFila
    public static void sumaFila(int[][] numeros)  {

        // Muestra los datos y las sumas parciales de las filas
        int sumaFila, fila, columna;
        for (fila = 0; fila < num_MaxFila(); fila++) {
            sumaFila = 0;
            for (columna = 0; columna < num_MaxColum(); columna++) {
                System.out.printf("%7d   ", numeros[fila][columna]);
                sumaFila += numeros[fila][columna];
            }
            try {
                Thread.sleep(1000); // Retardo de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.printf("|%7d fila%3d\n", sumaFila, fila);

        }
    }


    //Método para sumaColumna y Total
    public static void sumaTotal(int[][] numeros)  {
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
            try {
                Thread.sleep(1000); // Retardo de 1 segundo
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.printf("|TOTAL|%7d  ", sumaTotal);
    }
}


