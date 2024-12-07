package taller_ndos;

import java.util.Scanner;

public class EjercicioR13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        // Limpiar entrada
        scanner.nextLine();

        System.out.print("Ingrese el color de la bolita (BLANCO, VERDE, AMARILLO, AZUL, ROJO): ");
        String color = scanner.nextLine().toUpperCase();  // Convertimos el color a mayúsculas para evitar errores de formato

        // Inicializar el porcentaje de descuento
        double porcentajeDescuento = 0;

        // Determinar el porcentaje de descuento por color
        switch (color) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            case "ROJO":
                porcentajeDescuento = 100;
                break;
            default:
                System.out.println("Color de bolita no válido.");
                return;  // Salir si el color no es válido
        }

        // Calcular el valor a pagar con el descuento
        double valorPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);

        // Mostrar el resultado
        System.out.printf("El porcentaje de descuento aplicado es: %.0f%%\n", porcentajeDescuento);
        System.out.printf("El cliente debe pagar: $%.2f\n", valorPagar);
    }
     
}
