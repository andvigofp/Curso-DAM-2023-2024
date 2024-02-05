import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("java", "Sumar");
        pb.directory(new File(".\\out\\production\\Sumar"));
        Process p = pb.start();

        PrintStream ps = new PrintStream(p.getOutputStream());
        Scanner teclado = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        int cont =1;
        while ((line = br.readLine()) !=null) {
            System.out.println(line);
            if (cont <=2) {
                ps.println(teclado.nextInt());
                ps.flush();
                cont++;
            }
        }
    }
}