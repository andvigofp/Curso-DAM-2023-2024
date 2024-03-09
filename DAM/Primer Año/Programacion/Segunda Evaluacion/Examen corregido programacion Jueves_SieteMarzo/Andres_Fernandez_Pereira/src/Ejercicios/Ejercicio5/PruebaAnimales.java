package Ejercicios.Ejercicio5;

public class PruebaAnimales {
    public static void main(String[] args) {
        //Crear instancias de diferentes animales y probar sus métodos

        //Objecto Clase gato
        Gato gato = new Gato(Sexo.MACHO);
        gato.arañar();
        gato.cazarRaton();
        gato.cazarRaton();
        //Método heredado de Animal
        gato.comuniacarse();
        System.out.println("El sexo del gato es: " + gato.getSexo());
        System.out.println("------------------------------------------");

        //Objecto Clase Perro
        Perro perro = new Perro(Sexo.HEMBRA);
        perro.buscar();
        perro.ladrar();
        perro.seguirRastro();
        //Método heredado de Animal
        perro.comuniacarse();
        System.out.println("El sexo del perro es: " + perro.getSexo());
        System.out.println("------------------------------------------------");

        //Objecto Clase Ave
        Ave ave = new Ave(Sexo.HEMBRA);
        ave.construirNido();
        ave.migrar();
        ave.volar();
        //Método heredado de Animal
        ave.comuniacarse();
        System.out.println("El sexo del ave es: " + ave.getSexo());
        System.out.println("------------------------------------------------");

        //Obecto clase Canario
        Canario canario = new Canario(Sexo.MACHO);
        canario.acicalarse();
        canario.cantar();
        canario.volarCirculos();
        //Método heredado de Animal
        canario.comuniacarse();
        System.out.println("El sexo del canario es: " + ave.getSexo());
        System.out.println("------------------------------------------------");

        //Obecto clase Pinguino
        Pinguino pinguino = new Pinguino(Sexo.HEMBRA);
        pinguino.deslizarse();
        pinguino.nadar();
        pinguino.pescar();
        //Método heredado de Animal
        pinguino.comuniacarse();
        System.out.println("El sexo del pinguino es: " + ave.getSexo());
        System.out.println("------------------------------------------------");

        //Obecto clase Manífero
        Mamifero mamifero = new Mamifero(Sexo.HEMBRA);
        mamifero.amamantar();
        mamifero.correr();
        mamifero.jugar();
        //Método heredado de Animal
        mamifero.comuniacarse();
        System.out.println("El sexo del mamíero es: " + ave.getSexo());
        System.out.println("------------------------------------------------");

        //Obecto clase Lagarto
        Lagarto lagarto =  new Lagarto(Sexo.MACHO);
        lagarto.camuflarse();
        lagarto.cazarInsectos();
        lagarto.moverseZigzag();
        //Método heredado de Animal
        lagarto.comuniacarse();
        System.out.println("El sexo del lagarto es: " + ave.getSexo());
        System.out.println("------------------------------------------------");

        //Obecto clase Reptil
        Reptil reptil = new Reptil(Sexo.HEMBRA);
        reptil.cazar();
        reptil.reptar();
        reptil.tomarSol();
        //Método heredado de Animal
        reptil.comuniacarse();
        System.out.println("El sexo del reptil es: " + ave.getSexo());
        System.out.println("------------------------------------------------");



    }
}
