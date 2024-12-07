/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_ndos;

import java.util.Scanner;

public class EjercicioP22 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Datos de entrada
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el salario basico por hora: ");
        double salarioPorHora = scanner.nextDouble();
        
        System.out.print("Ingrese el numero de horas trabajadas en el mes: ");
        double horasTrabajadas = scanner.nextDouble();
        
        // Calcular el salario mensual
        double salarioMensual = salarioPorHora * horasTrabajadas;
        
        //Resultado dependiendo del salario mensual
        if (salarioMensual > 450000) {
            System.out.println("Empleado: " + nombre + ", Salario Mensual: $" + salarioMensual);
        } else {
            System.out.println("Empleado: " + nombre);
        }
        
        scanner.close();
    }
    
}
