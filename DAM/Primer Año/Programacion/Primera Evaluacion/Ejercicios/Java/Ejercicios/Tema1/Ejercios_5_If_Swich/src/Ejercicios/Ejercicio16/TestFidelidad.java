package Ejercicios.Ejercicio16;

import java.util.Scanner;

public class TestFidelidad {
    /**
     *Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El
     * programa irá haciendo preguntas que el usuario contestará con verdadero o falso. Cada pregunta
     * contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman puntos. A
     * continuación, se listan las preguntas del test.
     * 1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.
     * 2. Ha aumentado sus gastos de vestuario
     * 3. Ha perdido el interés que mostraba anteriormente por ti
     * 4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea
     * con más frecuencia (si es mujer)
     * 5. No te deja que mires la agenda de su teléfono móvil
     * 6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante
     * 7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
     * 8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo
     * 9. Has notado que últimamente se perfuma más
     * 10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
     * A continuación, se muestran los mensajes que deberá dar el programa según la puntuación obtenida.
     * • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente fiel.
     * • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su vida o en su mente,
     * aunque seguramente será algo sin importancia. No bajes la guardia.
     * • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar viviendo un
     * romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que
     * está pasando por su cabeza.
     */
        public static void main(String[] args) {
            //Salida por teclado
            Scanner teclado = new Scanner(System.in);
            //Variables
            int puntuacion = 0, i=1;
            String pregunta;

            System.out.println("Responde con 'verdadero' o 'falso' a las siguientes preguntas:");
            //Bucle while que se ejecuta mientras i sea menor o igual a 10
            while (i <= 10) {
                //Utilizando un switch para seleccionar la pregunta según el valor de i
                switch (i) {
                    case 1:
                        pregunta = "Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.";
                        break;
                    case 2:
                        pregunta = "Ha aumentado sus gastos de vestuario.";
                        break;
                    case 3:
                        pregunta = "Ha perdido el interés que mostraba anteriormente por ti.";
                        break;
                    case 4:
                        pregunta = "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).";
                        break;
                    case 5:
                        pregunta = "No te deja que mires la agenda de su teléfono móvil.";
                        break;
                    case 6:
                        pregunta = "A veces tiene llamadas que dice no querer contestar cuando estás tú delante.";
                        break;
                    case 7:
                        pregunta = "Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.";
                        break;
                    case 8:
                        pregunta = "Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.";
                        break;
                    case 9:
                        pregunta = "Has notado que últimamente se perfuma más.";
                        break;
                    case 10:
                        pregunta = "Se confunde y te dice que ha estado en sitios donde no ha ido contigo.";
                        break;
                    default:
                        pregunta = "";
                }
                //Imprime la pregunta
                System.out.println(pregunta);
                //Leer por teclado, TolowerCase (para convertir minúsculas y minúsculas) y último rePlaceAll (para quitar las tíldes)
                String respuesta = teclado.next().toLowerCase().replaceAll("[áéíóúüÁÉÍÓÚÜ]", "aeiouuAEIOUU");

                // Evaluación de respuestas
                switch (respuesta) {
                    case "verdadero":
                        puntuacion += 3;
                        break;
                    case "falso":
                        // No hace nada en caso de falso
                        break;
                    default:
                        System.out.println("Respuesta no válida. Por favor, responde con 'verdadero' o 'falso'.");
                        continue; // Saltar al siguiente ciclo sin incrementar i
                }

                // Incrementar el contador i solo si la respuesta es válida
                i++;
            }

            System.out.println("Puntuación total: " + puntuacion);

            // Mensajes según la puntuación obtenida
            if (puntuacion >= 0 && puntuacion <= 10) {
                System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
            } else if (puntuacion >= 11 && puntuacion <= 22) {
                System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
            } else if (puntuacion >= 23 && puntuacion <= 30) {
                System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
            }

        }
    }
