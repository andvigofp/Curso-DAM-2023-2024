package org.andres.Ejercicios.Examen.CincoAtletas;

public class Lanzador {
    public static void main(String[] args) {
        Carrera carrera = new Carrera();
        Atletas[] atletas = new Atletas[5];
        for (int i = 0; i < 5; i++) {
            atletas[i] = new Atletas("Atleta " + (i + 1), carrera);
            atletas[i].start();
        }

        Juez juez = new Juez(carrera);
        juez.start();
    }
}