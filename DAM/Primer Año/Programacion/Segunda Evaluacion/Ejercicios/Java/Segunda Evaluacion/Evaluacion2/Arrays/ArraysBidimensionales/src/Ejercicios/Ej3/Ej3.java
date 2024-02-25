package Ejercicios.Ej3;


/**
 * Modifica el programa anterior de tal forma que los números que se introducen en el array se
 * generen de forma aleatoria (valores entre 100 y 999).
 */

public class Ej3 {
    public static void main(String[] args) {

    //Array de números enteros de 4 filas de 5 columnas
    int numeros[][] = new int[Ejercicios.Ej3.Metodos.num_MaxFila()][Ejercicios.Ej3.Metodos.num_MaxColum()];

    //Para pedir al usuario por teclado
        Ejercicios.Ej3.Metodos.generarNumerosAleatorios(numeros);

        System.out.println();

        Ejercicios.Ej3.Metodos.sumaFila(numeros);

        Metodos.sumaTotal(numeros);

}
}

