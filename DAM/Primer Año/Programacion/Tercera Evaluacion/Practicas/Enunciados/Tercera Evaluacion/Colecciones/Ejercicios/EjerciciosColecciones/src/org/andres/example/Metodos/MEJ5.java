package org.andres.example.Metodos;

import org.andres.example.Modelo.Disco;

import java.util.ArrayList;
import java.util.Scanner;

public class MEJ5 {
    //Método para agreglar un disco
    public static void agregarDisco(ArrayList<Disco> album, Scanner teclado) {
        String codigo, autor, titulo, genero;
        int duracion;

        System.out.println("\nNUEVO DISCO===============");

        do {
            System.out.println("Por favor, introzca los datos del disco: ");
            System.out.print("Código: ");
            codigo = teclado.nextLine();

            if (existeDisco(album,codigo)) {
                System.out.println("Ese código ya existe en la base de datos.");
            }
        }while (existeDisco(album,codigo));

        System.out.print("Autor: ");
        autor = teclado.nextLine();
        System.out.print("Título: ");
        titulo = teclado.nextLine();
        System.out.print("Género: ");
        genero = teclado.nextLine();
        System.out.println("Duración: ");
        duracion = Integer.parseInt(teclado.nextLine());

        album.add(new Disco(codigo,autor,titulo,genero,duracion));

    }
    //Método para combrobar si existe el disco por el código
    public static boolean existeDisco(ArrayList<Disco> album, String codigo) {
        for (Disco d : album) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                return true;
            }
        }
        return false;
    }
    //Método para modificar los datos del albúm
    public static void modificarDisco(ArrayList<Disco> album, Scanner teclado) {
        String codigo, nuevoCodigo, nuevoAutor, nuevoTitulo, nuevoGenero, nuevaDuracion;

        System.out.println("\nMODIFICAR===========");

        System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
        codigo = teclado.nextLine();

        for (Disco d : album) {
            if (d.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
                System.out.println("Código: " + d.getCodigo());

                System.out.print("Nuevo  código");
                nuevoCodigo = teclado.nextLine();

                if (!nuevoCodigo.isEmpty()) {
                    d.setCodigo(nuevoCodigo);
                }

                System.out.println("Autor: " + d.getAutor());
                System.out.print("Nuevo autor: ");
                nuevoAutor = teclado.nextLine();
                if (!nuevoAutor.isEmpty()) {
                    d.setAutor(nuevoAutor);
                }

                System.out.println("Título: " + d.getTitulo());
                System.out.print("Nuevo título: ");
                nuevoTitulo = teclado.nextLine();
                if (!nuevoTitulo.isEmpty()) {
                    d.setTitulo(nuevoTitulo);
                }

                System.out.println("Género: " + d.getGenero());
                System.out.print("Nuevo género: ");
                nuevoGenero = teclado.nextLine();
                if (!nuevoGenero.isEmpty()) {
                    d.setGenero(nuevoGenero);
                }

                System.out.println("Duración: " + d.getDuracion());
                System.out.print("Nueva duración: ");
                nuevaDuracion = teclado.nextLine();
                if (!nuevaDuracion.isEmpty()) {
                    d.setDuracion(Integer.parseInt(nuevaDuracion));
                }
                System.out.println("Datos modificados correctamente.");
                return;
            }
        }

    }

    //Método para borrar un disco por el código
    public static void borrarDisco(ArrayList<Disco> album, Scanner teclado) {
        String codigo;

        System.out.println("\nBORRAR\n======");

        System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
        codigo = teclado.nextLine();;

        if (!album.contains(new Disco(codigo, "", "", "",0))) {
            System.out.println("Lo siento, el código introducido no existe.");
        }else {
            album.remove(album.indexOf(new Disco(codigo,"","","",0)));
            System.out.println("Album borrado. ");
        }
    }
}
