package taller_ndos;

import java.util.Scanner;

public class EjercicioR12 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor de una hora normal de trabajo: ");
        int valorHoraNormal = scanner.nextInt();

        // Variables para calcular el salario
        int horasExtras = 0, horasExtrasExcedentes = 0;
        double salario;

        // Calcular salario
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;

            if (horasExtras > 8) {
                horasExtrasExcedentes = horasExtras - 8;
                salario = (40 * valorHoraNormal) + (8 * 2 * valorHoraNormal) 
                          + (horasExtrasExcedentes * 3 * valorHoraNormal);
            } else {
                salario = (40 * valorHoraNormal) + (horasExtras * 2 * valorHoraNormal);
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }

        // Salida del resultado
        System.out.println("\n--- Informacion del Salario ---");
        System.out.println("Nombre del trabajador: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Valor hora normal: $" + valorHoraNormal);
        System.out.println("Salario devengado: $" + String.format("%.2f", salario));
    }
    
}