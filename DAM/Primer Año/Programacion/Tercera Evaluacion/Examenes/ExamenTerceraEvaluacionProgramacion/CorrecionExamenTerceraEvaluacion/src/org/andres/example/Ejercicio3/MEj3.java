package org.andres.example.Ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MEj3 {
    //Método para guardar los resultados de un partdio de futbol en una lista, mediante un fichero
    public static void guardarFicheroFutbol(ArrayList<PartidoFutbol> futbol, Scanner teclado) {

        System.out.println("\nEquipos de Fútbol");
        System.out.println("Introduzca el nombre equipo local:");
        String equipLocal = teclado.nextLine();

        System.out.println("Introduzca los goles del equipo local:");
        int golLocal = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduzca los goles del equipo visitante:");
        int golVistante = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Introduzca el nombre del equipo visitante");
        String equipoVisitante = teclado.nextLine();

        futbol.add(new PartidoFutbol(equipLocal,equipoVisitante,golLocal,golVistante));

        try (BufferedWriter escribir = new BufferedWriter(new FileWriter("Partidos.txt",true))){
            escribir.write(String.valueOf(futbol));
            escribir.newLine();
            System.out.println("Se ha creado el archivo Partido.txt correctamente");
        }catch (IOException e) {
            System.out.println("Error de E/S " + e.getMessage());
        }
    }
}
