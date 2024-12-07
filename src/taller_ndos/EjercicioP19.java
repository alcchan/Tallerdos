package taller_ndos;

import java.util.Scanner;

        
public class EjercicioP19 {
    public static void main (String[] args) {
        Scanner Scanner = new Scanner (System.in);
        
       // Solicitar al usuario el valor del lado del triángulo
       System.out.print("ingrese el valor del lado del triangulo equilatero:");
       double lado = Scanner.nextDouble();
       
       //Perimetro
       double perimetro = 3 * lado;
       
       //Altura (formula, altura = √3 / 2 * lado)
       double altura = (Math.sqrt(3)/2)*lado;
       
       //Calcular el área (fórmula, área = (base * altura) / 2)
       double area = (lado * altura)/2;
       
         //Mostrar los resultados
        System.out.println("\n--- Propiedades del Triangulo Equilatero ---");
        System.out.println("Lado: " + lado);
        System.out.println("Perimetro: " + String.format("%.2f", perimetro));
        System.out.println("Altura: " + String.format("%.2f", altura));
        System.out.println("Area: " + String.format("%.2f", area));
             
    }
}
        