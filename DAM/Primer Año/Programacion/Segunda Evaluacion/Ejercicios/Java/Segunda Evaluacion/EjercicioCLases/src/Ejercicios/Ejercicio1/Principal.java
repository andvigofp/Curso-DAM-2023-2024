package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo( 100);

        Bicicleta bicicleta = new Bicicleta(20,  " ", 25);

        Coche coche = new Coche(200,  "Ferrari", 80, "rojo");

        int kilometros,  opciones;

        do {
            Menu.menuOpciones();
            opciones = teclado.nextInt();
            switch (opciones) {
                case 1:
                    Menu.pedirTeclado();
                    kilometros = teclado.nextInt();
                    bicicleta.andar(kilometros);
                    break;
                case 2:
                    bicicleta.hacerCaballido();
                    break;
                case 3:
                    Menu.pedirTeclado();
                    kilometros = teclado.nextInt();
                    coche.andar(kilometros);
                    break;
                case 4:
                    coche.quemarRuerda();
                    break;
                case 5:
                    bicicleta.verKilometrajeRecorrido();
                    break;
                case 6:
                    coche.verKilometrajeRecorrido();
                    break;
                case 7:
                    vehiculo.verKilometraTotal();
                    break;
                case 8:
                    System.out.println("Ha salido correctamente");
                    break;
                default:
                    System.out.println("Error: Solo puedes elegir 1-8");
            }
        }while (opciones!=8);

    }
}








