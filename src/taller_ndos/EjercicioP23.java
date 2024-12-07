package taller_ndos;

import java.util.Scanner;

public class EjercicioP23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Leer los coeficientes A, B y C
        System.out.print("Ingrese el coeficiente A: ");
        double A = scanner.nextDouble();
        
        System.out.print("Ingrese el coeficiente B: ");
        double B = scanner.nextDouble();
        
        System.out.print("Ingrese el coeficiente C: ");
        double C = scanner.nextDouble();
        
        // Calcular
        double discriminante = (B * B) - (4 * A * C);
        
        // Verificar 
        if (discriminante > 0) {
            // Dos soluciones reales y diferentes
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real doble
            double x = -B / (2 * A);
            System.out.println("La solución doble es: x = " + x);
        } else {
            // No hay soluciones reales, las soluciones son complejas
            double realParte = -B / (2 * A);
            double imaginarioParte = Math.sqrt(-discriminante) / (2 * A);
            System.out.println("Las soluciones son complejas:");
            System.out.println("x1 = " + realParte + " + " + imaginarioParte + "i");
            System.out.println("x2 = " + realParte + " - " + imaginarioParte + "i");
        }
        
        scanner.close();
    }    
}
