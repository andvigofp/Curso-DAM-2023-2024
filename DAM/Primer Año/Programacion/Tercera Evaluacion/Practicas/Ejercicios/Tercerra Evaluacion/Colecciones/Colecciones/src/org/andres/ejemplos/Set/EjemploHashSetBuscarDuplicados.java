package org.andres.ejemplos.Set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicados {
    public static void main(String[] args) {
        String[] peces = {"Corvina", "Lenguado", "Corvina", "Perjerrey", "Robelo", "Atún", "Lenguado"};

        //HashSet no se puede ordenar
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        //Recorre el String e inserto los elementos en el Set
        for (String pez: peces) {
            if (!unicos.add(pez)) {

                duplicados.add(pez);


            }
            //quita todo los elementos que estén duplioados
            System.out.println("unicos " + unicos);
            System.out.println("duplicados " + duplicados);
        }
    }
}
