package Ejercicios.Ej1;

public class MetodosEj1 {
    public static int numFila() {
        return 3;
    }

    public static int numColumna() {
        return 6;
    }

    public static void mostrarColumna(int num[][]) {
         System.out.print("Array num\t\t");
        for (int colum=0; colum< num[0].length; colum++) {
            System.out.printf(String.format("Columna%3d\t", colum));
        }
        System.out.println();
    }

    public static void resultado(int num[][]) {
        for (int fila=0; fila<numFila(); fila++) {
            System.out.print("Fila " + fila + " | ");
            for (int colum=0; colum<numColumna(); colum++) {
                System.out.printf(String.format("%11d ", num[fila][colum]));
            }
            System.out.println();
        }
    }
}
