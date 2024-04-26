package org.angel.ejemplos;

import org.angel.ejemplos.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {
        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus",2));

        sa.add(new Alumno("Rodolfo",2));
        //sa.sort(Comparator.reverseOrder());
        System.out.println(sa);
        // vamos a emplear un foreach para hacer un recorrido del HashSet //


        System.out.println("Iterando utilizando un foreach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());

        }
        // otra manera de iterarar o mostrar los elementos de un HashSet
        Iterator <Alumno> it = sa.iterator();
        while (it.hasNext()){

            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

    }


}
