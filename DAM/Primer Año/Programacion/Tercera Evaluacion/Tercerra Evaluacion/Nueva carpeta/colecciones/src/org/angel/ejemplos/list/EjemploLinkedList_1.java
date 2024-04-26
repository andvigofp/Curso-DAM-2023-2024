package org.angel.ejemplos.list;

import org.angel.ejemplos.modelo.Alumno;

import java.util.LinkedList;

public class EjemploLinkedList_1 {
    public static void main(String[] args) {
        LinkedList<Alumno>  enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("está vacía = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Paco", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ",size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeus", 5));
        enlazada.addFirst(new Alumno("Atenea", 6));
        System.out.println(enlazada + ",size = " + enlazada.size());

        System.out.println("primero = " + enlazada.getFirst());
        System.out.println("Ultimo = " + enlazada.getLast());
        System.out.println("Indice 2 = " + enlazada.get(2));

        //Alumno zeus = enlazada.pop();
        //enlazada.pollLast();
        enlazada.removeFirst();
        enlazada.removeLast();
        System.out.println(enlazada + ",size = " + enlazada.size());

        enlazada.remove(new Alumno("Jano", 7));
        //System.out.println(enlazada + ",size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        enlazada.addLast(a);
        System.out.println("enlazada = " + enlazada);
        enlazada.remove(2);
        System.out.println(enlazada + ", size " + enlazada.size());
        System.out.println("Indice de lucas = " + enlazada.indexOf(a));

        enlazada.remove(2);
        System.out.println(enlazada + ",size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + enlazada.indexOf(a));

        enlazada.set(3, new Alumno("Lalo",7));
        //System.out.println("primero = " + enlazada.getFirst());





    }
}
