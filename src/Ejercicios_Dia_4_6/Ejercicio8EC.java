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
public class Ejercicio8EC {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del lado del cuadrado: ");
        final int n = leer.nextInt();
        System.out.println(" ");
        if (n >= 0 && n <= 20) {
            for (int i = 0; i < n; ++i) {
                System.out.print("*");
            }
            System.out.println();
            for (int i = 0; i < n - 2; ++i) {
                System.out.print("*");
                for (int j = 0; j < n - 2; ++j) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            for (int i = 0; i < n; ++i) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
        }
        else {
            System.out.println("Debe ingresar un valor entre 0 y 20");
        }
    }
}