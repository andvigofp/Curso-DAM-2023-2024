package org.andres.example.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 3. (2,5ptos)
 * Crea una clase llamada PartidoFutbol que guarde la información de cada uno de los partidos de una determinada
 * liga. La clase debe guardar el nombre del equipo local, el nombre del equipo visitante, y los goles que han metido
 * cada uno de ellos, (golesLocales, golesVisitante), durante el partido. La clase contendrá los siguientes métodos:
 * • Constructor por defecto.
 * • Constructor con parámetros.
 * • Métodos Setters/Getters
 *
 * Escribe además un programa que lea desde un archivo Partidos.txt los partidos en el formato que podemos ver
 * en la siguiente imagen, y vaya creando objetos PartidoFutbol que se irán guardando en un ArrayList.
 * Contenido de archivo Partidos.txt
 * Real Madrid-2-1-Barcelona
 * Real Madrid-1-0-Sevilla
 * Barcelona-2-3-Sevilla
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<PartidoFutbol> futbol = new ArrayList<>();

        MEj3.guardarFicheroFutbol(futbol,teclado);
    }
}
