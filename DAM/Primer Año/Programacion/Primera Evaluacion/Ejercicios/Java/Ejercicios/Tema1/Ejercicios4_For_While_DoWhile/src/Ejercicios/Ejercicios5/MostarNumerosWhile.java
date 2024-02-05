package Ejercicios.Ejercicios5;

public class MostarNumerosWhile {
    /**
     * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while.
     */
    public static void main(String[] args) {
        // Inicializamos la variable de control del bucle en 320
        int numero=320;
        //Utilizamos un bucle while para imprimir los números de 320 a 160, restando 20 en cada iteración
        while (numero>=160) {
            //Imprimos el resultado
            System.out.println(numero);
            //Decrementamos la variable de control en 20
            numero-=20;
        }
    }
}
