package org.andres.example.Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MEJ2 {
//Ménu para insertar los coches una lista
public static void agregarCooches(ArrayList<Coches_EJ2> coches, Scanner teclado) {
    System.out.println("Inserta una matricula del coche: ");
    String matricula = teclado.nextLine();
    System.out.println("Inserta una marca de coche: ");
    String marca = teclado.nextLine();
    System.out.println("Inserta el modelo del coche");
    String modelo = teclado.nextLine();
    System.out.println("Inserta los kílometros del coche:");
    int kilometros = Integer.parseInt(teclado.nextLine());
    coches.add(new Coches_EJ2(matricula, marca, modelo, kilometros));
    System.out.println("Se ha añadido la lista de coches");

}

public static void mostarTodosCoches(ArrayList<Coches_EJ2> coches) {
    for (Coches_EJ2 c : coches) {
        System.out.println(c);
    }
}

public static void mostarCochesMarca(ArrayList<Coches_EJ2> coches, Scanner teclado) {
    System.out.println("Introduce la marca de coche a bsucar: ");
    String marca = teclado.nextLine();

    for (Coches_EJ2 c : coches) {
        if (c.getMarca().equals(marca)) {
            System.out.println(c);
        }
    }
}

public static void mostarCochesMenosKilometros(ArrayList<Coches_EJ2> coches, Scanner teclado) {
    System.out.println("Introduce los kilometros del coche");
    int kilometros = Integer.parseInt(teclado.nextLine());

    for (Coches_EJ2 c : coches) {
        if (c.getKilometros() < kilometros) {
            System.out.println(c);
        }
    }
}

public static void motsrarCochesConMasKilometros(ArrayList<Coches_EJ2> coches) {
    if (coches.isEmpty()) {
        System.out.println("No hay coches con esos kilómetros en esa lista: ");
        return;
    }

    Coches_EJ2 coheMAxKilometros = Collections.max(coches, Comparator.comparing(Coches_EJ2::getKilometros));
    System.out.println("Coche más kílometros " + coheMAxKilometros);
}

public static void mostrarCochesOrdenadosKilometros(ArrayList<Coches_EJ2> coches) {
    ArrayList<Coches_EJ2> cochesOrdenados = new ArrayList<>(coches);
    cochesOrdenados.sort(Comparator.comparing(Coches_EJ2::getKilometros));

    for (Coches_EJ2 c : cochesOrdenados) {
        System.out.println(c);
    }
}
}
