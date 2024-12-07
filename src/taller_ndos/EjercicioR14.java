package taller_ndos;

import java.util.Scanner;

public class EjercicioR14 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir las variables
        double VD1, VD2, VD3, SALAR;
        double TOTVEN, PORVEN;
        double SALAR1, SALAR2, SALAR3;
        
        //Valores de ventas de cada departamento y el salario de los vendedores
        System.out.print("Ingrese las ventas del Departamento 1: ");
        VD1 = scanner.nextDouble();
        
        System.out.print("Ingrese las ventas del Departamento 2: ");
        VD2 = scanner.nextDouble();
        
        System.out.print("Ingrese las ventas del Departamento 3: ");
        VD3 = scanner.nextDouble();
        
        System.out.print("Ingrese el salario de los vendedores: ");
        SALAR = scanner.nextDouble();
        
        //Calcular el total de ventas y el 33% del total
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;
        
        //Salario final de los vendedores en cada departamento
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR; 
        } else {
            SALAR1 = SALAR;
        }
        
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR; 
        } else {
            SALAR2 = SALAR; 
        }
        
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR; 
        } else {
            SALAR3 = SALAR; 
        }
        
        //Resultados
        System.out.println("SALARIO VENDEDORES DEPTO. 1: " + SALAR1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: " + SALAR2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: " + SALAR3);
        
       
        scanner.close();
    }
    
}
