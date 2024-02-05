package Ejerciicos.Ejercicios12;

import java.util.Scanner;

public class CuestionarioDiezPreguntasSwich {
    /**
     *Realiza un mini cuestionario con 10 preguntas tipo test sobre las asignaturas que se
     * imparten en el curso. Cada pregunta acertada sumará un punto. El programa
     * mostrará al final la calificación obtenida. Pásale el mini cuestionario a tus
     * compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las
     * diferentes asignaturas del curso.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializar contador de respuestas correctas
        int contadorRespuestasCorrectas = 0;
        //Variables
        String respuesta1,respuesta2,respuesta3,respuesta4,respuesta5,respuesta6,respuesta7,respuesta8,respuesta9,respuesta10;
        // Preguntas del cuestionario
        System.out.println("Mini Cuestionario - Asignaturas del Curso");
        System.out.println("=======================================");

        // Pregunta 1
        System.out.println("1. ¿En programación, qué es un bucle?");
        System.out.println("a) Un error en el código");
        System.out.println("b) Una instrucción que se repite");
        System.out.println("c) Un tipo de variable");
        System.out.print("Respuesta: ");
        respuesta1 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta1) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 2
        System.out.println("\n2. ¿Cuál de los siguientes es un sistema operativo?");
        System.out.println("a) Microsoft Word");
        System.out.println("b) Android");
        System.out.println("c) Photoshop");
        System.out.print("Respuesta: ");
        respuesta2 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta2) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 3
        System.out.println("\n3. ¿Qué es SQL?");
        System.out.println("a) Lenguaje de programación");
        System.out.println("b) Sistema operativo");
        System.out.println("c) Lenguaje de consulta de bases de datos");
        System.out.print("Respuesta: ");
        respuesta3 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta3) {
            case "c":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 4
        System.out.println("\n4. ¿Qué significa HTML?");
        System.out.println("a) Hyper Text Markup Language");
        System.out.println("b) High Technology Modern Language");
        System.out.println("c) Home Tool Markup Language");
        System.out.print("Respuesta: ");
        respuesta4 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta4) {
            case "a":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 5
        System.out.println("\n5. ¿Cuál de las siguientes no es una forma de almacenar datos?");
        System.out.println("a) Base de datos");
        System.out.println("b) Array");
        System.out.println("c) Tarjeta de crédito");
        System.out.print("Respuesta: ");
        respuesta5 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta5) {
            case "c":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 6
        System.out.println("\n6. ¿Qué es un algoritmo?");
        System.out.println("a) Una fórmula matemática");
        System.out.println("b) Un conjunto de instrucciones paso a paso");
        System.out.println("c) Un error de compilación");
        System.out.print("Respuesta: ");
        respuesta6 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta6) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 7
        System.out.println("\n7. ¿Cuál de las siguientes no es una herramienta de desarrollo?");
        System.out.println("a) Eclipse");
        System.out.println("b) Photoshop");
        System.out.println("c) Visual Studio");
        System.out.print("Respuesta: ");
        respuesta7 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta7) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 8
        System.out.println("\n8. ¿Qué es un firewall?");
        System.out.println("a) Un programa de edición de imágenes");
        System.out.println("b) Un dispositivo de seguridad de red");
        System.out.println("c) Un lenguaje de programación");
        System.out.print("Respuesta: ");
        respuesta8 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta8) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 9
        System.out.println("\n9. ¿Cuál es el propósito de un diagrama de flujo?");
        System.out.println("a) Representar la evolución del tiempo");
        System.out.println("b) Mostrar el flujo de datos en un programa");
        System.out.println("c) Describir un flujo de agua");
        System.out.print("Respuesta: ");
        respuesta9 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta9) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Pregunta 10
        System.out.println("\n10. ¿Cuál de las siguientes no es una base de datos relacional?");
        System.out.println("a) MySQL");
        System.out.println("b) MongoDB");
        System.out.println("c) PostgreSQL");
        System.out.print("Respuesta: ");
        respuesta10 = scanner.nextLine().trim().toLowerCase();

        switch (respuesta10) {
            case "b":
                contadorRespuestasCorrectas++;
                break;
        }

        // Mostrar resultado final
        System.out.println("\nCuestionario completado. Tu calificación es: " + contadorRespuestasCorrectas + "/10");
    }
}
