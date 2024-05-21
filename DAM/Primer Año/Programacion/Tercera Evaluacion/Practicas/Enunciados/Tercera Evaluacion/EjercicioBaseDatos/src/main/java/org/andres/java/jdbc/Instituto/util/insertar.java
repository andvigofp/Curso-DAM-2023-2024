package org.andres.java.jdbc.Instituto.util;


import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertar {
    public void insertarAlumnos(Statement sentencia) {
        Scanner teclado = new Scanner(System.in);

        int codigo, curso;
        String nombre, direccion;

        System.out.println("Dime codigo del alumno a insertar: ");
        codigo= teclado.nextInt();
        teclado.nextLine();
        System.out.println("Dime nombre a insertar");
        nombre = teclado.nextLine();
        System.out.println("Dime direccion a insertar");
        direccion = teclado.nextLine();
        System.out.println("Dime código curso a insertar");
        curso = teclado.nextInt();

        try {
            int valor = sentencia.executeUpdate("INSERT INTO ALUMNOS (codalumn, nombre, direccion, curso) VALUES ('" + codigo + "','" + nombre + "','"
                    + direccion + "','" + curso + "' );");

            if (valor == 1) {
                System.out.println("Se ha insertado correctamente alumnos...");
            }else {
                System.out.println("El alumno no se inserto correctamente");
            }
        } catch (SQLException e) {
            System.out.println("Se ha producido un error al insertar el alumno: " + e.getMessage());
        }
        }

    }

