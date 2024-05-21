package org.andres.example.Ejercicio2;

import java.util.Scanner;

public class Menu_Ej2 {

    public void menu() {
        Scanner teclado = new Scanner(System.in);
        GestionarCoches_Ej2 coches = new GestionarCoches_Ej2();
        int opcion;

        do {
            System.out.println("\nMenú de Gestión de Coches:");
            System.out.println("1. Agregar coche");
            System.out.println("2. Mostrar todos los coches");
            System.out.println("3. Mostrar coches por marca");
            System.out.println("4. Mostrar coches por kilómetros");
            System.out.println("5. Mostrar coche con más kilómetros");
            System.out.println("6. Mostrar coches ordenados por kilómetros");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    coches.agregarCoche(teclado);
                    break;
                case 2:
                    System.out.println("\nTodos los coches introducidos:");
                    coches.mostrarTodosLosCoches();
                    break;
                case 3:
                    coches.mostrarCochesPorMarca(teclado);
                    break;
                case 4:
                    coches.mostrarCochesPorKilometros(teclado);
                    break;
                case 5:
                    System.out.println("El coche con más kilómetros:");
                    coches.mostrarCocheConMasKilometros();
                    break;
                case 6:
                    System.out.println("Todos los coches ordenados por número de kilómetros (de menor a mayor):");
                    coches.mostrarCochesOrdenadosPorKilometros();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 7);

        teclado.close();
    }
}
