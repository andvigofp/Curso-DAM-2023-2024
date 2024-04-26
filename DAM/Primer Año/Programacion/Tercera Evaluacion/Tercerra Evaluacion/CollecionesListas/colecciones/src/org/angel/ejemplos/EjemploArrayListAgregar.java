package org.angel.ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class EjemploArrayListAgregar {

    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        // En este caso si tiene un orden y podemos a diferencia de los set insertar un elementos duplicado
        boolean insertar= hs.add("tres");
        System.out.println(hs);
        // podría ordenar la lista a diferencia de los set
        Collections.sort(hs);
        System.out.println(hs);
        // ¿Que pasaría si ahora vuelvo al set ?

    }
}
