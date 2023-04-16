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
public class Ejercicio2_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int A = 2;
        int B = 4;
        int C = 6;
        int D = 8;
        System.out.println("Valores iniciales");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
        final int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println("Valores finales");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
