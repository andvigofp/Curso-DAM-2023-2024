package Ejercicios.Ejercicio15;

import java.util.Scanner;

public class Ejercicio15B {
    public static void main(String[] args) {
        int[] mesa = MetodosEj15B.generarMesasAleatorias();
        Scanner s = new Scanner(System.in);
        int clientes;

        do {
            MetodosEj15B.mostrarEstadoMesas(mesa);
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            clientes = Integer.parseInt(s.nextLine());

            if (clientes > 4) {
                System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
            } else {
                if (MetodosEj15B.hayMesaVacia(mesa)) {
                    int mesaVacia = MetodosEj15B.buscarMesaVacia(mesa);
                    mesa[mesaVacia] = clientes;
                    System.out.println("Por favor, siéntense en la mesa número " + (mesaVacia + 1) + ".");
                } else {
                    if (MetodosEj15B.hayHuecoParaGrupo(mesa, clientes)) {
                        int hueco = MetodosEj15B.buscarHuecoParaGrupo(mesa, clientes);
                        mesa[hueco] += clientes;
                        System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número " + (hueco + 1) + ".");
                    } else {
                        System.out.println("Lo siento, en estos momentos no queda sitio.");
                    }
                }
            }
        } while (clientes != -1);
    }
}