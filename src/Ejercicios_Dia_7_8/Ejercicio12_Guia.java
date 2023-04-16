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
public class Ejercicio12_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros ");
        final int num1 = leer.nextInt();
        final int num2 = leer.nextInt();
        EsMultiplo(num1, num2);
        System.out.println("");
    }
    
    public static void EsMultiplo(final int num1, final int num2) {
        if (num1 % num2 == 0) {
            System.out.println(num1 + " Es multiplo de " + num2);
        }
        else {
            System.out.println(num1 + " No es multiplo de " + num2);
        }
    }
}