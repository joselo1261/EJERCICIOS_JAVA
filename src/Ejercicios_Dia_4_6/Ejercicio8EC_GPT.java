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
public class Ejercicio8EC_GPT {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        for (int n = sc.nextInt(), i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
