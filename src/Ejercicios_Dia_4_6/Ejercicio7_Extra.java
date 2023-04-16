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
public class Ejercicio7_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de N (n\u00fameros a ingresar):");
        final int n = leer.nextInt();
        int cont = 0;
        int max = 0;
        int min = 0;
        int numpos = 0;
        int suma = 0;
        while (cont < n) {
            System.out.println("Ingrese un numero");
            final int num = leer.nextInt();
            if (max == 0 && min == 0) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num > 0) {
                suma += num;
                ++numpos;
            }
            ++cont;
        }
        System.out.println("El numero maximo fue: " + max);
        System.out.println("El numero minimo fue: " + min);
        System.out.println("El promedio fue: " + suma / numpos);
        System.out.println(" ");
        max = 0;
        min = 0;
        suma = 0;
        numpos = 0;
        cont = 0;
        do {
            System.out.println("Ingrese un numero");
            final int num = leer.nextInt();
            if (max == 0 && min == 0) {
                max = num;
                min = num;
            }
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            if (num > 0) {
                suma += num;
                ++numpos;
            }
        } while (++cont < n);
        System.out.println("El numero maximo fue: " + max);
        System.out.println("El numero minimo fue: " + min);
        System.out.println("El promedio fue: " + suma / numpos);
    }
}
