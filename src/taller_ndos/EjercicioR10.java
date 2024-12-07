package taller_ndos;

import java.util.Scanner;

public class EjercicioR10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Todos los datos solicitados.
        System.out.print("Ingrese el numero de inscripcion: ");
        String numeroInscripcion = scanner.nextLine();

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estrato = scanner.nextInt();

        //Valor base de la matrícula
        double pagoMatricula = 50000;

        //Verificar si se aplica el incremento
        if (patrimonio > 2000000 && estrato > 3) {
            pagoMatricula += 0.03 * patrimonio; // Incrementar el 3% del patrimonio
        }

        //Salida de resultados
        System.out.println("\n--- Informacion de Matricula ---");
        System.out.println("Numero de inscripcion: " + numeroInscripcion);
        System.out.println("Nombre: " + nombres);
        System.out.println("Pago de matricula: $" + String.format("%.2f", pagoMatricula));
    }
    
}
