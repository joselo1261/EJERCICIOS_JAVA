/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_1_2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        final int num = leer.nextInt();
        final int numd = num * 2;
        final int numt = num * 3;
        final double numsqr = Math.sqrt(num);
        System.out.println("El doble del numero " + num + " es: " + numd + ".");
        System.out.println("El triple del numero " + num + " es: " + numt + ".");
        System.out.println("La ra\u00edz cuadrada del numero " + num + " es: " + numsqr + ".");
    }
}