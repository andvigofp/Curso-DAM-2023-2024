package org.dam.Modificar;
import org.dam.Conexion.Conexion;
import org.dam.CreacionBD.Creacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Modificar {
    static Scanner sc = new Scanner(System.in);
    public void modificarLibro(Statement sentencia) {
        System.out.println("Dame titulo del libro a modificar");
        ResultSet res = buscarLibro2(sentencia);
        if (res != null) {
            System.out.println("Introduzca nuevo titulo del libro:");
            String nombre = sc.nextLine();
            sc = new Scanner(System.in);
            try {
                sentencia.executeUpdate("UPDATE libros set titulo='" + nombre + "' where idLibro = '" + res.getInt("idLibro") + "';");
                System.out.println("Se ha actualizado Correctamente");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }

    public void modificarAutor(Statement sentencia) {
        System.out.println("Dame DNI del autor a modificar");
        ResultSet res = buscarAutor2(sentencia);
        if (res != null) {
            System.out.println("Introduzca nombre nuevo al autor:");
            String nombre = sc.nextLine();
            sc = new Scanner(System.in);
            try {
                sentencia.executeUpdate("UPDATE autores set nombre='" + nombre + "' where DNI = '" + res.getString("DNI") + "';");
                System.out.println("Se ha actualizado Correctamente");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }
    }

    public static ResultSet buscarLibro2(Statement sentencia) {
        String nomProd = null;

        try {
            nomProd = sc.nextLine();

            ResultSet result = sentencia.executeQuery("Select * from libros where autor = '" + nomProd + "';");

            if (result.next()) {
                System.out.println("Los datos del libro buscado son: ");

                System.out.println(" ID Libro: " + result.getInt("idLibro"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println(" Precio: " + result.getFloat("precio"));
                System.out.println(" Autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }

    public static ResultSet buscarAutor2(Statement sentencia) {
        String nomProd = null;

        try {
            nomProd = sc.nextLine();

            ResultSet result = sentencia.executeQuery("Select * from autores where DNI = '" + nomProd + "';");

            if (result.next()) {
                System.out.println("Los datos del autor buscado son: ");

                System.out.println(" DNI: " + result.getString("DNI"));
                System.out.println(" Nombre: " + result.getString("nombre"));
                System.out.println(" Nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
