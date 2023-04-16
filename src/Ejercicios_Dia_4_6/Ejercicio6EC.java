// 
// Decompiled by Procyon v0.5.36
// 

package Ejercicios_Dia_4_6;

import java.util.Scanner;

public class Ejercicio6EC
{
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros por favor");
        final int num1 = leer.nextInt();
        final int num2 = leer.nextInt();
        boolean exit = false;
        System.out.println(" ");
        do {
            System.out.println("|--------------------|");
            System.out.println("| MENU               |");
            System.out.println("| 1. Sumar           |");
            System.out.println("| 2. Restar          |");
            System.out.println("| 3. Multiplicar     |");
            System.out.println("| 4. Dividir         |");
            System.out.println("| 5. Salir           |");
            System.out.println("| Elija opci\u00f3n       |");
            System.out.println("|--------------------|");
            final int opcion = leer.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1: {
                    System.out.println("La suma de " + num1 + " + " + num2 + " es " + (num1 + num2));
                    System.out.println("");
                    continue;
                }
                case 2: {
                    System.out.println("La resta de " + num1 + " - " + num2 + " es " + (num1 - num2));
                    System.out.println("");
                    continue;
                }
                case 3: {
                    System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es " + num1 * num2);
                    System.out.println("");
                    continue;
                }
                case 4: {
                    System.out.println("La division de " + num1 + " / " + num2 + " es " + num1 / num2);
                    System.out.println("");
                    continue;
                }
                case 5: {
                    System.out.println("¿Est\u00e1 seguro que desea salir del programa (S/N)");
                    final String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        exit = true;
                        continue;
                    }
                    continue;
                }
                default: {
                    System.out.println("El valor ingresado no es v\u00e1lido. Vuelva a intentarlo.");
                    continue;
                }
            }
        } while (!exit);
    }
}
