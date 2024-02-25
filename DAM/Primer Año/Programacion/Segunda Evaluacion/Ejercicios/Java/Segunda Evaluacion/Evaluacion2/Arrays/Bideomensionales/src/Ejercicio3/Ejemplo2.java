package Ejercicio3;

public class Ejemplo2 {
    public static void main(String[] args) {
        int matriz[][] = {{1,2,3}, {5,7,8}};

        for (int i=0; i<matriz.length; i++) {
            System.out.println("Número de filas " + i  + " ");
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
