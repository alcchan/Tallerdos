package taller_ndos;

import java.util.Scanner;

        
public class EjercicioP18 {
    
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
         // Solicitar datos del empleado
        System.out.print("Ingrese el codigo del empleado: ");
        String codigo = Scanner.nextLine();

        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = Scanner.nextLine();

        System.out.print("Ingrese el numero de horas trabajadas al mes: ");
        int horasTrabajadas = Scanner.nextInt();

        System.out.print("Ingrese el valor de la hora trabajada: ");
        double valorHora = Scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de retencion en la fuente:");
        double porcentajeRetencion = Scanner.nextDouble();

        // Calcular salario bruto y salario neto
        double salarioBruto = horasTrabajadas * valorHora;
        double retencion = salarioBruto * (porcentajeRetencion / 100);
        double salarioNeto = salarioBruto - retencion;

        // Mostrar resultados
        System.out.println("\n--- Informacion del Empleado ---");
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Nombres del empleado: " + nombres);
        System.out.println("Salario bruto: $" + String.format("%.2f", salarioBruto));
        System.out.println("Salario neto: $" + String.format("%.2f", salarioNeto));
    }
}
        