package org.andres.example.Examen.Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_EJ2 {

    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        Coches_EJ2 cohes = new Coches_EJ2();
        ArrayList<Coches_EJ2> coches = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Coches");
            System.out.println("1. Agregar Coches: ");
            System.out.println("2. Mostrar todos los coches: ");
            System.out.println("3. Mostrar Coches por marca: ");
            System.out.println("4. Mostrar Coches por menos Kilómetros: ");
            System.out.println("5. Mostrar coche con más Kilómetros: ");
            System.out.println("6. Mostrar coches ordenados por kilometros: ");
            System.out.println("7. Salir");
            System.out.println("Selecciona una Opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    MEJ2.agregarCooches(coches,teclado);
                    break;
                case 2:
                    MEJ2.mostarTodosCoches(coches);
                    break;
                case 3:
                    MEJ2.mostarCochesMarca(coches,teclado);
                    break;
                case 4:
                    MEJ2.mostarCochesMenosKilometros(coches,teclado);
                    break;
                case 5:
                    MEJ2.motsrarCochesConMasKilometros(coches);
                    break;
                case 6:
                    MEJ2.mostrarCochesOrdenadosKilometros(coches);
                    break;
                case 7:
                    System.out.println("Fin del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo");
            }
        }while (opcion !=7);
        teclado.close();
    }
}
