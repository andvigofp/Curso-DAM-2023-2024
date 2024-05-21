package org.andres.java.jdbc.Instituto.util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AsiganturasBD {
    private static final String INSERTAR_ASIGNATURA = "INSERT INTO asignaturas (nomasig, horas) VALUES (?, ?)";

    public static void insertarAsignatura(int codasig, String nombre, int horas) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexionBaseDatos.getInstance();
            stmt = conn.prepareStatement(INSERTAR_ASIGNATURA);
            stmt.setInt(1,codasig);
            stmt.setString(2, nombre);
            stmt.setInt(3, horas);
            stmt.executeUpdate();
            System.out.println("Asignatura insertada correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar la asignatura: " + e.getMessage());
        } finally {
            // Cerrar los recursos
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void pedirDatos() {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Insegre el código de la asignatura");
            int codaasig = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Ingrese el nombre de la asignatura: ");
            String nomasig = teclado.nextLine();
            System.out.print("Ingrese el número de horas de la asignatura: ");
            int horas = teclado.nextInt();
            insertarAsignatura(codaasig,nomasig, horas);
        } catch (SQLException e) {
            System.out.println("Error al insertar la asignatura: " + e.getMessage());
        }
    }
}