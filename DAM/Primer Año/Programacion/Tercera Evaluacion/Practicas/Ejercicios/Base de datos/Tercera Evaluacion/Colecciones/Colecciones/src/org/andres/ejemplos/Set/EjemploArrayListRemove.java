package org.andres.ejemplos.Set;

import java.util.ArrayList;
import java.util.Comparator;

public class EjemploArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> almacen = new ArrayList<>();
        System.out.println("Nª de almacen " + almacen.size());
        almacen.add("rojo");
        almacen.add("azul");
        System.out.println("Nª de almacen " + almacen.size());
        almacen.add("marrón");
        almacen.add("blanco");
        System.out.println("Nª de almacen " + almacen.size());
        System.out.println("EL elemnto que hay en la posición 0 es:  " + almacen.get(0));
        System.out.println("EL elemnto que hay en la posición 3 es:  " + almacen.get(3));
        almacen.sort(Comparator.naturalOrder());

        for (int i=0; i<almacen.size(); i++) {
            System.out.println("valor en la posción " + i + " " + almacen.size());
        }

        //El bucle
        for (String color: almacen) {
            System.out.println(color);
        }

        if (almacen.contains("blanco")) {
            almacen.remove("blanco");
        }

        System.out.println("Asi quedará el almacén de elminar el color del elemnto: ");
        for (String color: almacen) {
            System.out.println(color);
        }
    }
}
