package org.angel.ejemplos.set;
import org.angel.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class EjemploArrayListMetodosMasImportante {
    /**
     * Ejemplo de uso de la clase ArrayList
     */
    public static void main(String[] args) {

        ArrayList<Alumno> almacen = new ArrayList<>();
        System.out.println("Tamaño del ArrayList " + almacen.size());
        System.out.println("Tamaño del ArrayList " + almacen.isEmpty());
        almacen.add(new Alumno("Pato",5));
        almacen.add(new Alumno("Cata",6));
        almacen.add(new Alumno("Luci",4));
        // voy a insertar a Jano en la posición 2 moviendo todo lo que se encuentra luego
        almacen.add(2,new Alumno("Jano",7));
        almacen.add(new Alumno("Andrés",3));
        // voy a utilizar el método set que a diferencia del add machaca el valor donde coloquemos el índice
        System.out.println("almacen = " + almacen);
        almacen.set(3,new Alumno("Andres",3));
        System.out.println("Tamaño del ArrayList " + almacen.size());
        // Eliminar elementos de la lista, se puede hacer por índice o por objeto
        //almacen.remove(new Alumno("Jano",7));// elimina el elemento buscando el nombre y la nota comparando con Equals
         almacen.remove(2); // elimina por el índice
        boolean b = almacen.contains(new Alumno("Cata",7));
        System.out.println("La lista contiene a Cata = " + b);
        System.out.println("almacen = " + almacen);
        // convertir un ArrayList a un Array
        Object a [] = almacen.toArray();
        for (int i=0; i<a.length;i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
        System.out.println("Tamaño del ArrayList " + almacen.size());


    }
}
