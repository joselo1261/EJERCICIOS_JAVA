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
public class Ejercicio13_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la altura de la escalera: ");
        for (int altura = leer.nextInt(), i = 1; i <= altura; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
