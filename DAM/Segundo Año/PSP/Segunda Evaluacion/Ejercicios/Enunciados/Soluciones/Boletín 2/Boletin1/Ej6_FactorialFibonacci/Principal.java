package Boletines.Boletin1.Ej6_FactorialFibonacci;

/**
 * Hacer un programa que calcule el factorial. Cada uno de los cálculos tiene que ser realizado por un hilo
 * independiente. Implementar los procesos de 2 maneras diferentes:
 *        a) Heredando de la clase Thread
 *        b) Implementando la interface Runnable
 * */

public class Principal {
    public static void main(String[] args) {
        Factorial f1 = new Factorial(5);
        Fibonacci fib2 = new Fibonacci(6);

        f1.start();
        fib2.start();

        f1.mostrarFactorial();
        fib2.mostrarFibonacci();
    }
}
