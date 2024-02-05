package Ejercicios.Ejercicio12;

import java.text.Normalizer;
import java.util.Scanner;

public class Ejercicio12Switch {
    /**
     *Realiza un mini cuestionario con 10 preguntas tipo test sobre las asignaturas que se
     * imparten en el curso. Cada pregunta acertada sumará un punto. El programa
     * mostrará al final la calificación obtenida. Pásale el mini cuestionario a tus
     * compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las
     * diferentes asignaturas del curso.
     */
    public class MiniCuestionarioConSwitch {
        public static void main(String[] args) {
            //Salida por teclado
            Scanner teclado = new Scanner(System.in);
            //Variable tipo entero
            int calificacion, pregunta;
            //Incializa la variable
            calificacion = 0;
            //Variable tipo String
            String respuesta;
            //Imprima por pantalla
            System.out.println("¡Bienvenido al mini cuestionario!");
            System.out.println("Responde a las siguientes preguntas con 'a', 'b', o 'c'.");
            System.out.println("Para salir, ingresa '0' en cualquier momento.");
            //Bucle while se repite hasta que se cumpla una condición
            while (true) {
                //Imprima por pantalla
                System.out.println("Elige una pregunta del 1 al 10 (o ingresa 0 para salir): ");
                //Leer por teclado
                pregunta = teclado.nextInt();
                //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición, Pulsemos 0 para salir
                if (pregunta == 0) {
                    System.out.println("Cuestionario finalizado.");
                    break;
                }
                //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
                switch (pregunta) {
                    case 1:
                        System.out.println("¿Cuál es la capital de Francia?");
                        System.out.println("a) París");
                        System.out.println("b) Londres");
                        System.out.println("c) Madrid");
                        break;
                    // Agrega más casos para otras preguntas aquí

                    default:
                        System.out.println("Pregunta no válida.");
                        continue; // Salta al siguiente ciclo del bucle
                }
                //Imprima por pantalla
                System.out.print("Tu respuesta: ");
                //Convertir minuscualas a mayúsculas y quitarlosAcentos
                respuesta = quitarAcentos(teclado.nextLine().toLowerCase());
                //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
                switch (respuesta) {
                    case "a":
                        System.out.println("¡Respuesta correcta!\n");
                        calificacion++;
                        break;
                    case "0":
                        System.out.println("Cuestionario finalizado.");
                        break;
                    default:
                        System.out.println("Respuesta incorrecta. La respuesta correcta es 'a) París'.\n");
                }
            }

            System.out.println("Tu calificación es: " + calificacion);
        }
    }
    //Fin

    // Función para quitar acentos de una cadena de texto
    public static String quitarAcentos(String input) {
        return Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
}
