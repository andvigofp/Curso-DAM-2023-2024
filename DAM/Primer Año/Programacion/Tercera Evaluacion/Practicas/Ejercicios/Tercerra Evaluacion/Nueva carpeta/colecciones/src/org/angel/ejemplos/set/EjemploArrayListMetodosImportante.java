package org.angel.ejemplos.set;

import org.angel.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Objects;

public class EjemploArrayListMetodosImportante {
    public static void main(String[] args) {
        ArrayList<Alumno> alamcen = new ArrayList<>();
        System.out.println("tamaño de ArrayList " + alamcen.size());
        System.out.println("tamaño de ArrayList " + alamcen.isEmpty());
        alamcen.add(new Alumno("Pato", 5));
        alamcen.add(new Alumno("Cata", 6));
        alamcen.add(new Alumno("Luci", 4));
        alamcen.add(2,new Alumno("Jano",7));

        alamcen.add(new Alumno("Andres",3));
        //Voy a insertar a jano a la posción 2 moviendo todo lo que se encuentre luego
        System.out.println("almacen = " + alamcen);
        alamcen.add(3,new Alumno("Andres",3));
        System.out.println("tamaño de ArrayList " + alamcen.size());

        System.out.println("antes de insertar a andres comprobamos el tamanño " + alamcen.size());

        alamcen.remove(new Alumno("Jano",7));
        System.out.println("almacen = " + alamcen);

        boolean b = alamcen.contains(new Alumno("Cata",6));
        System.out.println("La lista contiene a Cata " + b);
        System.out.println("almacen " + alamcen);

        //Convertir un ArrayList a un Array
        Object[] a =  alamcen.toArray();
        for (int i=0; i<a.length; i++) {
            System.out.println("Desde el arraglo " + a[i]);
        }
        System.out.println("Tamaño del ArrayList " + alamcen.size());
    }
}
