package Ejercicios.Ejercicio10;

import java.util.Random;

public class Ejercicio10 {
    /**
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los almacene en
     * un array. El programa debe ser capaz de pasar todos los números pares a las primeras posiciones del
     * array (del 0 en adelante) y todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
     * es necesario.
     */

    public static void main(String[] args) {
            //Objecto para generar números aleatorios
            Random random = new Random();
            //Generar números aleatorios
            int[] numeros = MetodosEj10.generarNumerosAleatorios(random, 20, 100);
            //Para hacer una copia axilar del array principal
            int[] pares = new int[numeros.length];
            int[] impares = new int[numeros.length];
            //Variables de tipo entero
            int contadorPares = 0;
            int contadorImpares = 0;

            // Separar los números pares e impares
            MetodosEj10.separarParesImpares(numeros, pares, impares, contadorPares, contadorImpares);

            // Actualizar los contadores de pares e impares
            contadorPares = MetodosEj10.contarElementosNoCero(pares);
            contadorImpares = MetodosEj10.contarElementosNoCero(impares);

            // Reorganizar el array
            MetodosEj10.reorganizarArray(numeros, pares, impares, contadorPares, contadorImpares);

            // Mostrar el array reorganizado
            MetodosEj10.mostrarArrayConClasificacion(numeros, contadorPares);


        }

    }
