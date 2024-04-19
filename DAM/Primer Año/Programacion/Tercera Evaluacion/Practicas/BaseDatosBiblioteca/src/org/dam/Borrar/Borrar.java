package org.dam.Borrar;

import org.dam.Conexion.Conexion;
import org.dam.CreacionBD.Creacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


/**
 * @Author: Andrés Fernández Pereira
 */
public class Borrar {
    static Scanner sc = new Scanner(System.in);

    public void eliminarLibro(Statement sentencia) {
        System.out.println("Dame nombre de libro que desea eleminar");
        ResultSet res = buscarLibro1(sentencia);

        if (res != null) {
            try {
                sentencia.execute("DELETE from libros where idLibro=" + res.getInt("idLibro") + ";");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }

    }

    public  void eliminarAutor(Statement sentencia) {
        System.out.println("Dame DNI de Autor que desea eleminar");
        ResultSet res = buscarAutor(sentencia);

        if (res != null) {
            try {
                sentencia.execute("DELETE from autores where DNI='" + res.getString("DNI") + "';");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El producto no se encuentra en la base de datos");
        }


    }

    public static ResultSet buscarLibro1(Statement sentencia) {
        String nomProd = null;

        try {
            nomProd = sc.nextLine();

            ResultSet result = sentencia.executeQuery("Select * from libros where titulo = '" + nomProd + "';");

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

    public static ResultSet buscarAutor(Statement sentencia) {
        String nomProd = null;

        try {
            nomProd = sc.nextLine();

            ResultSet result = sentencia.executeQuery("Select * from autores where DNI = '" + nomProd + "';");

            if (result.next()) {
                System.out.println("Los datos del autor buscado son: ");

                System.out.println(" DNI: " + result.getString("DNI"));
                System.out.println(" nombre: " + result.getString("nombre"));
                System.out.println(" nacionalidad: " + result.getString("nacionalidad"));
                System.out.println("-----------------------------------------");

                return result;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        return null;
    }
}
