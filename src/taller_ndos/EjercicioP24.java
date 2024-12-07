package taller_ndos;

import java.util.Scanner;

public class EjercicioP24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pesos de las esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        double PESOA = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera B: ");
        double PESOB = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera C: ");
        double PESOC = scanner.nextDouble();
        
        //Mayor peso
        if (PESOA > PESOB && PESOA > PESOC) {
            System.out.println("La esfera A es la de mayor peso.");
        } else if (PESOB > PESOA && PESOB > PESOC) {
            System.out.println("La esfera B es la de mayor peso.");
        } else {
            System.out.println("La esfera C es la de mayor peso.");
        }
        
        scanner.close();
    }  
}
