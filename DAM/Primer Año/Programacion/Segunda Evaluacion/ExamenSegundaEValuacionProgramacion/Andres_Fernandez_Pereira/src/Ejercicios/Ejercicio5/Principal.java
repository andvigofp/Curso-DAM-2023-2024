package Ejercicios.Ejercicio5;

public class Principal {
    /**
     *Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto indicando su sexo. Crea, al
     * menos, tres métodos específicos de cada clase y redefine el/los método/s cuando sea necesario. Recuerda
     * emplear algún tipo de dato enumerado. Prueba las clases creadas en un programa en el que se instancien
     * objetos y se les apliquen métodos.
     */
    public static void main(String[] args) {
        //Creamos instancias de cada clase y llamar a sus  métodos
        Gato gato = new Gato(Sexo.MACHO);
        gato.amamantar();
        gato.moverse();
        gato.emitirSonido();
        System.out.println("-----------------------------");

        Perro perro = new Perro(Sexo.HEMBRA);
        perro.amamantar();
        perro.amamantar();
        perro.emitirSonido();
        System.out.println("-----------------------------");

        Canario canario = new Canario(Sexo.MACHO);
        canario.volar();
        canario.ponerHuevos();
        canario.migrar();
        System.out.println("-----------------------------");

        Pinguino pinguino = new Pinguino(Sexo.HEMBRA);
        pinguino.volar();
        pinguino.ponerHuevos();
        pinguino.migrar();
        System.out.println("-----------------------------");

        Lagarto lagarto = new Lagarto(Sexo.MACHO);
        lagarto.reptar();
        lagarto.regularTemperatura();
        lagarto.mudarPiel();
        System.out.println("-----------------------------");
    }

}
