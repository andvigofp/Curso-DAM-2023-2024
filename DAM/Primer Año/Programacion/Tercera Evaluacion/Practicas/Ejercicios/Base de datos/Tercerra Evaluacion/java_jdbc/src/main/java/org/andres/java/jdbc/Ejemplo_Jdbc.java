package org.andres.java.jdbc;

import java.sql.*;

public class Ejemplo_Jdbc {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3308/instituto?serverTimeZone=UTC";
        String username = "root";
        String password = "abc123.";


        try {
            Connection conn = DriverManager.getConnection(url,username,password);
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
