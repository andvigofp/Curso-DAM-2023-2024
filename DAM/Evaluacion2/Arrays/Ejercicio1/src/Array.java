public class Array {
    /**
     * Declara e instancia un tipo de variable que sea capaz de contener la edad de cinco alumnos.
     *
     */
    public static void main(String[] args) {
        int[] edad = new int[5];
        edad[0] = 21;
        edad[1] = 30;
        edad[2] = 31;
        edad[3] = 32;
        edad[4] = 50;

        for (int e: edad) {
            System.out.println(e);
        }
    }
}
