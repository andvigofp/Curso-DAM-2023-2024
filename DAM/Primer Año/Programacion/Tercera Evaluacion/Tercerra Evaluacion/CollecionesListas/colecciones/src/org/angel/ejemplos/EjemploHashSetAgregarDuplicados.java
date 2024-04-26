package org.angel.ejemplos;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetAgregarDuplicados {

    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        // no mantiene ningún orden en particular //
        System.out.println(hs);

        // Vamos a agregar el nuevo elemento y ver como se comporta el conjunto

        boolean inserta = hs.add ("tres");
        System.out.println("Permite elementos duplicados = "+inserta);
        System.out.println(hs);

    }
}
