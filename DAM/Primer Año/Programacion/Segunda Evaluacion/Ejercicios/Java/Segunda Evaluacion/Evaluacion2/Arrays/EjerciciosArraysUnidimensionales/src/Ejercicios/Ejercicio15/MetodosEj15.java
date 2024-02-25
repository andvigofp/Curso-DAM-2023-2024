package Ejercicios.Ejercicio15;

import java.util.Random;
import java.util.Scanner;

public class MetodosEj15 {
    //Método para inicializar el estado de las mesas con valores aleatorios
    public static int[] inicializarEstadoMesas(Random random) {
        int[] estadoMesas = new int[10];

        for (int i = 0; i < estadoMesas.length; i++) {
            estadoMesas[i] = random.nextInt(5); // 0 a 4 personas
        }
        return estadoMesas;
    }

    // Método para atender a los clientes
    public static void atenderClientes(Scanner teclado, int[] estadoMesas) {
        int numComensales;
        do {
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            numComensales = teclado.nextInt();

            if (numComensales == -1) {
                System.out.println("Saliendo del programa...");
                break;
            }

            if (numComensales <= 0 || numComensales > 4) {
                System.out.println("Lo siento, no admitimos grupos de " + numComensales + " personas.");
                System.out.println("Haga grupos de 4 personas como máximo e intente de nuevo.");
                continue;
            }

            asignarMesa(numComensales, estadoMesas);

            // Mostrar el estado actualizado de las mesas
            System.out.println("Estado actualizado de las mesas:");
            mostrarEstadoMesas(estadoMesas);
        } while (numComensales != -1);
    }

    //Método para asignar una mesa al grupo de comensales
    public static void asignarMesa(int numComensales, int[] estadoMesas) {
        // Buscar mesa disponible para el grupo
        int mesaAsignada = -1;
        for (int i = 0; i < estadoMesas.length; i++) {
            if (estadoMesas[i] == 0 || estadoMesas[i] >= numComensales) {
                mesaAsignada = i + 1;
                break;
            }
        }

        // Si se encuentra una mesa adecuada, mostrar mensaje y actualizar el estado de la mesa
        if (mesaAsignada != -1) {
            System.out.println("Por favor, siéntense en la mesa número " + mesaAsignada + ".");
            // Actualizar el estado de la mesa asignada
            estadoMesas[mesaAsignada - 1] = Math.min(4, estadoMesas[mesaAsignada - 1] + numComensales);
        } else {
            System.out.println("Lo siento, no hay mesas disponibles para su grupo de " + numComensales + " personas.");
        }
    }

    //Método para mostrar el estado de las mesas
    public static void mostrarEstadoMesas(int[] estadoMesas) {
        System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.print("│Mesa nº: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("│ %2d ", i);
        }
        System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("│Ocupación");
        for (int ocupacion : estadoMesas) {
            System.out.printf("│ %2d ", ocupacion);
        }
        System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

}
