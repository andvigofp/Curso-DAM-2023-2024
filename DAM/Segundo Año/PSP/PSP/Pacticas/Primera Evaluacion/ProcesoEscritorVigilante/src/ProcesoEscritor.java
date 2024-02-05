import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class ProcesoEscritor {
    public static void main(String[] args) {
        File logFile = new File("log.txt");

        try (FileWriter writer = new FileWriter(logFile)) {
            Random random = new Random();

            while (true) {
                int randomNumber = random.nextInt(100);

                if (randomNumber < 60) {
                    writer.write("Todo está OK\n");
                } else if (randomNumber < 90) {
                    writer.write("ERROR: se ha detectado un problema\n");
                } else {
                    writer.write("END\n");
                    break;
                }

                writer.flush();
                Thread.sleep(500);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

