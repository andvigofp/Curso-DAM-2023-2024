package org.andres.example.Ejercicio5;


import org.andres.example.Ejercicio3.MEJ3;
import org.andres.example.Ejercicio3.Menu_Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu_EJ5 {
    //Método Menú de opciones
    public static void Menu() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pedidos_Ej5> pedidos = new ArrayList<>();

        int opciones;

        do {
            MEJ5.Mostrarmenu();

            opciones = teclado.nextInt();
            teclado.nextLine();

            switch (opciones) {
                case 1:
                    MEJ5.aggregarProductos(pedidos,teclado);
                    break;
                case 2:
                    MEJ5.listarTodosProductos(pedidos);
                    break;
                case 3:
                    MEJ5.mostarCantidadPedidos(pedidos);
                    break;
                case 4:
                    MEJ5.mostrarImportetotal(pedidos);
                    break;
                case 5:
                    MEJ5.mostrarResumen(pedidos);
                    break;
                case 6:
                    System.out.println("Fin del programa..");
                    break;
                default:
                    System.out.println("Error: no has elegido la opción correcta");
            }
        }while (opciones !=6);
    }
}

