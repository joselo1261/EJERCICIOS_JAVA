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
public class Ejercicio4_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un n\u00famero entre 1 y 10: ");
            num = leer.nextInt();
        } while (num < 1 || num > 10);
        String romano = "";
        if (num == 10) {
            romano += "X";
        }
        else if (num == 9) {
            romano += "IX";
        }
        else if (num >= 5) {
            romano += "V";
            for (int i = 6; i <= num; ++i) {
                romano += "I";
            }
        }
        else if (num == 4) {
            romano += "IV";
        }
        else {
            for (int i = 1; i <= num; ++i) {
                romano += "I";
            }
        }
        System.out.println(num + " En numero romano es => " + romano);
        System.out.println(" ");
    }
}
