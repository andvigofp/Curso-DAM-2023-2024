package Ejercicios.Ej4;

public class Ej4 {
    public static void main(String[] args) throws InterruptedException {
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[Ejercicios.Ej4.Metodos.num_MaxFila()][Ejercicios.Ej4.Metodos.num_MaxColum()];

        //Para pedir al usuario por teclado
        Ejercicios.Ej4.Metodos.generarNumerosAleatorios(numeros);

        System.out.println();
        //SumaFila
        Ejercicios.Ej4.Metodos.sumaFila(numeros);
        //SumaTotal
        Metodos.sumaTotal(numeros);

    }
    }

