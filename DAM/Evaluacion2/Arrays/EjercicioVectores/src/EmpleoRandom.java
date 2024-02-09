import java.util.Random;

public class EmpleoRandom {
    public static void main(String[] args) {
        Random randomNumbers = new Random();

        for (int i=0; i<100; i++) {
            System.out.println("randonumbers.nextInt() = " + randomNumbers.nextInt(100));
        }
    }
}
