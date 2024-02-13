import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int array[] = new int[12];


        int b,i,j,k;

        MetodoRandom.numerosRandom(array,40);

        Arrays.sort(array);

       for (int n : array) {
           System.out.print("\t" + n + "\n");
       }

        i=0;
        j = array.length-1;
        b = 12;

        do {
            k = (i + j)/2;

            if (array[k] <=b) {
                i=k +1;
            }

            if (array[k]>=b) {
                 j = k-1;
            }


        }while (i<=j);

        if (array[k] !=b) {
            System.out.println("no encotrado");
        }else {
            System.out.println("Resultado : " + array[k] + " " + k);
        }




    }
}
