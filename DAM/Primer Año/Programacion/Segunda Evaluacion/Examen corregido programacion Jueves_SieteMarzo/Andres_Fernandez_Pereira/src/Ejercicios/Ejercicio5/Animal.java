package Ejercicios.Ejercicio5;

public abstract class Animal {

    private Sexo sexo;


    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    //Método que indica si el animal es salvaje
    public boolean esSalvaje() {
        return true;
    }

    //Método para dormir
    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
    public abstract void comuniacarse();
}
