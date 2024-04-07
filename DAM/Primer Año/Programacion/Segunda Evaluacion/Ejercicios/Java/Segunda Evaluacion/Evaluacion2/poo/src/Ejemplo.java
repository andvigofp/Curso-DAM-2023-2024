public class Ejemplo {
    public static void main(String[] args) {

        Automovil subaru = new Automovil("subaru", "Impreza_Turbo_diese");


        System.out.println(subaru.getColor() +  " = " + subaru.getColor().getColor());
        subaru.setColor(Color.AMARILLO);
        System.out.println(subaru.getColor());

    }
}
