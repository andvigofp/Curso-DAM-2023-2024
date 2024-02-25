package Ejercicio3;

public class Ej4 {
    public static void main(String[] args) {
        final String SI="SI=30";
        final String BD="BD=27";
        final String PR="PR=25";
        final String LM="LM=21";
        final String ED="ED=19";
        final String AD="AD=16";

        int[][] materias = new int[2][6];
        String[][] modulos ={{SI,BD,PR,LM,ED,AD}};

        for (int i=0; i<modulos.length; i++) {
            System.out.println("Filas " + i);
            for (int j=0; j<materias[i].length; j++) {
                System.out.print(materias[i][j] + " " + modulos[i][j]);
            }

            System.out.println();
        }

        for (int i=0; i<modulos.length; i++) {
            for (int j=0; j<modulos[i].length; j++) {
                System.out.print(modulos[i][j] + " ");
            }
            System.out.println();
        }
    }
}
