package Practicas.SumaEnteros;

/**
 * Dados dos números enteros ay b, que pueden ser positivos o negativos, encuentre la suma de todos los números enteros entre ellos e incluyéndolos y devuélvalo. Si los dos números son iguales devuelve ao b.
 *
 * Nota: ¡ a y bno están ordenados!
 *
 * Ejemplos (a, b) --> salida (explicación)
 * (1, 0) --> 1 (1 + 0 = 1)
 * (1, 2) --> 3 (1 + 2 = 3)
 * (0, 1) --> 1 (0 + 1 = 1)
 * (1, 1) --> 1 (1 since both are same)
 * (-1, 0) --> -1 (-1 + 0 = -1)
 * (-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
 * Su función sólo debe devolver un número, no la explicación sobre cómo obtiene ese número.
 */
public class Sum {


    public int GetSum(int a, int b) {
        //Si a y b son iguales, retornamos cualquiera de los dos
        if (a==b) {
            return a;
        }

        //ordenamos los números para asegurarmos de  iterar desde el más pequeño hasta el más grande
        int minimo = Math.min(a,b);
        int maximo = Math.max(a,b);

        //Iniciamos la suma
        int suma=0;

        //Iteramos desde el número más pequeñp hasta el más grande, sumando cada número
        for (int i= minimo; i<=maximo; i++) {
            suma +=i;
        }

        return suma;
    }
}