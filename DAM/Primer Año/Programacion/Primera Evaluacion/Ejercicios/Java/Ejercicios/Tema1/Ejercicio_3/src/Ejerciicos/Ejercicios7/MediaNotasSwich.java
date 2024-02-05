package Ejerciicos.Ejercicios7;

import java.util.Scanner;

public class MediaNotasSwich {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double nota1, nota2, nota3, media;

        // Solicitar las notas al usuario
        System.out.print("Introduce la primera nota: ");
        nota1 = scanner.nextDouble();

        System.out.print("Introduce la segunda nota: ");
        nota2 = scanner.nextDouble();

        System.out.print("Introduce la tercera nota: ");
        nota3 = scanner.nextDouble();

        // Verificar que las notas estén en el rango de 0 a 10
        if (nota1 >= 0 && nota1 <= 10 && nota2 >= 0 && nota2 <= 10 && nota3 >= 0 && nota3 <= 10) {
            // Calcular la media de las notas
            media = (nota1 + nota2 + nota3) / 3;

            // Redondear la media para utilizar en el switch
            int mediaRedondeada = (int) Math.round(media);

            // Utilizar un switch para mostrar mensajes según la media redondeada
            switch (mediaRedondeada) {
                case 0:
                    System.out.println("La media redondeada es 0.");
                    break;
                case 1:
                    System.out.println("La media redondeada es 1.");
                    break;
                // Agregar más casos según sea necesario
                default:
                    System.out.println("La media redondeada es " + mediaRedondeada + ".");
                    break;
            }
        } else {
            // Mensaje en caso de notas fuera de rango
            System.out.println("Datos no válidos. Por favor, introduce notas en el rango de 0 a 10.");
        }
    }
}
