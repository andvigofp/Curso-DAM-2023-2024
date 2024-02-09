package Ejercicios.Ejercicio4;

import java.util.Random;

public class Ejercicio4 {
    /**
     * Define tres arrays de 20 números enteros cada una, con nombres número, cuadrado y cubo. Carga el
     * array número con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
     * cuadrados de los valores que hay en el array número. En el array cubo se deben almacenar los cubos
     * de los valores que hay en número. A continuación, muestra el contenido de los tres arrays dispuesto
     * en tres columnas.
     */

    public static void main(String[] args) {
        Random random = new Random();

        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];


        //Para que de números aleatorios
        numerosRandom(numero);
        //Para calcular un número a su cuadrado
        numeroCuadrado(numero, cuadrado);
        //Para calcular un número a su cubo
        numeroCubo(numero, cubo);
        //Mostrar el resultado
        resultado(numero,cubo,cuadrado);


    }

    //Métdo para lanzar números aleatorios con Random
    public static void numerosRandom(int numeros[]) {
        Random random = new Random();

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }
    }

    //Método para calcular los numeros de un array al cuadrado
    public static void  numeroCuadrado(int numeros[], int cuadrado[]) {
        for (int i=0; i<numeros.length; i++) {
            cuadrado[i] = (int) (Math.pow(numeros[i],2));
        }
    }

    //Método para calcular los numeros de un array al cubo
    public static void numeroCubo(int numeros[], int cubo[]) {
        for (int i=0; i < numeros.length; i++) {
            cubo[i] = (int) (Math.pow(numeros[i],3));
        }
    }

    //Métdod para mostrar los resultados de los números aleatorios, cuarado y cubo
    public static void resultado(int numeros[], int cubo[], int cuadrado[]) {
        System.out.println("\tNúmero\tCuadrado\tCubo \n" +
                "------------------------------");

        for (int i=0; i<numeros.length; i++)  {
            System.out.printf("%6d\t%8d\t%6d\n", numeros[i], cuadrado[i], cubo[i]);
        }

    }
}
