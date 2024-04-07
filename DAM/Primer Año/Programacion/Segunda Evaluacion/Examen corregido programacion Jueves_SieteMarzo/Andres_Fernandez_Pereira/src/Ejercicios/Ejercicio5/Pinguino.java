package Ejercicios.Ejercicio5;

public class Pinguino extends Ave{
    public Pinguino(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void volar() {
        System.out.println("Los pingüinos no pueden volar.");
    }

    @Override
    public void ponerHuevos() {
        System.out.println("El pingüino está poniendo huevos.");
    }

    @Override
    public void migrar() {
        System.out.println("Los pingüinos migran a lo largo del año.");
    }
}
