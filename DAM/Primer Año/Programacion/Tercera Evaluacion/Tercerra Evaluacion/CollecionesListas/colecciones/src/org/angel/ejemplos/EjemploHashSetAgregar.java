package org.angel.ejemplos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregar {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        // no mantiene ningún orden en particular //
        System.out.println(hs);


    }
}
