/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_4_6;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 4 numeros por favor entre el 1 y el 20");
        final int num = leer.nextInt();
        final int num2 = leer.nextInt();
        final int num3 = leer.nextInt();
        final int num4 = leer.nextInt();
        System.out.println("======================");
        System.out.print(num + " ");
        for (int i = 0; i < num; ++i) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num2 + " ");
        for (int i = 0; i < num2; ++i) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num3 + " ");
        for (int i = 0; i < num3; ++i) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.print(num4 + " ");
        for (int i = 0; i < num4; ++i) {
            System.out.print("*");
        }
        System.out.println(" ");
        System.out.println("======================");
    }
}
