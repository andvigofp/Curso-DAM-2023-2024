package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ej3 {
    /**
     * Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros aleatorios entre 0 y 99
     * (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se mostrará por pantalla si N existe en el
     * array, además de cuantas veces. Podrás utilizar el método pos=binarySearch(vector,número a buscar) de la
     * clase Array que devuelve la posición del elemento a buscar en el vector
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Un array con 1000 de longitud
        int[] numeros = new int[MetodoEj3.longitud()];
        //Números aletorios
        MetodoEj3.numerosAleatorios(numeros);
        //Mostrar el resultado
        MetodoEj3.mostrarArray(numeros);
        //Para pedir un valor que exista dentro del array
        int valorBuscado = MetodoEj3.pedirValorBuscar(teclado);
        //Para buscar un valor que exista dentro del array
        int valorEncotrado = MetodoEj3.buscarContar(numeros,valorBuscado);

        //Si se comple la condicion te muestra el valor que estas bsucando y las veces que se repite.
        //Si no se cumple te saldra un mensaje no existe ese valor dentro del array
        if (valorEncotrado >0) {
            System.out.println("El valor " + valorBuscado + " existe en el array y aparece " + valorEncotrado + " veces.");
        }else {
            System.out.println("E valor " + valorBuscado + " no existe en el array.");
        }
    }
}
