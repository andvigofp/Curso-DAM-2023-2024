package org.andres.example.Set;

import org.andres.example.Metodos.MEJ13;
import org.andres.example.Modelo.Articulo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestisimal_Ej13 {

    public static void main(String[] args) {
        List<Articulo> almacen = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            MEJ13.mostrarMenu();
            opcion = MEJ13.leerEntero("Introduce una opcion: ",teclado);
            switch (opcion) {
                case 1:
                    MEJ13.listarArticulos(almacen);
                    break;
                case 2:
                    MEJ13.altaArticulo(almacen,teclado);
                    break;
                case 3:
                    MEJ13.bajaArticulo(almacen,teclado);
                    break;
                case 4:
                    MEJ13.modificarArticulo(almacen,teclado);
                    break;
                case 5:
                    MEJ13.entradaMercancia(almacen,teclado);
                    break;
                case 6:
                    MEJ13.salidaMercancia(almacen,teclado);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");

            }
        }while (opcion !=7);
    }
}
