package Ejercicios.Ejercicio4;

import java.util.Random;

public class Ejercicio4 {
    /**
     * Define tres arrays de 20 números enteros cada una, con nombres número, cuadrado y cubo. Carga el
     * array número con valores aleatorios entre 0 y 100. En el array cuadrado se deben almacenar los
     * cuadrados de los valores que hay en el array número. En el array cubo se deben almacenar los cubos
     * de los valores que hay en número. A continuación, muestra el contenido de los tres arrays dispuesto
     * en tres columnas.
     */

    public static void main(String[] args) {
        Random random = new Random();

        int numero[] = new int[MetodosEj4.num_MAx()];
        int cuadrado[] = new int[MetodosEj4.num_MAx()];
        int cubo[] = new int[MetodosEj4.num_MAx()];


        //Para que de números aleatorios
        MetodosEj4.numerosRandom(numero,101);
        //Para calcular un número a su cuadrado
        MetodosEj4.numeroCuadrado(numero, cuadrado);
        //Para calcular un número a su cubo
        MetodosEj4.numeroCubo(numero, cubo);
        //Mostrar el resultado
        MetodosEj4.resultado(numero,cubo,cuadrado);




    }

}
