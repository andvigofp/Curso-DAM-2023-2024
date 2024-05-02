package org.andres.example.Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal {
    public static void mostrarMenu(ArrayList<Disco> album, Scanner teclado) {

        int opcion;
        do {
            MostrarMenus.mostrarMenu();
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    MenuListar.listar(album);
                    break;
                case 2:
                    MEJ5.agregarDisco(album,teclado);
                    break;
                case 3:
                    MEJ5.modificarDisco(album,teclado);
                    break;
                case 4:
                    MEJ5.borrarDisco(album,teclado);
                    break;
                case 5:
                    System.out.println("Fin del programa....");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }while (opcion !=5);
    }
    }

