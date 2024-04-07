package Ejercicios.Ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

//Método para longitud de un array
public class MetodoEj3 {
    //Método para longitud del array
    public static int longitud() {
        return 1000;
    }

    //Método para generar números aleatoros utilizando Math.random
    public static void numerosAleatorios(int[] numeros) {
        for (int i=0; i<longitud(); i++) {
            numeros[i] = (int) (Math.random()*100);
        }
        //Ordenar el array para poder utilizar el bnarySearch
        Arrays.sort(numeros);
    }

    //Método para mostrar el resultado del array
    public static void mostrarArray(int[] numeros) {
        System.out.println("Contenido del array");
        for (int i=0; i<longitud(); i++) {
            System.out.print(numeros[i] + " ");
            //Salto de línea cada 10 elementos
            if ((i + 1) %10 ==0) {
                System.out.println();
            }
        }
        System.out.println();
    }

   //Metodo para pedir un valor que exista dentro del array
    public static int pedirValorBuscar(Scanner teclado) {
        System.out.println("Dime el valor a buscar");
        return teclado.nextInt();
    }

    //Método para buscar el indcice del array (en la posicion que se encuentre ese número)
    public static int buscarContar(int[] numeros, int valorBuscado) {
        //Para devolver el valor de la posción que exista dentro array
        int indice = Arrays.binarySearch(numeros,valorBuscado);
        int valorEncontrado=0;
        if (indice >=0) {
            valorEncontrado++;
            for (int i=indice-1; i>=0 && numeros[i] == valorBuscado; i--) {
                valorEncontrado++;
            }
            for (int i=indice +1; i<longitud() && numeros[i] == valorBuscado; i++) {
                valorEncontrado++;
            }
        }
        return valorEncontrado;
    }

}
