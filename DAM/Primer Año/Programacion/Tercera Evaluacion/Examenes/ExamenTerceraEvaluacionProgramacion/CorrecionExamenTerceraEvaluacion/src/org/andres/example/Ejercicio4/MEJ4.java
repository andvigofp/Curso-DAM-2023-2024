package org.andres.example.Examen.Ejercicio4;

import java.util.*;

public class MEj4 {
    //Método para generar una lista de 20 numeros enteros aleatorios entre 1 y 10
    public ArrayList<Integer> generarListaAleatorio() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i=0; i<20; i++) {
            lista.add(random.nextInt(10)+1);
        }
        return lista;
    }

    //Método para crear un conjunto con elementos repetidos
    public Set<Integer> obtenerElementosRepetidos(ArrayList<Integer> lista) {
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> temporal = new HashSet<>();

        for (Integer numeros : lista) {
            if (!temporal.add(numeros)) {
                repetidos.add(numeros);
            }
        }
        return repetidos;
    }
    //Método para crear un conjunto con elementos repetidos
    public Set<Integer> obtenerListaUnaVez(ArrayList<Integer> lista,Set<Integer> repetidos) {
        Set<Integer> unaVez = new LinkedHashSet<>(lista);
        unaVez.remove(repetidos);
        return unaVez;

    }

    //Método para crear un conjunto de elemntos que aparezcan una sola vez
    public void mostrarResultados(ArrayList<Integer> lista, Set<Integer> repetidos, Set<Integer> unaVez) {
        System.out.println("Lista Original: " + lista);
        System.out.println("Elementos repetidos: " + repetidos);
        System.out.println("Elementos que aparecen una sola vez: " + unaVez);
    }

}
