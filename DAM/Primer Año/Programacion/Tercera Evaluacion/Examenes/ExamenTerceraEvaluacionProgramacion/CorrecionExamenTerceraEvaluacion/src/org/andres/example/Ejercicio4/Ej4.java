package org.andres.example.Ejercicio4;

import org.andres.example.Ejercicio3.MEj3;

import java.util.ArrayList;
import java.util.Set;

/**
 * Insertar en una lista 20 enteros aleatorios entre 1 y 10 . A partir de ella, crear un conjunto con los elementos de
 * la lista sin repetir, otro con los repetidos y otro con los elementos que aparecen una sola vez en la lista original.
 * Mostrar cada una de las listas. Todo el ejercicio se deberá hacer mediante colecciones.
 */
public class Ej4 {
    public static void main(String[] args) {
        MEJ4 metodos= new MEJ4();

        //Generar lista aleatorio
        ArrayList<Integer> lista = metodos.generarListaAleatorio();

        //Obtener Conjuntos
        Set<Integer> unicos = metodos.obtenerElementosUnicos(lista);
        Set<Integer> repetidos = metodos.obetnerElementosRepetidos(lista);
        Set<Integer> soloUnaVez = metodos.obtenerElementosUnaSolavez(lista,repetidos);

        //Mostrar resultados
        metodos.mostrarResultados(lista,unicos,repetidos,soloUnaVez);

    }
}
