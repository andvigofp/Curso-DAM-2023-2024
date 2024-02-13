import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb = new ProcessBuilder("java", "Sumar");
        pb.directory(new File(".\\out\\production\\Sumar"));
        Process p = pb.start();

        PrintStream ps = new PrintStream(p.getOutputStream());
        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        int count = 1;
        while((line = br.readLine()) != null){
            System.out.println(line);
            if(count <= 2){
                ps.println(sc.nextInt());
                ps.flush();
                count++;
            }
        }

        System.out.println("El proceso hijo ha finalizado con el código: " + p.waitFor());

    }
}