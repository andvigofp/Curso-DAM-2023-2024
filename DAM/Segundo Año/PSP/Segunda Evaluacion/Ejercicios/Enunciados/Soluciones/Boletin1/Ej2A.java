package Boletines.Boletin1;

public class Ej2A extends Thread{
    public void run() {
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("NO");
    }
}
class Ej2B extends Thread{
    public void run() {
        System.out.println();
        for (int i = 1; i <= 30; i++)
            System.out.println("YES");
    }
}
class Principal2 {
    public static void main(String[] args) {
        Ej2A hilo1 = new Ej2A();
        Ej2B hilo2 = new Ej2B();

        System.out.println("Ejecución A");
        hilo1.start();
        System.out.println("Ejecución B");
        hilo2.start();
        System.out.println("Ejecución main");

    }
}