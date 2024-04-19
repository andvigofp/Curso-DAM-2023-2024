import org.dam.Borrar.Borrar;
import org.dam.Conexion.Conexion;
import org.dam.Consultar.Consultar;
import org.dam.CreacionBD.Creacion;
import org.dam.Insertar.Insertar;
import org.dam.Modificar.Modificar;

import java.sql.*;
import java.util.Scanner;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Principal {
    static Scanner sc = new Scanner(System.in);
    static Conexion c = new  Conexion();
    static Insertar i = new Insertar();
    static Borrar b = new Borrar();
    static Consultar con = new Consultar();
    static Modificar m = new Modificar();

    public static void main(String[] args) {


        try {
            c.sentencia = c.conectar().createStatement();
        }catch (SQLException e) {
            System.out.println("Error");
        }
        Creacion.crearBase(c.sentencia);

        int opcion;
        do {
            System.out.println("-- Registro --");
            System.out.println("1- Insertar Autores");
            System.out.println("2- Insertar Libro");
            System.out.println("3- Eliminar Libro");
            System.out.println("4- Eliminar Autor");
            System.out.println("5- Consultar Libros");
            System.out.println("6- Consultar Autores");
            System.out.println("7- Listar Libros/Autores");
            System.out.println("8- Modificar Libros");
            System.out.println("9- Modificar Autor");
            System.out.println("0- Salir");

            opcion = sc.nextInt();
            sc = new Scanner(System.in);

            switch (opcion) {
                case 1:
                    i.insertarAutor(c.sentencia);
                    break;
                case 2:
                    i.insertarLibro(c.sentencia);
                    break;
                case 3:
                    b.eliminarLibro(c.sentencia);
                    break;
                case 4:
                    b.eliminarAutor(c.sentencia);
                    break;
                case 5:
                    con.consultarLibro(c.sentencia);
                    break;
                case 6:
                    con.consultarNombre(c.sentencia);
                    break;
                case 7:
                    con.listar(c.sentencia);
                    break;
                case 8:
                    m.modificarLibro(c.sentencia);
                    break;
                case 9:
                    m.modificarAutor(c.sentencia);
                    break;
            }

        }while (opcion !=0);
    }
    }




