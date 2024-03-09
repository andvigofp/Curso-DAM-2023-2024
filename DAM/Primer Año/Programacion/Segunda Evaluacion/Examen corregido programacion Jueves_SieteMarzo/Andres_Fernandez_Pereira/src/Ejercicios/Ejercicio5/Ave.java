package Ejercicios.Ejercicio5;

public class Ave extends Animal{
    public Ave(Sexo sexo) {
        super(sexo);
    }



    //Método específico para las aves
    public void volar() {
        System.out.println("El ave está volando.");
    }

    //Método para construir nidos
    public void construirNido() {
        System.out.println("El ave está construyendo su nido.");
    }

    //Método para migrar
    public void migrar() {
        System.out.println("El ave está migrando.");
    }

    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El ave emite sonidos para comunicarse.");
    }


}
