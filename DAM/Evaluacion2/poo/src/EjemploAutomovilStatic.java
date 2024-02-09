public class EjemploAutomovilStatic {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("subaru", "Impreza_Turbo_diese");


        //subaru.setFabricante("mazda");
        subaru.setColor(Color.BLANCO);
        subaru.setCilindrada(2.6);
        //subaru.setCapacidadDeposito(200);

        subaru.detalle();

        Automovil mazda = new Automovil("mazda", "SkyActive", Color.AMARAILLO_LIMON);

        mazda.setCilindrada(3.0);
        mazda.setColor(Color.BLANCO);
        mazda.setFabricante("mazda");
        mazda.setModelo("SkyActive");
        mazda.setCapacidadDeposito(44542);



        mazda.detalle();
        Automovil.setColorPatente("Azul Lima");
        System.out.println("-----------------------------------------------");
        System.out.println("mazda = " + mazda.acelerar(4000));
        System.out.println("mazda = " + mazda.frenar());
        System.out.println("mazda = " + mazda.acelerarFrenar(7000000)+ "\n");
        System.out.println("Kilometros por litros " + mazda.calcularConsumo(300,0.60f));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,60));
        System.out.println("mazda = " + mazda.acelerar(4000));
        System.out.println("mazda = " + mazda.frenar());
        System.out.println("mazda = " + mazda.acelerarFrenar(7000000)+ "\n");
        System.out.println("Kilometros por litros " + mazda.calcularConsumo(300,0.60f));
        System.out.println("Kilometros por litro " + mazda.calcularConsumo(300,60));
        System.out.println("Los intermitentes " + mazda.intermitentesPuesto("Derecha" ));

        System.out.println(Automovil.getColorPatente());

        System.out.println("-----------------------------------------------");

        System.out.println("mazda fabericante " + mazda.getFabricante());
        System.out.println("mazda.color " + mazda.getColor());
        System.out.println("mazda,modelo " + mazda.getModelo());
        System.out.println("mazda.cilindrada " + mazda.getCilindrada());
        System.out.println("mazda.capacidad del deposito " + mazda.getCapacidadDeposito());
        System.out.println("capacida de cosnumo " + mazda.calcularConsumo(3,800));
        Automovil.setColorPatente("Rojo");
        System.out.println(Automovil.getColorPatente());
        System.out.println("Capacidad de consumo " + Automovil.calcularConsumoEstatico(1,1800));
        System.out.println("Color = " + mazda.getColor());
        mazda.setColor(Color.BLANCO);
        System.out.println("Color = " + mazda.getColor());
        mazda.detalle();
        System.out.println("--------------------------------------------------------------------------");





        Automovil ferrrari = new Automovil("Ferrari","F5");

        System.out.println(ferrrari.detalle());



    }
}
