package Ejericicios.SumaV1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
    public static void main(String[] args) {
        //Inico
        try {
            //Variable tipo Entero
            int sumaTotal, contador;
            sumaTotal = 0;
            contador = 0;
            //Variable tipo String
            String line;
            //boolean continuar = true;

            //while (continuar) {
            //Creamos un proceso, para que pueda ejecutar el otro proceso SumaDosNumeros
                Process proceso = Runtime.getRuntime().exec("java Ejercicios.SumaV1.SumaDosNumeros");
                proceso.waitFor(); // Esperar a que el proceso termine

            //Utiizamos BuffeReader para que pueda traer el archivo resultado y mostrar los resultados de la suma del proceso SumaDosNumeros
                try (BufferedReader br = new BufferedReader(new FileReader("resultado.txt"))) {
                    while ((line = br.readLine()) != null) {
                        System.out.println(line); // Mostrar el resultado de SumaDosNumeros
                    }
                }

                try (BufferedReader br = new BufferedReader(new FileReader("resultado.txt"))) {
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("La suma total de los números es:")) {
                            sumaTotal +=Integer.parseInt(line.split(":")[1].trim());
                            contador++;
                        }
                    }
                }

                System.out.println("Suma total acumulada de " + contador + " ejecuciones: " + sumaTotal);

                //System.out.print("¿Desea realizar otra suma? (Sí=1 / No=0): ");
                //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                //String respuesta = bufferedReader.readLine();
                /**if ("0".equals(respuesta)) {
                    continuar = false;
                }*/
            //}
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        //FIn
    }
}
