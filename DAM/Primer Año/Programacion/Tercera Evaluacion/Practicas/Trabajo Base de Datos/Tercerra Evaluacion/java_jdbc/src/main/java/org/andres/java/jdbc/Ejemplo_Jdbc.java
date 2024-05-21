package org.andres.java.jdbc;

import org.andres.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;

public class Ejemplo_Jdbc {
    public static void main(String[] args) {


        try {
            Connection conn = ConexionBaseDatos.getInstance();
            Statement stmt = conn.createStatement();
            ResultSet resultado = stmt.executeQuery("SELECT * FROM asignaturas");
            while (resultado.next()) {
                System.out.println("resultado.getString(\"nomasig\") = " + resultado.getString("nomasig"));
                System.out.println("resultado.getInt(\"codasig\") = " + resultado.getInt("codasig"));
                System.out.println("resultado.getInt(\"horas\") = " + resultado.getInt("horas"));
            }
            resultado.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
