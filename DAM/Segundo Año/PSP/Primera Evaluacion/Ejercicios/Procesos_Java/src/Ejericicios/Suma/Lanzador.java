package Ejericicios.Suma;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lanzador {
    public static void main(String[] args) {
        try {
            double sumaTotal = 0.0;
            int contador = 0;
            boolean continuar = true;

            while (continuar) {
                Process proceso = Runtime.getRuntime().exec("java Ejercicios.Suma.SumaDosNumeros");
                proceso.waitFor(); // Esperar a que el proceso termine

                try (BufferedReader br = new BufferedReader(new FileReader("resultado.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        System.out.println(line); // Mostrar el resultado de SumaDosNumeros
                    }
                }

                try (BufferedReader br = new BufferedReader(new FileReader("resultado.txt"))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("La suma total de los números es:")) {
                            sumaTotal += Double.parseDouble(line.split(":")[1].trim());
                            contador++;
                        }
                    }
                }

                //System.out.println("Suma total acumulada de " + contador + " ejecuciones: " + sumaTotal);

                System.out.print("¿Desea realizar otra suma? (Sí=1 / No=0): ");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                String respuesta = bufferedReader.readLine();
                if ("0".equals(respuesta)) {
                    continuar = false;
                }
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
