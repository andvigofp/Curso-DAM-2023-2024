package Ejercicios.Ej3;


/**
 * Modifica el programa anterior de tal forma que los números que se introducen en el array se
 * generen de forma aleatoria (valores entre 100 y 999).
 */

public class Ej3 {
    public static void main(String[] args) {

    //Array de números enteros de 4 filas de 5 columnas
    int numeros[][] = new int[MetodosEj3.num_MaxFila()][MetodosEj3.num_MaxColum()];

        //Para pedir al usuario por teclado
        MetodosEj3.generarNumerosAleatorios(numeros);

        System.out.println();
        //Para sumar la filas
        MetodosEj3.sumaFila(numeros);
        //SumaTotal columnas
        MetodosEj3.sumaTotal(numeros);

}
}

