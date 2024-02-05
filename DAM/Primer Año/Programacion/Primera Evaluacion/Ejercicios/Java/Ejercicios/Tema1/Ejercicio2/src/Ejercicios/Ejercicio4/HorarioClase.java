package Ejercicios.Ejercicio4;

public class HorarioClase {
    public static void main(String[] args) {
        /**
         * Escribe un programa que muestre tu horario de clase
         */
        //Imprime por pantlla
        //Con sentencias de escape
        System.out.printf("%30s %20s %20s %20s %20s %20s %20s %20s\n",  "\'16:00\t16:50\'","\'16:50\t17:40\'", "\'17:40\t18:30\'","\'18:30\t19:20\'","\'19:20\t19:35\'","\'19:35\t20:25\'","\'20:25\t21:15\'","\'21:15\t22:05\'\n");
        System.out.printf("%10s %14s %20s %29s %24s %20s %26s\n",  "Lunes", " "," ","Programación","Programación","Recreo","Programación\n");
        System.out.printf("%12s \n",  "Martes\n");
        System.out.printf("%14s %14s %20s %25s %24s %20s %26s\n",  "Miercoles", " "," ","Programación","Programación","Recreo","Programación\n");
        System.out.printf("%11s %14s %20s %28s %24s %20s %26s\n",  "Jueves", " "," ","Programación","Programación","Recreo","Programación\n");
        System.out.printf("%12s %14s %20s %22s %22s %25s %22s %26s\n",  "Viernes", "PSP","PSP","PSP","SXE","SXE","SXE","SXE");
    }
}
