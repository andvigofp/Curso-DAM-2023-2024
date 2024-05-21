package org.andres.example.Ejercicio2;

/**
 * Crea una clase coche que tenga como atributos del tipo que tú consideres más adecuado: matrícula,
 * marca,modelo y kilómetros. Y a continuación realiza el siguiente ejercicio:
 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche. El programa pide por teclado los
 * datos de los coches y los guarda en el array. A continuación, utilizará el ArrayList para mostrar por pantalla los
 * siguientes métodos:
 * a) Todos los coches introducidos.
 * b) Todos los coches de una marca determinada que el usuario pedirá por teclado
 * c) Todos los coches con menos de un número determinado de Kilómetros que el usuario escribirá.
 * d) El coche con mayor número de Kilómetros.
 * e) Todos los coches ordenados por número de kilómetros de menor a mayo
 */
public class Ej2 {
    public static void main(String[] args) {
        Menu_Ej2 m = new Menu_Ej2();
        m.menu();

    }

}
