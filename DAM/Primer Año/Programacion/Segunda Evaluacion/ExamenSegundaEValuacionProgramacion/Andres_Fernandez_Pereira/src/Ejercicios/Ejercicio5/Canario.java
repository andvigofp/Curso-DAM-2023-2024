package Ejercicios.Ejercicio5;

public class Canario extends Ave{
    public Canario(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void volar() {
        System.out.println("El canario está volando.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El canario está poniendo huevos.");
    }

    @Override
    public void migrar() {
        System.out.println("Los canarios no migran.");
    }
}
