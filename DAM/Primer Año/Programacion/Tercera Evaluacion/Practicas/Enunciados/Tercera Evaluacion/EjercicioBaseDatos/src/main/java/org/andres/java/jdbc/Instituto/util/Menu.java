package org.andres.java.jdbc.Instituto.util;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    static Scanner teclado = new Scanner(System.in);
    static Conexion c = new Conexion();
    static insertar i = new insertar();

    public static void main(String[] args) {

        try {
            c.sentencia = c.coonectar().createStatement();
        } catch (SQLException e) {
            System.out.println("Error");
        }
        int opcion;
        do {
            System.out.println("-- Registro --");
            System.out.println("1- Insertar Alumnos");
            System.out.println("2- Insertar Libro");
            System.out.println("3- Eliminar Libro");
            System.out.println("4- Eliminar Autor");
            System.out.println("5- Consultar Libros");
            System.out.println("6- Consultar Autores");
            System.out.println("7- Listar Libros/Autores");
            System.out.println("8- Modificar Libros");
            System.out.println("9- Modificar Autor");
            System.out.println("0- Salir");

            opcion = teclado.nextInt();
            teclado = new Scanner(System.in);

            switch (opcion) {
                case 1:
                    i.insertarAlumnos(c.sentencia);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:

                    break;
            }

        }while (opcion !=0);
    }
}

