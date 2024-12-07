package taller_ndos;

import java.util.Scanner;

public class EjercicioR7 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Valores de A y B
        System.out.print("Ingrese el valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Ingrese el valor de B: ");
        int B = scanner.nextInt();

        //Comparación y salida del mensaje
        if (A > B) {
            System.out.println("A es mayor que B.");
        } else if (A == B) {
            System.out.println("A es igual a B.");
        } else {
            System.out.println("A es menor que B.");
        }
    }
    
}
