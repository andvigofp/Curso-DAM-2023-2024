package org.angel.ejemplos;

import java.util.HashSet;
import java.util.Set;

// Vamos a insertar los duplicados en un conjunto distinto para ello creamos otro conjunto
public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String [] peces = {"Corvina","Lenguado","Corvina","Perjerrey", "Robalo", "Atún", "Lenguado"};

        Set <String> unicos = new HashSet<>();
        Set <String> duplicados = new HashSet<>();
        // recorro el String e inserto los elementos en el set
        for (String pez: peces){

            if (!unicos.add(pez)){

                duplicados.add(pez);
            }
        }
        // quita todos los elementos que estén duplicados
        unicos.removeAll(duplicados);
        System.out.println("Unicos " + unicos);
        System.out.println("duplicados = " + duplicados);
    }
}
