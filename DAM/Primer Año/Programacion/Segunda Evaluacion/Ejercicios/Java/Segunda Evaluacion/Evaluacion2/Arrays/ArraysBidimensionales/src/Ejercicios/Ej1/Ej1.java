package Ejercicios.Ej1;

/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna los
 * valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla como se muestra en la figura.
 */
public class Ej1 {
    public static void main(String[] args) {
        int num[][] = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] =5;
        num[1][0] = 75;
        num[1][4] =0;
        num[2][2] =-2;
        num[2][3] = 9;
        num[2][5] =11;

        System.out.print("Array num\t\t");
        for (int colum=0; colum< num[0].length; colum++) {
            System.out.printf(String.format("Columna%3d\t", colum));
        }
        System.out.println();


        for (int fila=0; fila<num.length; fila++) {
            System.out.print("Fila " + fila + " | ");
            for (int colum=0; colum<num[fila].length; colum++) {
                System.out.printf(String.format("%11d ", num[fila][colum]));
            }
            System.out.println();
        }
    }


}
