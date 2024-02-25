import java.io.*;
import java.util.Scanner;

public class Ejercicio6_Padre {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("java","Ejercicio6_Hijo");
        pb.directory(new File(".\\out\\production\\Cadena"));
        Process p = pb.start();

        PrintStream ps = new PrintStream(p.getOutputStream());
        Scanner teclado = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String cadena="";
        while ((cadena = br.readLine())!=null) {
            System.out.println(cadena);
                ps.println(teclado.nextLine());
                ps.flush();
            }
            }
        }


