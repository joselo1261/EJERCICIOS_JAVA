/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_4_6;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio5_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el tipo de socio (A, B o C): ");
        System.out.println(" ");
        final String tipo = input.nextLine().toUpperCase();
        System.out.print("Ingrese el costo del tratamiento: ");
        System.out.println(" ");
        final double costo = input.nextDouble();
        double descuento = 0.0;
        if (tipo.equals("A")) {
            descuento = 0.5;
        }
        else if (tipo.equals("B")) {
            descuento = 0.35;
        }
        final double importeFinal = costo * (1.0 - descuento);
        System.out.println("El importe a pagar es: " + importeFinal);
        System.out.println(" ");
    }
}