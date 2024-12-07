package taller_ndos;

import java.util.Scanner;

public class EjercicioR15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Pesos de las esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        double PESOA = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera B: ");
        double PESOB = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera C: ");
        double PESOC = scanner.nextDouble();
        
        System.out.print("Ingrese el peso de la esfera D: ");
        double PESOD = scanner.nextDouble();
        
        // Comprobamos cuál es la esfera diferente
        if (PESOA == PESOB && PESOA == PESOC) {
            // Si A, B y C son iguales, entonces D es la diferente
            System.out.print("LA ESFERA D ES LA DIFERENTE Y ");
            if (PESOD > PESOA) {
                System.out.println("ES DE MAYOR PESO");
            } else {
                System.out.println("ES DE MENOR PESO");
            }
        } else if (PESOA == PESOB && PESOA == PESOD) {
            // Si A, B y D son iguales, entonces C es la diferente
            System.out.print("LA ESFERA C ES LA DIFERENTE ");
            if (PESOC > PESOA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOC && PESOA == PESOD) {
            // Si A, C y D son iguales, entonces B es la diferente
            System.out.print("LA ESFERA B ES LA DIFERENTE ");
            if (PESOB > PESOD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            // Si ninguna de las anteriores es cierta, entonces A es la diferente
            System.out.print("LA ESFERA A ES LA DIFERENTE ");
            if (PESOA > PESOB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }
        
        scanner.close();
    }
    
}
