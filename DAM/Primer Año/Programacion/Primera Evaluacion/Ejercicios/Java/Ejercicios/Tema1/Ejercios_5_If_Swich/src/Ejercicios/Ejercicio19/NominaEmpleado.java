package Ejercicios.Ejercicio19;

import java.util.Scanner;

public class NominaEmpleado {
    /**
     * Escribe un programa que genere la nómina (bien desglosada) de un empleado según las siguientes
     * condiciones:
     * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 – Jefe de proyecto), los días que
     * ha estado de viaje visitando clientes durante el mes y su estado civil (1 - Soltero, 2 - Casado).
     * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, un prog.
     * senior o un jefe de proyecto respectivamente.
     * • Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. Al sueldo neto
     * hay que restarle el IRPF, que será de un 25% en caso de estar soltero y un 20% en caso de estar casado.
     * Ejemplo:
     * 1 - Programador junior
     * 2 - Prog. senior
     * 3 - Jefe de proyecto
     * Introduzca el cargo del empleado (1 - 3): 2
     * ¿Cuántos días ha estado de viaje visitando clientes? 5
     * Introduzca su estado civil (1 - Soltero, 2 - Casado): 2
     * ----------------------------------
     * | Sueldo base 1200,00 |
     * | Dietas ( 5 viajes) 150,00 |
     * |--------------------------------|
     * | Sueldo bruto 1350,00 |
     * | Retención IRPF (20%) 270,00 |
     * |--------------------------------|
     * | Sueldo neto 1080,00 |
     * ----------------------------------
     */

        public static void main(String[] args) {
            //Salida por teclado
            Scanner teclado = new Scanner(System.in);
            //Variables
            int cargo, diasViaje;
            String estadoCivil;
            double sueldoBase, dietas, retencionIRPF, sueldoBruto, sueldoNeto;

            // Solicitar información al usuario
            System.out.println("1 - Programador junior");
            System.out.println("2 - Prog. senior");
            System.out.println("3 - Jefe de proyecto");
            System.out.print("Introduzca el cargo del empleado (1 - 3): ");
            cargo = teclado.nextInt();

            System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
            diasViaje = teclado.nextInt();

            System.out.print("Introduzca su estado civil (Soltero / Casado): ");
            estadoCivil = teclado.next();

            //Definir variables, dietas
            dietas = 30 * diasViaje;

            //Establecer sueldo base según el cargo
            switch (cargo) {
                case 1:
                    sueldoBase = 950;
                    break;
                case 2:
                    sueldoBase = 1200;
                    break;
                case 3:
                    sueldoBase = 1600;
                    break;
                default:
                    System.out.println("Cargo no válido.");
                    return;
            }

            //Calcular retención de IRPF según el estado civil
            switch (estadoCivil.toLowerCase().replaceAll("[áéíóúüÁÉÍÓÚÜ]", "aeiouuAEIOUU")) {
                case "soltero":
                    retencionIRPF = sueldoBase * 0.25;
                    break;
                case "casado":
                    retencionIRPF = sueldoBase * 0.20;
                    break;
                default:
                    System.out.println("Estado civil no válido.");
                    return;
            }

            // Calcular sueldo bruto y sueldo neto
            sueldoBruto = sueldoBase + dietas;
            sueldoNeto = sueldoBruto - retencionIRPF;

            // Mostrar la nómina desglosada
            System.out.println("----------------------------------");
            System.out.println("| Sueldo base " + sueldoBase + " |");
            System.out.println("| Dietas (" + diasViaje + " viajes) " + dietas + " |");
            System.out.println("|--------------------------------|");
            System.out.println("| Sueldo bruto " + sueldoBruto + " |");
            System.out.println("| Retención IRPF (" + estadoCivil + ") " + retencionIRPF + " |");
            System.out.println("|--------------------------------|");
            System.out.println("| Sueldo neto " + sueldoNeto + " |");
            System.out.println("----------------------------------");

        }
    }