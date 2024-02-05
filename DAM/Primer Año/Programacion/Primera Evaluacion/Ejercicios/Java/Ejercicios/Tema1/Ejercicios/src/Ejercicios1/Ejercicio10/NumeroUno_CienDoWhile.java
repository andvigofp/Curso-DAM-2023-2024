package Ejercicios1.Ejercicio10;

public class NumeroUno_CienDoWhile {
    public static void NumeroDoWhile() {
        /**
         * Escribir los números del 1 al 100 utilizando ciclo Do While
         */
        //Variable tipo entero, iniciamos en 1
        int numero1 = 1;
        //Utilizamos el bucle DoWhile entre 1 y 100
        //Inicio
        do {
            //Imprime por pantlla los números del 1 y 100
            System.out.println("Los números son: " + numero1);
            numero1++;
        }while (numero1<=100);
    }
    //Fin
}
