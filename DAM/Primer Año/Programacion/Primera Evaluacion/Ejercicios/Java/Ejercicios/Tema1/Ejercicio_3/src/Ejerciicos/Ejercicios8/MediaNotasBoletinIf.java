package Ejerciicos.Ejercicios8;

import java.util.Scanner;

public class MediaNotasBoletinIf {
    /**
     *Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente,
     * bien, notable o sobresaliente).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        double nota1, nota2, nota3, media;
        String boletin;

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

            // Redondear la media
            int mediaRedondeada = (int) Math.round(media);

            // Categorizar la nota del boletín utilizando if
            if (mediaRedondeada >= 0 && mediaRedondeada < 5) {
                boletin = "Insuficiente";
            } else if (mediaRedondeada < 6) {
                boletin = "Suficiente";
            } else if (mediaRedondeada < 7) {
                boletin = "Bien";
            } else if (mediaRedondeada < 9) {
                boletin = "Notable";
            } else {
                boletin = "Sobresaliente";
            }

            // Mostrar el resultado
            System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);

        } else {
            // Mensaje en caso de notas fuera de rango
            System.out.println("Datos no válidos. Por favor, introduce notas en el rango de 0 a 10.");
        }
    }
}


