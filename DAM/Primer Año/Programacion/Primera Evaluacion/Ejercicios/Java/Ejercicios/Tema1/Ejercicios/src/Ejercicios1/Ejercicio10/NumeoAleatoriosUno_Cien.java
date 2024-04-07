package Ejercicios1.Ejercicio10;

public class NumeoAleatoriosUno_Cien {
    public static void NumeroAleatorio() {
        //Recorremos con bucle for los números entre 1 y 100
        for (int i=1; i<=100; i++) {
            //Generamos los números aleatoris con Match.randon
            int numeroAleatorio = (int) (Math.random()*100) +1;
            System.out.println("Los Números aleatorios " + i + ": " + numeroAleatorio);
        }
    }
}
