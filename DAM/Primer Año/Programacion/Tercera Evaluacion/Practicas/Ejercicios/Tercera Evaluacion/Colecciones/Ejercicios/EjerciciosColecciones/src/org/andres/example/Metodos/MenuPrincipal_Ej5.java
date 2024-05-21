package org.andres.example.Metodos;

import org.andres.example.Modelo.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPrincipal_Ej5 {
    public static void mostrarMenu(ArrayList<Disco> album, Scanner teclado) {

        int opcion;
        do {
            MostrarMenus_Ej5.mostrarMenu();
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    MenuListar_Ej5.listar(album);
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

