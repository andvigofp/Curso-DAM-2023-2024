package org.andres.ejemplos.Set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class EjemploArrayListAgregar {
    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");

        System.out.println(hs.add("cinco"));
        //en este caso si tiene un orden y podemos a diferencias de los set insertar un elemento
        boolean insertar = hs.add("tres");
        System.out.println(hs);
        //Podría ordenar la lista a diferencia de los set
        Collections.sort(hs);
        System.out.println(hs);
        //¿Que pasaría si ahora al set ?
    }
}
