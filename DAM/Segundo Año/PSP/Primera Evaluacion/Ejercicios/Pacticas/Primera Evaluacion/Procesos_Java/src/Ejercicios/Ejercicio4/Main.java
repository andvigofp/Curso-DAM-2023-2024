package Ejericicios.Ejercicio4;

import java.io.*;

public class Main {
        public static void main(String[] args) throws IOException, InterruptedException {
            ProcessBuilder pb = new ProcessBuilder("java", "Ejericicios.Ejercicio4.LeerNombre", "Andres");
            pb.directory(new File(".\\out\\production\\Procesos_Java\\"));

            Process p = pb.start();
            //Aquí recogemos la salida que nos dejó nuestro proceso hijo
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            //Recogemos la salida del proceso
            System.out.println("El proceso hijo a finalizado con la salida: " + p.waitFor());

            //En caso de que hubiera algún error, lo podemos recoger con la siguiente linea
            BufferedReader brError = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            while ((line = brError.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

