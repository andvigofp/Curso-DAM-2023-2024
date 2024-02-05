package Ejericicios.Ejercicio6;

import java.util.Scanner;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una opción:");
        System.out.println("1. Guardar resultado en archivo .txt");
        System.out.println("2. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                guardarResultadoEnArchivo();
                break;
            case 2:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void guardarResultadoEnArchivo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el resultado a guardar en el archivo:");
        int resultado = scanner.nextInt();

        try {
            FileWriter fileWriter = new FileWriter("resultado.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(resultado);
            printWriter.close();

            System.out.println("Resultado guardado en resultado.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
