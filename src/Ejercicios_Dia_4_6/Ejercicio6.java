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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        final int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        final int num2 = leer.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Los numeros " + num1 + " y " + num2 + " Son mayores a 25 ");
        }
        else if (num1 > 25) {
            System.out.println("El numero " + num1 + " es mayor a 25");
        }
        else if (num2 > 25) {
            System.out.println("El numero " + num2 + " es mayor a 25");
        }
        else {
            System.out.println("Los numeros " + num1 + " y " + num2 + " No son mayores a 25 ");
        }
    }
}