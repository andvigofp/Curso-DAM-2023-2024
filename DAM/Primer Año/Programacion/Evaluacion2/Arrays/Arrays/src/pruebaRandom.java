import java.util.Random;

public class pruebaRandom {


    public static void main(String[] args) {


        Random randomNumbers = new Random();

       for (int i=0; i<100;i++) {
           System.out.println("randomNumbers.nextint() = " + randomNumbers.nextInt(1000));
       }
    }






}
