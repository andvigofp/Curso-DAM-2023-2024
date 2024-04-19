package org.dam.CreacionBD;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: Andrés Fernández Pereira
 */
public class Creacion {
    public static void crearBase(Statement sentencia) {

        {
          try {
              String bd = "biblioteca";
              sentencia.execute("CREATE DATABASE IF NOT EXISTS " + bd + ";");
              sentencia.execute("USE "+ bd + ";");

              sentencia.execute("CREATE TABLE IF NOT EXISTS AUTORES"
                      + "(DNI VARCHAR(9) not null,"
                      + "nombre VARCHAR(30) not null,"
                      + "nacionalidad VARCHAR(30) not null,"
                      + "Primary key (DNI))"
                      + "ENGINE INNODB");


              sentencia.execute("CREATE TABLE IF NOT EXISTS LIBROS"
                      + "(idLibro INT(5) unsigned zerofill not null auto_increment,"
                      + "titulo VARCHAR(30) not null,"
                      + "precio float not null,"
                      + "autor VARCHAR(9) not null,"
                      + "Primary key (idLibro))"
                      + "ENGINE INNODB;");
              sentencia.execute("Alter table LIBROS  add Foreign key(autor) references autores(DNI) ON UPDATE CASCADE ON DELETE CASCADE" );
          }catch (SQLException e) {
              System.out.println(e);
          }
        }
    }


}
