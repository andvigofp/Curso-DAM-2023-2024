import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumar {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escriba el primer numero:");
        int numero1 = Integer.parseInt(br.readLine());
        System.out.println("Escriba el segundo numero:");
        int numero2 = Integer.parseInt(br.readLine());

        System.out.println("La suma es: " + (numero1 + numero2));
    }
}
