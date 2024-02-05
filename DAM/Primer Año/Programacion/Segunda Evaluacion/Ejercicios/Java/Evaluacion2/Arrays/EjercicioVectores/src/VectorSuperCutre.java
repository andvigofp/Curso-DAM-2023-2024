import java.util.Arrays;

public class VectorSuperCutre {
    /**
     *
     * Mostrar datos de un vector rellenándolo de forma “super cutre”
     */
    public static void main(String[] args) {

        int listarNumeroas[] = new int[4];
        //Super Cutre
        listarNumeroas[0] = 21;
        listarNumeroas[1] = 23;
        listarNumeroas[2] = 50;
        listarNumeroas[3] = 40;

        Arrays.sort(listarNumeroas);

        for (int i=0; i<listarNumeroas.length; i++) {
            System.out.println(listarNumeroas[i]);
        }



    }
}
