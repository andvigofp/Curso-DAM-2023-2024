package Ejercicios.Ej6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia,
 * el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */
public class Ej6 {
    public static void main(String[] args) {
        //Array de 5 filas x 5 columnas
        char[][] tablero = new char[MetodosEj6.num_MaxFila()][MetodosEj6.num_MaxColum()];
        //Array para posicion del tablero
        int[] poscionTesoro = MetodosEj6.colocarTesoro(tablero);
        //Para colocar las minas dentro de un tablero
        MetodosEj6.colocarMinas(tablero);
        //Variables de tipo boolean(true, false) y tipo entero
        boolean encontrado;
        int fila, columna;
        //Mensaje bienvenido
        System.out.println("¡Bienvenido a busca del tesoro!");
        //leer por teclado
        Scanner teclado = new Scanner(System.in);

        encontrado = false;
        //Try catch para cuando pongas algo diferente a un número por ejemplo una palabra, que salga un mensaje y termine el programa
        try {
            //Bucle while, sigue el bucle hasta que encuentres el tesoro
            while (!encontrado) {
                System.out.println("Introduzca la fila (0-4)");
                fila = teclado.nextInt();
                System.out.println("Introduzca la columna (0-4)");
                columna = teclado.nextInt();
                if (fila >= 0 && fila <= 4 && columna >= 0 && columna <= 4) {
                    encontrado = MetodosEj6.buscarTesoro(fila, columna, poscionTesoro, tablero);
                } else {
                    System.out.println("Fila o clumna fuera de rango . Introduzca valores entre 0 y 4 ");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Error. no se puede poner carácteres: " + e.getMessage());
        }finally {
            System.out.println("es opcional, pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Continuamos con el flujo a muestra a aplicación");
    }
}
