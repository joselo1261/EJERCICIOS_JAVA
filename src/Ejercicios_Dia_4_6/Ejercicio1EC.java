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
public class Ejercicio1EC {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        final int num = leer.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " , es par");
        }
        else {
            System.out.println("El numero " + num + " , es impar");
            System.out.println(" ");
        }
    }
}