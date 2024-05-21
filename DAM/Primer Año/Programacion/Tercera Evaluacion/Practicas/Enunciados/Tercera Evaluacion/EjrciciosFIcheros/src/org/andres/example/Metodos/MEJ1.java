package org.andres.example.Metodos;

public class MEJ1 {
    // Método que verifica si un número es primo
    public static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) { // Bucle que recorre los números desde 2 hasta numero - 1
            if ((numero % i) == 0) { // Comprueba si el número es divisible por i
                return false; // Si es divisible, devuelve falso, lo que indica que el número no es primo
            }
        }
        return true; // Si el bucle termina sin encontrar divisores, devuelve verdadero, indicando que el número es primo
    }
}
