import java.io.*;

public class ProcesoVigilante {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader(new File("log.txt")))) {
            while (true) {
                String line = reader.readLine();
                if (line.contains("ERROR")) {
                    System.out.println("Error: " + line);
                }
                if (line.contains("END")) {
                    break;
                }
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

