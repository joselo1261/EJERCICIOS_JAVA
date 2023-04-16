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
public class Ejercicio10_GPT {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int[] numeros = new int[4];
        for (int i = 0; i < 4; ++i) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            int num;
            for (num = sc.nextInt(); num < 1 || num > 20; num = sc.nextInt()) {
                System.out.print("Error: el numero debe estar entre 1 y 20. Ingrese nuevamente: ");
            }
            numeros[i] = num;
        }
        for (int i = 0; i < 4; ++i) {
            System.out.print(numeros[i] + ": ");
            for (int j = 0; j < numeros[i]; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}