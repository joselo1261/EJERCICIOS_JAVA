// 
// Decompiled by Procyon v0.5.36
// 

package Ejercicios_Dia_4_6;

import java.util.Scanner;

public class Ejercicio6EC_2
{
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        final double n1 = leer.nextInt();
        System.out.println("Ingrese otro numero:");
        final double n2 = leer.nextInt();
        boolean conf = false;
        do {
            double cuenta = 0.0;
            System.out.println("");
            System.out.println("Que desea hacer?");
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicar.");
            System.out.println("4. Dividir.");
            System.out.println("5. Salir.");
            final int opc = leer.nextInt();
            switch (opc) {
                case 1: {
                    cuenta = n1 + n2;
                    System.out.println("La suma de ambos numeros es: " + cuenta);
                    continue;
                }
                case 2: {
                    cuenta = n1 - n2;
                    System.out.println("La resta de ambos numeros es: " + cuenta);
                    continue;
                }
                case 3: {
                    cuenta = n1 * n2;
                    System.out.println("La multiplicacion de ambos numeros es: " + cuenta);
                    continue;
                }
                case 4: {
                    cuenta = n1 / n2;
                    System.out.println("La division entre ambos numeros es: " + cuenta);
                    continue;
                }
                case 5: {
                    System.out.println("¿Desea salir? S/N");
                    final String salir = leer.next();
                    if (salir.equalsIgnoreCase("S")) {
                        conf = true;
                        continue;
                    }
                    continue;
                }
                default: {
                    System.out.println("El valor ingresado no es valido. Vuelva a intentarlo.");
                    continue;
                }
            }
        } while (!conf);
    }
}
