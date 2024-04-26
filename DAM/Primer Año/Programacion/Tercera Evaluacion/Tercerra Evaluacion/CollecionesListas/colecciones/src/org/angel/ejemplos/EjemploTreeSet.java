package org.angel.ejemplos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
// tiene una importante sobrecarga con respecto a los set ya que están ordenados
public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String > ts = new TreeSet<>();
        ts.add ("uno");
        ts.add ("dos");
        ts.add ("tres");
        ts.add ("cuatro");
        ts.add ("cinco");
        System.out.println("ts = " + ts);
        
        Set <Integer> numeros = new TreeSet<>(Comparator.naturalOrder());
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(10);
        System.out.println("numeros = " + numeros);
    }
}
// si quiero invertir el orden Comparate.reverseOrder()