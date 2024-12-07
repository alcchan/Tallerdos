package taller_ndos;

import java.util.Scanner;

public class EjercicioR11 {
      public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        //Entrada de datos
        System.out.print("Ingrese el primer numero (N1): ");
        int N1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero (N2): ");
        int N2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero (N3): ");
        int N3 = scanner.nextInt();

        //Iniciar la variable MAYOR
        int MAYOR;

        //Determinar el número mayor
        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;
        } else if (N2 > N3) {
            MAYOR = N2;
        } else {
            MAYOR = N3;
        }

        //Salida del resultado
        System.out.println("EL VALOR MAYOR ENTRE: " + N1 + ", " + N2 + " Y " + N3 + " ES: " + MAYOR);
    }
    
}