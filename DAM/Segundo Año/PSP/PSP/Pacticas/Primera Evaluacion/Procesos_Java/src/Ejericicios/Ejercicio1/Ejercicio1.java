package Ejericicios.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Dirigite un número");
       if (scanner.hasNextInt()) {
           System.out.println("Se ha escrito un número");
           System.exit(0);

       }else {
           scanner.hasNext();
           System.out.println("Se ha escrito una palabra");
           System.exit(-1);
       }

    }
}
