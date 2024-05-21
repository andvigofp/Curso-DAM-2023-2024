package org.andres.java.jdbc.Instituto.util;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuAsignatura {
    public static void mostarMenu() throws SQLException {
        Scanner teclado = new Scanner(System.in);
        int opcion;

            do {
                System.out.println("\nMenú de Alumnos:");
                System.out.println("1. Insertar Alumno");
                System.out.println("2. Modificar Alumno");
                System.out.println("3. Eliminar Alumno");
                System.out.println("4. Volver al Menú Principal");
                System.out.print("Seleccione una opción: ");
                opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    AsiganturasBD.pedirDatos();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    MenuPrincipal.mostarMenu();
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

            }
        }while (opcion !=4);
    }
}

