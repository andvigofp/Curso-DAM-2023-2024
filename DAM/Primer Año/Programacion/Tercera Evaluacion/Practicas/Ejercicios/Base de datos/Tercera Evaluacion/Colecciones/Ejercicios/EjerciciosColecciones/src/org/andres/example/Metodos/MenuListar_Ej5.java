package org.andres.example.Metodos;

import org.andres.example.Modelo.Disco;

import java.util.ArrayList;
import java.util.Scanner;
//Método menú de listar
public class MenuListar_Ej5 {
    public static void listar(ArrayList<Disco> album) {
        Scanner teclado = new Scanner(System.in);
        int opcionListado;
        do {
            MostrarMenus_Ej5.mostarMenuList();
            opcionListado = Integer.parseInt(teclado.nextLine());
            switch (opcionListado) {
                case 1:
                    mostrarDiscos(album);
                    break;
                case 2:
                    listarPorAutor(album,teclado);
                    break;
                case 3:
                    listadoPorGenero(album,teclado);
                    break;
                case 4:
                    listadoPorDuracion(album,teclado);
                    break;
                case 5:
                    System.out.println("Fin del programa: ");
                    break;
                default:
                    System.out.println("Opción no válida. Intentalo de nuevo:");

            }
        }while (opcionListado !=5);
    }
    //Método para mostrar todos los albumnes de múscia
    public static void mostrarDiscos(ArrayList<Disco> listaDiscos) {
        for (Disco d: listaDiscos) {
            System.out.println(d);
        }
    }
    //Método para listar pr autor
    public static void listarPorAutor(ArrayList<Disco> album, Scanner teclado) {
        String autor;

        System.out.print("Introduzca el autor: ");
        autor = teclado.nextLine();

        for (Disco d : album) {
            if (d.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(d);
            }
        }
    }

    //Método para listar por género
    public static void listadoPorGenero(ArrayList<Disco> album, Scanner teclado) {
        String genero;

        System.out.print("Introduzca el género: ");
        genero = teclado.nextLine();

        for (Disco d : album) {
            if (d.getGenero().equalsIgnoreCase(genero)) {
                System.out.println(d);
            }
        }
    }

    //Método para listar por duración que dura el disco
    public static void listadoPorDuracion(ArrayList<Disco> album, Scanner teclado) {
        int limiteInerior, limiteSuperior;

        System.out.println("Establezca el intervalo para duracción:");
        System.out.println("=======================================");
        System.out.print("Introduzca el límite inferior de duración en minutos: ");
        limiteInerior = Integer.parseInt(teclado.nextLine());
        System.out.print("Introduzca el límite superior de duración en minutos: ");
        limiteSuperior = Integer.parseInt(teclado.nextLine());

        for (Disco d : album) {
            if (d.getDuracion() >= limiteInerior && d.getDuracion() <= limiteSuperior) {
                System.out.println(d);
            }
        }
    }
}
