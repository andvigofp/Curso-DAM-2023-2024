package org.andres.java.jdbc.Instituto.util;

import java.sql.SQLException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void mostarMenu() throws SQLException {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú Principal:");
            System.out.println("1. Gestionar Alumnos");
            System.out.println("2. Gestionar Asignaturas");
            System.out.println("3. Gestionar Cursos");
            System.out.println("4. Gestionar Notas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                  MenuAsignatura.mostarMenu();
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");

            }
        }while (opcion !=5);
    }


}
