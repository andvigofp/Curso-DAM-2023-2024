public class EjemploAutomovil {
    public static void main(String[] args) {
        Automovil subaru = new Automovil("subaru", "Impreza_Turbo_diese");


        //subaru.setFabricante("mazda");
        subaru.setColor(Color.AZUL);
        System.out.println("subaru.Color = " + subaru.getColor().getColor());
        subaru.setCilindrada(2.6);
        //subaru.setCapacidadDeposito(200);

        subaru.detalle();

        System.out.println(subaru.getColor());
        Automovil mazda = new Automovil("mazda", "SkyActive", Color.NARANJA);

        mazda.setCilindrada(3.0);
        mazda.setColor(Color.NARANJA);
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
        System.out.println("mazda.color " + mazda.getColor().getColor());
        System.out.println("mazda,modelo " + mazda.getModelo());
        System.out.println("mazda.cilindrada " + mazda.getCilindrada());
        System.out.println("mazda.capacidad del deposito " + mazda.getCapacidadDeposito());
        System.out.println("mazda.Color = " + mazda.getColor().getColor());
        mazda.detalle();



    }
}
