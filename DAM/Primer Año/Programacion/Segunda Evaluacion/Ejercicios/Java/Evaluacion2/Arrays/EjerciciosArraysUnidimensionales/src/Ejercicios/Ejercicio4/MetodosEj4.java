package Ejercicios.Ejercicio4;

import java.util.Random;

public class MetodosEj4 {

    //Métdo para lanzar números aleatorios con Random
    public static void numerosRandom(int numeros[],int maximo) {
        Random random = new Random();

        for (int i=0; i<numeros.length; i++) {
            numeros[i] = random.nextInt(maximo+1);
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
