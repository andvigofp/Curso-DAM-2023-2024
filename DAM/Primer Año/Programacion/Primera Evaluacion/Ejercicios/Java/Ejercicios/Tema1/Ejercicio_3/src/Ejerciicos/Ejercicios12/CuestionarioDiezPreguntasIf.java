package Ejerciicos.Ejercicios12;

import java.util.Scanner;

public class CuestionarioDiezPreguntasIf {
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
        respuesta1 = scanner.nextLine().trim().toLowerCase();
        if (respuesta1.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 2
        System.out.println("\n2. ¿Cuál de los siguientes es un sistema operativo?");
        System.out.println("a) Microsoft Word");
        System.out.println("b) Android");
        System.out.println("c) Photoshop");
        respuesta2 = scanner.nextLine().trim().toLowerCase();
        if (respuesta2.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 3
        System.out.println("\n3. ¿Qué es SQL?");
        System.out.println("a) Lenguaje de programación");
        System.out.println("b) Sistema operativo");
        System.out.println("c) Lenguaje de consulta de bases de datos");
        respuesta3 = scanner.nextLine().trim().toLowerCase();
        if (respuesta3.equals("c")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 4
        System.out.println("\n4. ¿Qué significa HTML?");
        System.out.println("a) Hyper Text Markup Language");
        System.out.println("b) High Technology Modern Language");
        System.out.println("c) Home Tool Markup Language");
        respuesta4 = scanner.nextLine().trim().toLowerCase();
        if (respuesta4.equals("a")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 5
        System.out.println("\n5. ¿Cuál de las siguientes no es una forma de almacenar datos?");
        System.out.println("a) Base de datos");
        System.out.println("b) Array");
        System.out.println("c) Tarjeta de crédito");
        respuesta5 = scanner.nextLine().trim().toLowerCase();
        if (respuesta5.equals("c")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 6
        System.out.println("\n6. ¿Qué es un algoritmo?");
        System.out.println("a) Una fórmula matemática");
        System.out.println("b) Un conjunto de instrucciones paso a paso");
        System.out.println("c) Un error de compilación");
        respuesta6 = scanner.nextLine().trim().toLowerCase();
        if (respuesta6.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 7
        System.out.println("\n7. ¿Cuál de las siguientes no es una herramienta de desarrollo?");
        System.out.println("a) Eclipse");
        System.out.println("b) Photoshop");
        System.out.println("c) Visual Studio");
        respuesta7 = scanner.nextLine().trim().toLowerCase();
        if (respuesta7.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 8
        System.out.println("\n8. ¿Qué es un firewall?");
        System.out.println("a) Un programa de edición de imágenes");
        System.out.println("b) Un dispositivo de seguridad de red");
        System.out.println("c) Un lenguaje de programación");
        respuesta8 = scanner.nextLine().trim().toLowerCase();
        if (respuesta8.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 9
        System.out.println("\n9. ¿Cuál es el propósito de un diagrama de flujo?");
        System.out.println("a) Representar la evolución del tiempo");
        System.out.println("b) Mostrar el flujo de datos en un programa");
        System.out.println("c) Describir un flujo de agua");
        respuesta9 = scanner.nextLine().trim().toLowerCase();
        if (respuesta9.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Pregunta 10
        System.out.println("\n10. ¿Cuál de las siguientes no es una base de datos relacional?");
        System.out.println("a) MySQL");
        System.out.println("b) MongoDB");
        System.out.println("c) PostgreSQL");
        respuesta10 = scanner.nextLine().trim().toLowerCase();
        if (respuesta10.equals("b")) {
            contadorRespuestasCorrectas++;
        }

        // Mostrar resultado final
        System.out.println("\nCuestionario completado. Tu calificación es: " + contadorRespuestasCorrectas + "/10");
    }
}

