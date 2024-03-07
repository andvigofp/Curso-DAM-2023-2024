
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        Hilo3 h3 = new Hilo3();
        Hilo4 h4 = new Hilo4();
        Hilo5 h5 = new Hilo5();
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();



        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\n********************** Welcome to Arduino Menu *****************************");
            System.out.println("\n\t1. Ver Color.\t\t\t\t\t7. Humedad máxima.");
            System.out.println("\n\t2. Ver Humedad.\t\t\t\t\t8. Cambiar color.");
            System.out.println("\n\t3. Ver Temperatura.\t\t\t\t9. Color más repetido.");
            System.out.println("\n\t4. Temperatura mínima.\t\t\t10. Hora Temperatura máxima.");
            System.out.println("\n\t5. Humedad mínima.\t\t\t\t11. Hora Humedad máxima.");
            System.out.println("\n\t6. Temperatura máxima.\t\t\t0. Exit.");
            System.out.println("\n**************************************************************************");


            try {
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println(" Color " + h4.getColor());
                } else if (choice == 2) {
                    System.out.println(h3.humedad);
                } else if (choice == 3) {
                    System.out.println(h2.getTemperaturas());
                } else if (choice == 4) {
                    System.out.println(h5.getTemperaturaMinima());
                } else if (choice == 5) {
                    //TODO
                } else if (choice == 6) {
                    //TODO
                } else if (choice == 7) {
                    //TODO
                } else if (choice == 8) {
                    //TODO
                } else if (choice == 9) {
                    //TODO
                } else if (choice == 10) {
                    //TODO
                } else if (choice == 11) {
                    //TODO
                }else if(choice==0) {
                    System.out.println("Bye!!");
                    System.exit(0);;
                } else {
                    System.err.println("[ERROR] Your option is incorrect!! Try again!!");
                }

            } catch (
                    InputMismatchException e) {
                System.err.println("[ERROR] You must type a number!!!");
                scanner.next();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);


    }



}