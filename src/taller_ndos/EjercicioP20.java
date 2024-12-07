package taller_ndos;

import java.util.Scanner;

        
public class EjercicioP20 {
    public static void main(String[] args) {
      
        Scanner Scanner = new Scanner(System.in);
        
        //Coordenadas del primer punto
        System.out.print("Ingrese la coordenada X1 del primer punto: ");
        double x1 = Scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y1 del primer punto: ");
        double y1 = Scanner.nextDouble();

        // Coordenadas del segundo punto
        System.out.print("Ingrese la coordenada X2 del segundo punto: ");
        double x2 = Scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y2 del segundo punto: ");
        double y2 = Scanner.nextDouble();

        // Validar que los puntos no sean iguales
        if (x1 == x2 && y1 == y2) {
            System.out.println("Los puntos son idénticos. No se puede definir una recta.");
            return; // Finalizar el programa si los puntos no son válidos
        }

        // Cálculo de los parámetros A, B y C
        double A = y2 - y1; // A = ΔY
        double B = x1 - x2; // B = -ΔX
        double C = -(A * x1 + B * y1); // C = -(A*X1 + B*Y1)

        // Mostrar los resultados
        System.out.println("\n--- Ecuacion de la Recta ---");
        System.out.println("La ecuacion de la recta es: " + 
            String.format("%.2f", A) + "X + " + 
            String.format("%.2f", B) + "Y + " + 
            String.format("%.2f", C) + " = 0");
        
        
    }
}