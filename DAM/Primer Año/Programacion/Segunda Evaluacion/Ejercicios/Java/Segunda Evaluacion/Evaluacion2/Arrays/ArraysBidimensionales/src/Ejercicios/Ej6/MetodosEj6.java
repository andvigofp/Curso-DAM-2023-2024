package Ejercicios.Ej6;

import java.util.Random;

public class MetodosEj6 {
    //Método para número de fila de un arary
    public static int num_MaxFila() {
        return 5;
    }

    //Métdo para número de columna de un array
    public static int num_MaxColum() {
        return 5;
    }
    public static int[] colocarTesoro(char[][] tablero) {
        Random random = new Random();
        int fila = random.nextInt(num_MaxFila());
        int columna = random.nextInt(num_MaxColum());
        tablero[fila][columna] = 'T';
        return new int[]{fila,columna};
    }

    //Método para color minas por el escenario
    public static void colocarMinas(char[][] tablero) {
        Random random = new Random();
        for (int i=0; i<3; i++) {
            int fila = random.nextInt(num_MaxFila());
            int columna = random.nextInt(num_MaxColum());
            while (tablero[fila][columna] != '\u0000' && tablero[fila][columna] !='T') {
                fila = random.nextInt(num_MaxFila());
                columna = random.nextInt(num_MaxColum());
            }
            tablero[fila][columna] = 'M';
        }
    }

    //método para buscar el tesoro, si hay una mina cerca que avise, si aciertas que den  un mensaje felicidades
    public static boolean buscarTesoro(int fila, int columna, int[] posicionTesoro, char[][] tablero) {
        if (tablero[fila][columna] == 'M') {
            System.out.println("!Cuidado! ¡Hay una mina aquí!");
        }else if (tablero[fila][columna] == 'T') {
            System.out.println("¡Felicidades! ¡Has encontrado el tesoro! ");
            return true;
        }else {
            //Math.abs() para calcular la distancia absoluta entre las coordenadas.
            int distanciaFila = Math.abs(fila - posicionTesoro[0]);
            int distanciaColumna = Math.abs(columna - posicionTesoro[1]);
            if (distanciaFila <= 1 && distanciaColumna <=1) {
                System.out.println("¡Cuiado! ¡Hay una mina cerca!");
            }else {
                System.out.println("No hay nada aquí. Sigue buscando.");
            }
        }
        return false;
    }

}

