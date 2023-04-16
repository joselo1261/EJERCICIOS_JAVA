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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
   public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Mi primer Programa");
        System.out.println("Ingrese primer numero entero: ");
        final int num1 = leer.nextInt();
        System.out.println("");
        System.out.println("Ingrese segundo numero entero: ");
        final int num2 = leer.nextInt();
        final int suma = num1 + num2;
        System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
        
    }
}