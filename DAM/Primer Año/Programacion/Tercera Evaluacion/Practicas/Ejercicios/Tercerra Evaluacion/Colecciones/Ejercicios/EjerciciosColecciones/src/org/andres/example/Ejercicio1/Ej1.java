package org.andres.example.Ejercicio1;

import java.util.*;

/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra esos nombres por
 * pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin usar ningún índice.
 */
public class Ej1 {
    public static void main(String[] args) {
        //ArrayList compañero de clase
        //ArrayList<Sring> = new ArrayList<>();
        //Set<String> alumnos = new HashSet<>();
        Set<String> alumnos = new TreeSet<>();

        //Añadimos 6 alumnos
        System.out.println("Nombre de compañeros de clase: ");
        alumnos.add("Ramón");
        alumnos.add("Adrían");
        alumnos.add("David");
        alumnos.add("Perfecto");
        alumnos.add("Iría");
        alumnos.add("Rubén");
        alumnos.add("Rubén");
        alumnos.add("Rubén");
        alumnos.add("Rubén");

        //Mostramos los 6 alumnos
        for (String a: alumnos) {
            System.out.println(a);
        }
    }
}
