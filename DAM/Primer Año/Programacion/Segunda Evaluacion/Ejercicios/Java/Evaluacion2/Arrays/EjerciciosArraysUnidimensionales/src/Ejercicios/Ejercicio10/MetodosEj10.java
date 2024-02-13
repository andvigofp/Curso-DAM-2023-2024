package Ejercicios.Ejercicio10;

import java.util.Random;

public class MetodosEj10 {

    public static int[] generarNumerosAleatorios(Random random, int longitud, int maximo) {
        int[] numeros = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            numeros[i] = random.nextInt(maximo + 1);
        }
        return numeros;
    }

    public static void separarParesImpares(int[] numeros, int[] pares, int[] impares, int contadorPares, int contadorImpares) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[contadorPares] = numeros[i];
                contadorPares++;
            } else {
                impares[contadorImpares] = numeros[i];
                contadorImpares++;
            }
        }
    }

    public static void reorganizarArray(int[] numeros, int[] pares, int[] impares, int contadorPares, int contadorImpares) {
        for (int i = 0; i < contadorPares; i++) {
            numeros[i] = pares[i];
        }

        for (int i = 0; i < contadorImpares; i++) {
            numeros[contadorPares + i] = impares[i];
        }
    }

    public static void mostrarArrayConClasificacion(int[] numeros, int contadorPares) {
        System.out.println("Números reorganizados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " | ");
            if (i < contadorPares) {
                System.out.println(" PAR ");
            } else {
                System.out.println(" IMPAR ");
            }
        }
    }

    //Método para contar elementos no cero en un array
    public static int contarElementosNoCero(int[] numero) {
        int contador = 0;
        for (int valor : numero) {
            if (valor != 0) {
                contador++;
            }
        }
        return contador;
    }
}
