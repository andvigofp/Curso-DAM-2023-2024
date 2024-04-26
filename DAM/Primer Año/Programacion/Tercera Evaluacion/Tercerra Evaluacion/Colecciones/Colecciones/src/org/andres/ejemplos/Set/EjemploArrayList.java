package org.andres.ejemplos.Set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class EjemploArrayList {
    /**
     * Ejemplo de uso de la clase ArrayList
     */
    public static void main(String[] args) {
        ArrayList<String> almacen = new ArrayList<String>();

        System.out.println("Nª de elementos: " + almacen.size());
        almacen.add("rojo");
        almacen.add("verde");
        almacen.add("azul");
        System.out.println("Nº de elementos " + almacen.size());
        almacen.add("blanco");
        System.out.println("Nº de elementos " + almacen.size());

        System.out.println("El elemento que hay en la psocion 0 es: " + almacen.get(0));
        System.out.println("El elemento que hay en la psocion 1 es: " + almacen.get(1));
        almacen.sort((Comparator.reverseOrder())); //Ordenar ese orden
        System.out.println("alamacen = " + almacen);
    }
}
