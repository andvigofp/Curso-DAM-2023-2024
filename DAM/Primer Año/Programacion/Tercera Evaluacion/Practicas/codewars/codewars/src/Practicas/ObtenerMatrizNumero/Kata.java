package Practicas.ObtenerMatrizNumero;

/**
 * Escriba un método que obtenga una matriz de números enteros como parámetro y procese cada número de esta matriz.
 *
 * Devuelve una nueva matriz procesando cada número de la matriz de entrada de esta manera:
 *
 * Si el número tiene una raíz cuadrada entera, se toma esta; de lo contrario, se eleva el número al cuadrado.
 *
 * Ejemplo
 * [4,3,9,7,2,1] -> [2,9,3,49,4,1]
 * Notas
 * La matriz de entrada siempre contendrá solo números positivos y nunca estará vacía o nula.
 */
public class Kata {
    public static int[] squareOrSquareRoot(int[] array) {
        //Creamos una matriz para almacenar los resultados procesados
        int[] result = new int[array.length];

        //Iteramos sobre cada número en la matriz de entrada
        for (int i = 0; i < array.length; i++) {
            //Calculamos la raíz cuadrada del número
            double squareRoot = Math.sqrt(array[i]);
            //Verificamos si la raíz cuadrada es un número entero
            //Si es un número entero, almacenamos la raíz cuadrada en el resultado
            //Si no es un número entero, elevamos el número al cuadrado y lo almacenamos en el resultado
            result[i] = (squareRoot == (int)squareRoot) ? (int)squareRoot : array[i] * array[i];
        }
        //Retornamos la matriz de resultados procesados
        return result;
    }
}