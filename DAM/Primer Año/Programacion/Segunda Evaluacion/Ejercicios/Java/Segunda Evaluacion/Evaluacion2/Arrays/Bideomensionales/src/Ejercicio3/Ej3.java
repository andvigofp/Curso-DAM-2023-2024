package Ejercicio3;

public class Ej3 {
    public static void main(String[] args) {

        int matricula [][] = new int[4][5];

        int tamano= matricula.length;

        for (int i=0; i<tamano; i++) {
            for (int j=0; j<matricula[i].length;  j++) {
                System.out.println((i+1) + " intsitutos " + " estudios " + j);


            }
        }
    }
}
