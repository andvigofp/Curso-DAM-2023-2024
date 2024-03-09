package Ejercicios.Ejercicio5;

public class Reptil extends Animal{
    public Reptil(Sexo sexo) {
        super(sexo);
    }
    // Método específico para los reptiles
    public void tomarSol() {
        System.out.println("El reptil está tomando el sol para regular su temperatura corporal.");
    }

    // Método para reptar
    public void reptar() {
        System.out.println("El reptil está reptando.");
    }

    // Método para cazar
    public void cazar() {
        System.out.println("El reptil está cazando.");
    }

    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El reptil emite sonidos para comunicarse.");
    }
}
