package Ejercicios.Ejercicio5;

public abstract class Ave extends Animal{
    public Ave(Sexo sexo) {
        super(sexo);
    }

    public abstract void volar();

    public abstract void ponerHuevos();

    public abstract void migrar();
}
