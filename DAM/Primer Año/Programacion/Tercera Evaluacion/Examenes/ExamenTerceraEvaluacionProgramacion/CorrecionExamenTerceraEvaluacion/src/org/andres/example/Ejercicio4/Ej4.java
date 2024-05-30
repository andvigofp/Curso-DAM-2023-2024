package org.andres.example.Examen.Ejercicio4;

import java.util.ArrayList;
import java.util.Set;

/**
 * Insertar en una lista 20 enteros aleatorios entre 1 y 10 . A partir de ella, crear un conjunto con los elementos de
 * la lista sin repetir, otro con los repetidos y otro con los elementos que aparecen una sola vez en la lista original.
 * Mostrar cada una de las listas. Todo el ejercicio se deberá hacer mediante colecciones.
 */
public class Ej4 {
    public static void main(String[] args) {
        MEj4 metodos = new MEj4();

        //Generar lista aleatorio
        ArrayList<Integer> lista = metodos.generarListaAleatorio();

        Set<Integer> repetidos = metodos.obtenerElementosRepetidos(lista);
        Set<Integer> unaVez = metodos.obtenerListaUnaVez(lista,repetidos);

        metodos.mostrarResultados(lista,repetidos,unaVez);
    }
}
