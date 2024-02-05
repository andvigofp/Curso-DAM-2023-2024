package Prueba;

import java.util.Scanner;

public class NotasClase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota, suma=0, media;
        int cantidad;
        System.out.println("Digite la cantidad de nota");
        cantidad = sc.nextInt();
        for (int i=1; i <=cantidad; i++){
            System.out.println("Digite la nota " + i);
            nota= sc.nextInt();
            suma+=nota;
        }
        media = suma/cantidad;
        System.out.println("La media de las notas es " + media);

    }
}
