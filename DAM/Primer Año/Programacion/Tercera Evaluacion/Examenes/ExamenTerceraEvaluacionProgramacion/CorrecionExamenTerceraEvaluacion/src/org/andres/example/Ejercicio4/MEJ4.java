package org.andres.example.Ejercicio4;

import java.util.*;

public class MEJ4 {
    //Método para generar una lista de 20 numeros enteros aleatorios entre 1 y 10

    public ArrayList<Integer> generarListaAleatorio() {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i=0; i<20; i++) {
            lista.add(random.nextInt(10)+1);
        }
        return lista;
    }

    //Método para crera un cojunto de elementos únicos
    public Set<Integer> obtenerElementosUnicos(ArrayList<Integer> lista) {
        return new LinkedHashSet<>(lista);
    }

    //Método para crear un conjunto con elementos repetidos
    public Set<Integer> obetnerElementosRepetidos(ArrayList<Integer> lista) {
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> temporal = new HashSet<>();

        for (Integer numero : lista) {
            if (temporal.add(numero)) {
                repetidos.add(numero);
            }
        }
        return repetidos;
    }

    //Método para crear un conjunto de elemntos que aparezcan una sola vez
    public Set<Integer> obtenerElementosUnaSolavez(ArrayList<Integer> lista,Set<Integer> repetidos) {
       Set<Integer> soloUnaVez = new LinkedHashSet<>(lista);
       soloUnaVez.remove(repetidos);
       return soloUnaVez;
    }

    //Método para mostrar los resultados
    public void mostrarResultados(ArrayList<Integer> lista, Set<Integer> unicos, Set<Integer> repetidos, Set<Integer> soloUnaVez) {
        System.out.println("Lista Original: " + lista);
        System.out.println("Elementos únicos: " + unicos);
        System.out.println("Elementos repetidos: " + repetidos);
        System.out.println("Elementos que aparecen una sola vez: " + soloUnaVez);
    }
}
