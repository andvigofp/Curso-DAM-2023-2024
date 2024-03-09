package Ejercicios.Ejercicio5;

public class Mamifero extends Animal{
    public Mamifero(Sexo sexo) {
        super(sexo);
    }

    //Método específico para los mamíferos
    public void amamantar() {
        System.out.println("El mamífero está amamantando a sus crías.");
    }

    //Método para correr
    public void correr() {
        System.out.println("El mamífero está corriendo.");
    }

    //Método para jugar
    public void jugar() {
        System.out.println("El mamífero está jugando.");
    }

    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El  mamófero emite sonidos para comuniccarse.");
    }
}
