/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_7_8;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        final int num = leer.nextInt();
        System.out.println(" ");
        if (esPrimo(num)) {
            System.out.println("El numero: " + num + " es primo");
            System.out.println(" ");
        }
        else {
            System.out.println("El numero: " + num + " no es primo");
            System.out.println(" ");
        }
    }
    
    public static boolean esPrimo(final int num) {
        boolean esPrimo = true;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}
