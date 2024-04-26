package org.angel.ejemplos.set;
import org.angel.ejemplos.modelo.Alumno;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class EjemploLinkedList {
    /**
     * Ejemplo de uso de la clase LinkedList
     */
     public static void main(String[] args) {
         LinkedList<Alumno> enlazada = new LinkedList<>();
         System.out.println("Nº de elementos: " + enlazada.size());
         System.out.println("Está vacía = " + enlazada.isEmpty());
         enlazada.add(new Alumno("Pato",5));
         enlazada.add(new Alumno("Cata",6));
         enlazada.add(new Alumno("Luci",4));
         enlazada.add(new Alumno("Jano",7));
         enlazada.add(new Alumno("Andres",3));
         enlazada.add(new Alumno("Zeus",2));
         enlazada.add(new Alumno("Rodolfo",3));
         System.out.println("El número de elementos del Alamacén son : " + enlazada.size());
         System.out.println("El contenido del almacen es : " + enlazada);
        // insertar al principio de la lista
         enlazada.addFirst(new Alumno ("Zeus",6));
         // insertar al final de la lista
         enlazada.addLast(new Alumno("Atenea",5));
         System.out.println("El contenido del almacen es : " + enlazada);
         // Recuperar el primer elemento de la lista
         System.out.println("Primero = " + enlazada.getFirst());
         // recuperar el último elemento de la lista
         System.out.println("Ultimo elementos con Get = " + enlazada.getLast()); // el método get sn encuentra un elementos devuelve un excepción
         // recuperar el último elementos con el método peek
         System.out.println("Último elemento Peek = " + enlazada.peekLast()); // a diferencia del get no devuelve ninguna excepción en caso de no encontrar el elto, NULL
         // Eliminar el primer elemento del linkedlist
         System.out.println("Eliminar el primer elementos = " + enlazada.removeFirst());
         // Eliminar el último elementos de Linkedlist
         System.out.println("Eliminar el último elementos de la lista = " + enlazada.removeLast());
         System.out.println("Elementos de la lista enlazada menos el primero y el último ya borrados = " + enlazada);
         // elimina el primer elemento de la lista como si fuera una pila
         System.out.println("Elimina el primer elementos de la lista como si fuera una pila PollFirst () = " + enlazada.pollFirst());
         // elimina a jano de la lista
         enlazada.remove(new Alumno("Jano",7));
         // muestra el número de elementos después de insertar a Jano
         System.out.println("Número de elementos de enlazada size = " + enlazada.size());
         Alumno nuevoalumno = new Alumno("lucas",6);
         enlazada.addLast(nuevoalumno);
         System.out.println("Elementos de enlazada  = " + enlazada);
         System.out.println("Nos devuelve el índice de Lucas = " + enlazada.indexOf(nuevoalumno));
         enlazada.remove(2);
         System.out.println("Enlazada tamaño size = " + enlazada.size());
         System.out.println("Índice de Lucas = " + enlazada.indexOf(nuevoalumno));

     }
}


