package Ejercicios.Ejercicio15;

import java.util.Random;

public class MetodosEj15B {
    public static int[] generarMesasAleatorias() {
        int[] mesa = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mesa[i] = random.nextInt(5);
        }
        return mesa;
    }

    public static void mostrarEstadoMesas(int[] mesa) {
        System.out.println("\n┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
        System.out.print("│Mesa nº: ");
        for (int i = 1; i < 11; i++) {
            System.out.printf("│ %2d ", i);
        }
        System.out.println("│\n├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
        System.out.print("│Ocupación");
        for (int m : mesa) {
            System.out.printf("│ %2d ", m);
        }
        System.out.println("│\n└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    }

    public static boolean hayMesaVacia(int[] mesa) {
        for (int i = 0; i < mesa.length; i++) {
            if (mesa[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean hayHuecoParaGrupo(int[] mesa, int clientes) {
        for (int i = 0; i < mesa.length; i++) {
            if (clientes <= (4 - mesa[i])) {
                return true;
            }
        }
        return false;
    }

    public static int buscarMesaVacia(int[] mesa) {
        for (int i = mesa.length - 1; i >= 0; i--) {
            if (mesa[i] == 0) {
                return i;
            }
        }
        return -1; // Si no hay mesa vacía, devuelve -1
    }

    public static int buscarHuecoParaGrupo(int[] mesa, int clientes) {
        for (int i = mesa.length - 1; i >= 0; i--) {
            if (clientes <= (4 - mesa[i])) {
                return i;
            }
        }
        return -1; // Si no hay hueco para el grupo, devuelve -1
    }
}