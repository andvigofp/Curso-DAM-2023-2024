package org.andres.example.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GestionarCoches_Ej2 {
    private ArrayList<Coche_Ej2> coches;

    public GestionarCoches_Ej2() {
        coches = new ArrayList<>();
    }
    //Método para pedir por teclado la mátricula del coche
    private String leerMatricula(Scanner teclado) {
        System.out.print("Ingrese matrícula del coche: ");
        return teclado.nextLine();
    }
    //Método para pedir por teclado la marca del coche
    private String leerMarca(Scanner teclado) {
        System.out.print("Ingrese marca del coche: ");
        return teclado.nextLine();
    }
    //Método para pedir por teclado el modelo del coceh
    private String leerModelo(Scanner teclado) {
        System.out.print("Ingrese modelo del coche: ");
        return teclado.nextLine();
    }
    //Método para pedir los kilómetros del coche
    private int leerKilometros(Scanner teclado) {
        System.out.print("Ingrese kilómetros del coche: ");
        return Integer.parseInt(teclado.nextLine());
    }
    //Método para pedir por teclado los datos del coche
    public void agregarCoche(Scanner teclado) {
        String matricula = leerMatricula(teclado);
        String marca = leerMarca(teclado);
        String modelo = leerModelo(teclado);
        int kilometros = leerKilometros(teclado);
        agregarCoche(matricula, marca, modelo, kilometros);
    }
    //Método para agregar una lista los datos del coche
    public void agregarCoche(String matricula, String marca, String modelo, int kilometros) {
        Coche_Ej2 coche = new Coche_Ej2(matricula, marca, modelo, kilometros);
        coches.add(coche);
    }
    //Método para mostar todos los coches agregagos a la lista
    public void mostrarTodosLosCoches() {
        for (Coche_Ej2 coche : coches) {
            System.out.println(coche);
        }
    }
    //Método para mostar los coches por la marca del coche
    public void mostrarCochesPorMarca(String marca) {
        for (Coche_Ej2 coche : coches) {
            if (coche.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(coche);
            }
        }
    }
    //Método para mostar los coches con menos los kilometros del coche
    public void mostrarCochesPorKilometros(int kilometrosMax) {
        for (Coche_Ej2 coche : coches) {
            if (coche.getKilometros() < kilometrosMax) {
                System.out.println(coche);
            }
        }
    }
    //Método para comprobar si no existe el coche con esos kilómetros
    public void mostrarCocheConMasKilometros() {
        if (coches.isEmpty()) {
            System.out.println("No hay coches en la lista.");
            return;
        }

        Coche_Ej2 cocheMaxKilometros = Collections.max(coches, Comparator.comparingInt(Coche_Ej2::getKilometros));
        System.out.println("Coche con más kilómetros: " + cocheMaxKilometros);
    }
    //Método para ordenar los coches con mayor o menor kilometros del coche
    public void mostrarCochesOrdenadosPorKilometros() {
        ArrayList<Coche_Ej2> cochesOrdenados = new ArrayList<>(coches);
        cochesOrdenados.sort(Comparator.comparingInt(Coche_Ej2::getKilometros));
        for (Coche_Ej2 coche : cochesOrdenados) {
            System.out.println(coche);
        }
    }


    //Método para pedir por teclado la marca del coche
    public void mostrarCochesPorMarca(Scanner teclado) {
        System.out.print("Ingrese la marca para mostrar los coches: ");
        String marcaBuscada = teclado.nextLine();
        System.out.println("Coches de la marca " + marcaBuscada + ":");
        mostrarCochesPorMarca(marcaBuscada);
    }
    //Método para pedir por teclado los kilometros del coche
    void mostrarCochesPorKilometros(Scanner teclado) {
        System.out.print("Ingrese el máximo número de kilómetros para mostrar los coches: ");
        int kilometrosMax = Integer.parseInt(teclado.nextLine());
        System.out.println("Coches con menos de " + kilometrosMax + " kilómetros:");
        mostrarCochesPorKilometros(kilometrosMax);
    }
}