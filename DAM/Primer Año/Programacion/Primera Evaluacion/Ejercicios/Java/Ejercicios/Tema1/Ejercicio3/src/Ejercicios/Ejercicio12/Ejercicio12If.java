package Ejercicios.Ejercicio12;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio12If {
    /**
     *Realiza un mini cuestionario con 10 preguntas tipo test sobre las asignaturas que se
     * imparten en el curso. Cada pregunta acertada sumará un punto. El programa
     * mostrará al final la calificación obtenida. Pásale el mini cuestionario a tus
     * compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las
     * diferentes asignaturas del curso.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo entero
        int calificacion, totalPreguntas, pregunta;
            //Incializa la variable
            calificacion = 0;
            totalPreguntas = 10;
        //Variable tipo String
        String respuesta;
        //Imprima por pantalla
        System.out.println("¡Bienvenido al mini cuestionario!");
        System.out.println("Responde a las siguientes 10 preguntas con 'a', 'b', o 'c'.");
        System.out.println("Para salir, ingresa '0' en cualquier momento.");

        pregunta = 1;
        //Bucle while se repite hasta que se cumpla una condición
        while (pregunta <= totalPreguntas) {
            //Inciio
            //Imprima por pantalla
            System.out.println("\nPregunta " + pregunta + ":");
            //Menú de opcines
            System.out.println("¿Cuál es la capital de Francia?");
            System.out.println("a) Paris");
            System.out.println("b) Londres");
            System.out.println("c) Madrid");
            //Imprima por pantalla
            System.out.print("Tu respuesta: ");
            //Convertir minuscualas a mayúsculas y quitarlosAcentos
            respuesta = quitarAcentos(teclado.nextLine().toLowerCase());

            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición
            if (respuesta.equals("a")) {
                System.out.println("¡Respuesta correcta!\n");
                calificacion++;
            } else if (respuesta.equals("0")) {
                System.out.println("Cuestionario finalizado.");
                break;
            } else {
                System.out.println("Respuesta incorrecta. La respuesta correcta es 'a) París'.\n");
            }
            //contador
            pregunta++;
        }
        //Imprima el resultado
        System.out.println("Tu calificación es: " + calificacion + " de " + totalPreguntas);
    }
    //Fin

    // Función para quitar acentos de una cadena de texto
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}

