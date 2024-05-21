package org.andres.java.jdbc.Instituto.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    Connection conect = null;
    public Statement sentencia = null;

    public Connection coonectar() {
         String  url = "jdbc:mysql://localhost:3308/instituto?serverTimeZone=UTC";
         String username = "root";
         String password = "abc123.";
         System.out.println("Se ha conectado correctamente");

        try {
            conect = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            System.out.println("No hay ningún driver que reconozca URL especifica");
        }catch (Exception e) {
            System.out.println("Se ha encontrado algún otro error ");
        }

        try {
            sentencia = conect.createStatement();
        } catch (SQLException e) {
            System.out.println("Error");
        }
        return conect;
    }
    public void desconectar() {
        try {
            conect.close();
            System.out.println("Se desconecto correctamente");
        } catch (SQLException e) {
            System.out.println("No se pudo cerrar conexión");
        }
    }
}
