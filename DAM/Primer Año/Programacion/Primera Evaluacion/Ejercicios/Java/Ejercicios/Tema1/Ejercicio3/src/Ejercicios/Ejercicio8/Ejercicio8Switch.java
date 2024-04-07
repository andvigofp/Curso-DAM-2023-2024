package Ejercicios.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8Switch {
    /**
     * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente,
     * bien, notable o sobresaliente).
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo double
        double nota1, nota2, nota3, media;
        //Variables tipo String
        String continuar, boletin;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Incio
            //Imprima por pantalla
            System.out.println("Introduce la primera nota:");
            //Leer por teclado
            nota1 = teclado.nextDouble();
            //Imprima por pantalla
            System.out.println("Introduce la segunda nota:");
            //Leer por teclado
            nota2 = teclado.nextDouble();
            //Imprima por pantalla
            System.out.println("Introduce la tercera nota:");
            //Leer por teclado
            nota3 = teclado.nextDouble();
            //Para coger los métodos de una funcón, hacer las operaciones
            media = calcularMedia(nota1, nota2, nota3);
            boletin = calcularBoletin(media);
            //Imprima el resultado
            System.out.println("La media de las notas es: " + media);
            System.out.println("Calificación del boletín: " + boletin);
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprima por teclado
        System.out.println("A Salido correctamente.");
        //Fin
    }
    //Función para calcular la media de las notas
    //Operaciones
    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    //Función para hacer menú del boletín de las notas, con la condición del swich con diferentes casos
    private static String calcularBoletin(double media) {
        switch ((int) media) {
            case 0,1,2,3,4:
                return "Insuficiente";
            case 5:
                return "Suficiente";
            case 6:
                return "Bien";
            case 7,8:
                return "Notable";
            default:
                return "Sobresaliente";
        }
    }
}

