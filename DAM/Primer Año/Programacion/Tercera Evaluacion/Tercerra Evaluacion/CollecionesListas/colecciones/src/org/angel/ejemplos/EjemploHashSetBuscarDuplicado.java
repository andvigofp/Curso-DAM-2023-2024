package org.angel.ejemplos;

import java.util.HashSet;
import java.util.Set;

// vamos a buscar duplicados
public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String [] peces = {"Corvina","Lenguado","Corvina","Perjerrey", "Robalo", "Atún", "Lenguado"};

        Set <String> unicos = new HashSet<>();
        for (String pez: peces){

            if (!unicos.add(pez)){

                System.out.println("Elemento Duplicado : " + pez);
            }
        }

    }
}
