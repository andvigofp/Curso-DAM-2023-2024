package org.andres.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class MEj2 {
    //Métod para generar un número aleatorio entre 0 100
    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt((max-min)+1);
    }

    public static void ordenarDescente(ArrayList<Integer> numeros) {
        for (int i=0; i<numeros.size(); i++) {
            numeros.sort(Comparator.reverseOrder());
        }
        System.out.println("Lista de números de menor a manor " + numeros);
    }

    //Método para generar un número aleatorio tamaño de una lista entre 10 y 20;
    public static ArrayList<Integer>  generarListaAleaotorio() {
        Random random = new Random();
        ArrayList<Integer> lista = new ArrayList<>();
        int tamano = random.nextInt((20-10)+1)+10; //Generar tamaño aleatorio entre 10 y 20

        for (int i=0; i<tamano; i++) {
            lista.add(numeroAleatorio(0,100)); //Agregar número aleatorios entre 0 y 100
        }
        return lista;
    }

    //Método para calcular la suma de los elementos de una lista
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma=0;
        for (int numero : lista) {
            suma+=numero;
    }
        return suma;
    }

    //Métdo para calcular el promedio de los elementos en la lista
    public static double calcularMedia(ArrayList<Integer> lista) {
        int suma= calcularSuma(lista);
        return (double) suma/lista.size();
    }

    //Método para encontrar el máximo valor en la lista
    public static int encontarMaximo(ArrayList<Integer> lista) {
        int maximo = Integer.MIN_VALUE;
        for (int numero : lista) {
            if (numero >  maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    //Métod para encontrar el mínimo valor en la lista
    public static int encontrarMinimo(ArrayList<Integer> lista) {
        int minimo =  Integer.MAX_VALUE;
        for (int numero: lista) {
            if (numero<minimo) {
                minimo=numero;
            }
        }
        return minimo;
    }

    public static void encontarMaxMin(ArrayList<Integer> lista) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n: lista) {
            if (n >max) {
                max=n;
            }else if (n<min) {
                min=n;
            }
        }
        System.out.println("El máximo númeo es: " + max);
        System.out.println("El mínimo número es: " + min);
    }

    //Método números aleatorios en un ArrayList, tamaño de una entre 10 y 20;
    /**public static void numerosAleatorios(ArrayList<Integer> numeros,Random random) {
        for (int i=0; i< random.nextInt(11,20); i++) {
            numeros.add(random.nextInt(101));
        }**/


}
