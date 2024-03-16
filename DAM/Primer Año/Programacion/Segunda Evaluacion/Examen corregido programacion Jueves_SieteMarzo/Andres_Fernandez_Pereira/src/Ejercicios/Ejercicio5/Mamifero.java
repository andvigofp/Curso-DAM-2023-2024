package Ejercicios.Ejercicio5;

public abstract class Mamifero extends Animal{
    public Mamifero(Sexo sexo) {
        super(sexo);
    }

    public abstract void amamantar();

    public abstract void moverse();

    public abstract void emitirSonido();
}
