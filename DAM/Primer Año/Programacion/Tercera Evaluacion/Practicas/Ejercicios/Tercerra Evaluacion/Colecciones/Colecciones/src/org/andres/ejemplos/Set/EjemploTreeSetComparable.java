package org.andres.ejemplos.Set;

import org.andres.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        //Set<Alumno> sa = new TreeSet<>();
        ArrayList<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Paco", 5));
        sa.add(new Alumno("Luis", 3));
        sa.add(new Alumno("Angel", 10));
        sa.add(new Alumno("Miguel", 2));
        sa.add(new Alumno("Adrian", 7));
        sa.sort(Comparator.naturalOrder());

        System.out.println(sa);
    }
}
