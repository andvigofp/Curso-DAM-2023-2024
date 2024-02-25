package Ejercicios.Ej6;

import java.util.Scanner;

/**
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia,
 * el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */
public class Ej6 {
    public static void main(String[] args) {
        //Array de 5 filas x 5 columnas
        char[][]tablero = new char[Metodos.num_MaxFila()][Metodos.num_MaxColum()];
        //Array para posicion del tablero
        int[] poscionTesoro = Metodos.colocarTesoro(tablero);
        //Para colocar las minas dentro de un tablero
        Metodos.colocarMinas(tablero);
        //Variables de tipo boolean(true, false) y tipo entero
        boolean encontrado;
        int fila, columna;
        //Mensaje bienvenido
        System.out.println("¡Bienvenido a busca del tesoro!");
        //leer por teclado
        Scanner teclado = new Scanner(System.in);

        encontrado = false;
        //Bucle while, sigue el bucle hasta que encuentres el tesoro
        while (!encontrado) {
            System.out.println("Introduzca la fila (0-4)");
            fila = teclado.nextInt();
            System.out.println("Introduzca la columna (0-4)");
            columna = teclado.nextInt();
            if(fila>=0 && fila <=4 && columna>=0 && columna<=4) {
                encontrado = Metodos.buscarTesoro(fila, columna, poscionTesoro, tablero);
            }else {
                System.out.println("Fila o clumna fuera de rango . Introduzca valores entre 0 y 4 ");
            }
        }


    }
}
