package org.dam.Consultar;
import org.dam.Conexion.Conexion;
import org.dam.CreacionBD.Creacion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 * @Author: Andrés Fernández Pereira
 */
public class Consultar {
    static Scanner sc = new Scanner(System.in);

    public void consultarLibro(Statement sentencia) {
        System.out.println("Dime el titulo del libro a consular");
        String titulo = sc.nextLine();
        sc = new Scanner(System.in);
        try {
            //Consultar datos de un libro por título
            ResultSet result = sentencia.executeQuery("Select * from libros where titulo = '" + titulo + "';");

            if (result.next()) {
                System.out.println(" ID Libro: " + result.getInt("idLibro"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println(" precio: " + result.getFloat("precio"));
                System.out.println(" autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");

            }else {
                System.out.println("idLibro no encontrado");
            }
        }catch (SQLException e) {
            System.out.println("Se ha producido un error al insertar");
        }

    }


    public void consultarNombre(Statement sentencia) {
        System.out.println("Dime el nombre del autor");
        String nombre = sc.nextLine();
        sc = new Scanner(System.in);
        int cont=0;
        try {
            //Introduciendo el nombre de un Autor nos visualice los datos de todos sus Libros.
            ResultSet result = sentencia.executeQuery("Select idlibro, titulo, precio, autor from libros join autores on DNI=autor where nombre = '" + nombre + "'");
            while (result.next()) {
                cont++;
                System.out.println("Libros " + cont + ": ");
                System.out.println(" ID Libro: " + result.getString("idLibro"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println(" Precio: " + result.getString("precio"));
                System.out.println(" Autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void listar(Statement sentencia) {
        int cont = 0;
        //Listar todos los libros de la base de datos
        try {
            ResultSet result = sentencia.executeQuery("Select * from libros");

            while (result.next()) {
                cont++;
                System.out.println("Libros " + cont + ": ");

                System.out.println(" ID Libro: " + result.getInt("idLibro"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println(" precio: " + result.getFloat("precio"));
                System.out.println(" autor: " + result.getString("autor"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        //Listar todos los autores con sus libros
        try {
            ResultSet result = sentencia.executeQuery("Select * from autores inner join libros");

            while (result.next()) {
                cont++;
                System.out.println("Autores " + cont + ": ");
                System.out.println(" Nombre: " + result.getString("nombre"));
                System.out.println(" Titulo: " + result.getString("titulo"));
                System.out.println("-----------------------------------------\n");
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
