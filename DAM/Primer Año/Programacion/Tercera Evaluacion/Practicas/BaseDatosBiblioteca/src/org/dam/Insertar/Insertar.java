package org.dam.Insertar;
import org.dam.Conexion.Conexion;
import org.dam.CreacionBD.Creacion;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Insertar {



    //Inserción de un nuevo Autor.
    public  void insertarAutor (Statement sentencia){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame DNI de autor");
        String DNI = sc.nextLine();
        System.out.println("Dime nombre del autor");
        String nombre = sc.nextLine();
        System.out.println("Dime la nacionalidad del autor");
        String nacionalidad = sc.nextLine();
        sc = new Scanner(System.in);
        try {
            int valor = sentencia.executeUpdate("INSERT INTO AUTORES (DNI, nombre, nacionalidad) VALUES ('" + DNI + "','" + nombre + "','" + nacionalidad  + "' );");
            if (valor == 1) {
                System.out.println("Se ha insertado correctamente  el autor");
            }else {
                System.out.println("El autor no se inserto correctamente");
            }
        }catch (SQLException e) {
            System.out.println("Se ha producido un error al insertar");
        }
    }

    //Inserción de un nuevo Libro (para la inserción de un Libro es necesario que ya exista el
    //Autor).
    //En DNI tienes que introducir el DNI el autor, pero tiene que existir ese DNI.
    public void insertarLibro(Statement sentencia) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Dime el precio del libro");
        float precio = sc.nextFloat();
        sc.nextLine();
        System.out.println("Dime el DNI del Autor");
        String DNI = sc.nextLine();
        sc = new Scanner(System.in);
        try {
            int valor = sentencia.executeUpdate("INSERT INTO LIBROS (titulo, precio, autor) VALUES ('" + titulo + "','" + precio + "','" + DNI + "' );");
            if (valor == 1) {
                System.out.println("Se ha insertado correctamente  el autor");
            }else {
                System.out.println("El autor no se inserto correctamente");
            }
        }catch (SQLException e) {
            System.out.println("Se ha producido un error al insertar");
        }
    }


}
