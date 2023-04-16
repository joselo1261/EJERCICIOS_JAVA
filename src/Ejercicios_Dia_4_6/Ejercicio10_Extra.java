// 
// Decompiled by Procyon v0.5.36
// 

package Ejercicios_Dia_4_6;

import java.util.Scanner;

public class Ejercicio10_Extra
{
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        final int num1 = (int)(Math.random() * 11.0);
        final int num2 = (int)(Math.random() * 11.0);
        final int resultado = num1 * num2;
        final Scanner scanner = new Scanner(System.in);
        int respuesta;
        do {
            System.out.print("Adivina el resultado de " + num1 + " x " + num2 + ": ");
            respuesta = scanner.nextInt();
            if (respuesta == resultado) {
                System.out.println("¡Correcto!");
                System.out.println(" ");
            }
            else {
                System.out.println("Incorrecto, intenta de nuevo.");
                System.out.println(" ");
            }
        } while (respuesta != resultado);
    }
}
