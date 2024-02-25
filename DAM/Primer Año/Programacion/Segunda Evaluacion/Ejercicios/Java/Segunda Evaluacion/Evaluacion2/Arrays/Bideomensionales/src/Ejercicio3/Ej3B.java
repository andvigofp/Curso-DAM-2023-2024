package Ejercicio3;

public class Ej3B {
    public static void main(String[] args) {
        final int TAM_COLUM=4;
        final int TAM_FILAS=3;
        int tabla[][] = new int[TAM_FILAS][TAM_COLUM];

        for (int columnas =0; columnas<TAM_COLUM; columnas++) {
            for (int filas =0; filas<TAM_FILAS; filas++) {
                System.out.print(tabla[filas][columnas] + ", ");
            }
            System.out.println();
        }
    }
}
