package org.dam.Conexion;

import org.dam.CreacionBD.Creacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: Andrés Fernández Pereira
 */

    public class Conexion {

        Connection conect=null;
        public Statement sentencia=null;



        public Connection conectar() {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            String url = "jdbc:mariadb://localhost:3306/?user=root&password=abc123.";
            System.out.println("Se ha conectado correctamente");
            try {
                conect = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println("No hay ningún driver que reconozca la URL especifica");
            } catch (Exception e) {
                System.out.println("Se ha encontrado algún otro error");
            }

            try {
                sentencia = conect.createStatement();
            } catch (SQLException ex) {
                System.out.println("Error");
            }
            Creacion.crearBase(sentencia);
            return conect;
        }

        public void descoectar() {
            try {
                conect.close();
                System.out.println("Se desconecto correctamente");
            } catch (SQLException e) {
                System.out.println("No se pudo cerrar conexión");
            }
        }



    }

