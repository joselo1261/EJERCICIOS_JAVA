/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio2_Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int cont = 0;
        final Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el numero N dimension del vector");
        final int n = leerNum.nextInt();
        final int[] vector = new int[n];
        for (int i = 0; i < n; ++i) {
            vector[i] = (int)(Math.random() * 10.0);
        }
        System.out.println("Ingrese el numero a buscar");
        final int n2 = leerNum.nextInt();
        for (int i = 0; i < n; ++i) {
            if (vector[i] == n2) {
                System.out.println("Encontro el valor " + vector[i] + " en la posicion " + i);
                ++cont;
            }
        }
        System.out.println("Encontro el valor " + cont + " veces");
    }
}
