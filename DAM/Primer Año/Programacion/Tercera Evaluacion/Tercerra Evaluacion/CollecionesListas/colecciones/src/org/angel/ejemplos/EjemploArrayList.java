package org.angel.ejemplos;
import java.util.ArrayList;
import java.util.Comparator;

public class EjemploArrayList {
    /**
     * Ejemplo de uso de la clase ArrayList
     */
     public static void main(String[] args) {
            ArrayList<String> almacen = new ArrayList<String>();
            System.out.println("Nº de elementos: " + almacen.size());
            almacen.add("rojo");
            almacen.add("verde");
            almacen.add("azul");
            System.out.println("Nº de elementos: " + almacen.size());
            almacen.add("blanco");
            System.out.println("Nº de elementos: " + almacen.size());
            System.out.println("El elemento que hay en la posición 0 es " + almacen.get(0));
            System.out.println("El elemento que hay en la posición 3 es " + almacen.get(3));
            almacen.sort(Comparator.naturalOrder());
            for (int i=0; i< almacen.size();i++){

                System.out.println("Valor en la posición "+ i + " "+almacen.get(i));
            }
            // El bucle for sencillo que nos permitirá hacer lo mismo que con el for que ya conocemos
            for (String color: almacen){

                System.out.println(color );
            }
         //System.out.println("almacen = " + almacen);

        }

}
