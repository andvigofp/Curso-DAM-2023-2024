package Boletines.Boletin1.Ej6_FactorialFibonacci;

public class Fibonacci extends Thread{
    int numero;
    int fibonacci = 0;

    public Fibonacci(int numero) {
        this.numero = numero;
    }

    public void run() {
        int fibn = 0;
        int fib0 = 0;
        int fib1 = 1;

        if (numero == 0) fibonacci = 0;
        else {
            if (numero == 1)
                fibonacci = 1;
            else {
                for (int i = 2; i <= numero; i++) {
                    fibn = fib0 + fib1;
                    fib0 = fib1;
                    fib1 = fibn;
                }
                fibonacci = fibn;
            }
        }
    }

    public void mostrarFibonacci () {
        System.out.println("El resultado del Fibonacci es: " + fibonacci);
    }
}
