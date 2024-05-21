package org.andres.example.Set;

import org.andres.example.Metodos.MEj2TreetSet;

import java.util.Set;

//Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y que luego calcule la
//suma, la media, el máximo y el mínimo de esos números. El tamaño de la lista también será aleatorio y
//podrá oscilar entre 10 y 20 elementos ambos inclusive.
public class Ej2TreeSet {
    public static void main(String[] args) {
        //Lista de números
        Set<Integer> lista = MEj2TreetSet.generarListaAleaotorio();
        //Mostrar los números generados
        System.out.println("Lista generada " + lista);

        //Calcular la suma, media, maximo, mínimo de la  lista
        int suma = MEj2TreetSet.calcularSuma(lista);
        double media = MEj2TreetSet.calcularMedia(lista);
        int maximo =  MEj2TreetSet.encontarMaximo(lista);
        int  minimo = MEj2TreetSet.encontrarMinimo(lista);

        //Mostrar los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo " + minimo);


        /**Números random
        //Random random = new Random();
        //Números random entre entre 0 y 100, tamaño de la lista entre 10 y 20
        //MEj2.numerosAleatorios(numeros,random);
        //Mostrar el resultado
        System.out.println(numeros);**/
    }
}
