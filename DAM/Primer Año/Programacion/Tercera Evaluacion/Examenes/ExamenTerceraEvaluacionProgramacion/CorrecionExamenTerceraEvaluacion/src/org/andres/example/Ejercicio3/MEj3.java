package org.andres.example.Examen.Ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class MEj3 {

    public static void guardarFicheroFutbol(ArrayList<PartidosFutbol_Ej3> futbol) {

        try (BufferedReader leer = new BufferedReader(new FileReader("Partidos.txt"))){
            String linea;

            while ((linea = leer.readLine())!=null) {

                //Split de la línea para obtener los datos del partido
                String[] datos = linea.split("-");

                if (datos.length==4) {
                    String equipoLocal = datos[0];
                    int golLocal = Integer.parseInt(datos[1]);
                    int golVisitante = Integer.parseInt(datos[2]);
                    String equipoVisitante = datos[3];


                    //Crear un objecto Partidos y añadirlo a la lista
                    PartidosFutbol_Ej3 partido = new PartidosFutbol_Ej3(equipoLocal, golLocal, golVisitante, equipoVisitante);
                    futbol.add(partido);
                }
            }
      } catch (IOException e) {
            System.out.println("Error de Escritura/Lectura " +e.getMessage());
        }

        // Mostrar los partidos almacenados
        for (PartidosFutbol_Ej3 partido : futbol) {
            System.out.println(partido);
        }
    }
}
