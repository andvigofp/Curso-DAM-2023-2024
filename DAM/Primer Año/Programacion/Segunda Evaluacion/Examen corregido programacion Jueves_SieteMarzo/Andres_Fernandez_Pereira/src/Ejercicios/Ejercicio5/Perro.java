package Ejercicios.Ejercicio5;

public class Perro extends Animal{
    public Perro(Sexo sexo) {
        super(sexo);
    }

    //Método específico para los perros
    public void ladrar() {
        System.out.println("El perro está ladrando.");
    }

    //Método para buscar objetos
    public void buscar() {
        System.out.println("El perro está buscando un objeto.");
    }

    //Método para seguir rastros
    public void seguirRastro() {
        System.out.println("El perro está siguiendo un rastro.");
    }

    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El perro ladra para comunicarse.");
    }
}
