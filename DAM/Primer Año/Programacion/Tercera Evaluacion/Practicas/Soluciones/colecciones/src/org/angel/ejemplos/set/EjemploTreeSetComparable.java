package org.angel.ejemplos.set;

import org.angel.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {
        ArrayList<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));
        sa.sort(Comparator.reverseOrder());
        System.out.println(sa);
    }

}
