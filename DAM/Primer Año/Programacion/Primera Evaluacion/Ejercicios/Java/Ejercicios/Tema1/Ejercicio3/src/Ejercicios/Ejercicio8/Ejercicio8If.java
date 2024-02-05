package Ejercicios.Ejercicio8;

import java.util.Scanner;

public class Ejercicio8If {
    /**
     *Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente,
     * bien, notable o sobresaliente).
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo double
        double nota1, nota2, nota3, media;
        //Variables tipo Strin
        String continuar, boletin;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Incio
            //imprima por pantalla
            System.out.println("Introduce primera nota:");
            //Leer por teclado
            nota1 = teclado.nextDouble();
            //Imprima por pantalla
            System.out.println("Introduce la segunda nota:");
            //Leer por teclado
            nota2 = teclado.nextDouble();
            //Imprima por teclado
            System.out.println("introduce la tercera nota:");
            //Leer por teclado
            nota3 = teclado.nextDouble();
            //Para coger los métodos de una funcón, hacer las operaciones
            media = calcularMedia(nota1, nota2, nota3);
            boletin = calcularBoletin(media);
            //Imprimir el resultado
            System.out.println("La media de las notas es: " + media);
            System.out.println("Calificación del boletín: " + boletin);
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //imprima por pantalla
        System.out.println("A salido correctamente.");
        //Fin
    }
    //Función para calcular la media de las notas
    //Operaciones
    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    //Función para hacer menú del boletín de las notas, con la condición del if
    private static String calcularBoletin(double media) {
        if (media < 5.0) {
            return "Insuficiente";
        } else if (media < 6.0) {
            return "Suficiente";
        } else if (media < 7.0) {
            return "Bien";
        } else if (media < 9.0) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }
}

