package Ejercicios.Ej4;

public class Ej4 {
    public static void main(String[] args) throws InterruptedException {
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[MetodosEj4.num_MaxFila()][MetodosEj4.num_MaxColum()];

        //Para pedir al usuario por teclado
        MetodosEj4.generarNumerosAleatorios(numeros);

        System.out.println();
        //SumaFila
        MetodosEj4.sumaFila(numeros);
        //SumaTotal columnas
        MetodosEj4.sumaTotal(numeros);

    }
    }

