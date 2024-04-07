package Ejercicios.Ejercicio5;

public class Gato extends Mamifero{
    public Gato(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void amamantar() {
        System.out.println("El gato está amamantando a sus crías.");
    }

    @Override
    public void moverse() {
        System.out.println("El gato está caminando o corriendo.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El gato está maullando.");
    }
}
