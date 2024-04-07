package Ejerciicos.Ejercicios8;

import java.util.Scanner;

public class MediaNotasBoletinSwich {
    /**
     * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente,
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

            // Redondear la media para utilizar en el switch
            int mediaRedondeada = (int) Math.round(media);

            // Utilizar un switch para categorizar la nota del boletín
            switch (mediaRedondeada) {
                case 0,1,2,3,4:
                    boletin="Insuficente";
                    System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);
                    break;
                case 5:
                    boletin="Suficiente";
                    System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);
                case 6:
                    boletin="Bien";
                    System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);
                    break;
                case 7,8:
                    boletin="Notable";
                    System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);
                    break;
                case 9,10:
                    boletin="Sobresaliente";
                    System.out.println("La media redondeada es " + mediaRedondeada + "." + " Boletín de notas: " + boletin);
                    break;
                default:
                    System.out.println("La media redondeada está fuera de rango.");
                    break;
            }
        } else {
            // Mensaje en caso de notas fuera de rango
            System.out.println("Datos no válidos. Por favor, introduce notas en el rango de 0 a 10.");
        }
    }
}