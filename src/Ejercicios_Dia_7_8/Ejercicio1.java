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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        final int num1 = sc.nextInt();
        final int num2 = sc.nextInt();
        System.out.println("Elija la opcion deseada");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        final int opcion = sc.nextInt();
        switch (opcion) {
            case 1: {
                System.out.println("El resutado es " + sumar(num1, num2));
                break;
            }
            case 2: {
                System.out.println("El resultados es " + restar(num1, num2));
                break;
            }
            case 3: {
                System.out.println("El resultados es " + multiplicar(num1, num2));
                break;
            }
            case 4: {
                System.out.println("El resultados es " + dividir(num1, num2));
                break;
            }
        }
    }
    
    public static int sumar(final int num1, final int num2) {
        final int s = num1 + num2;
        return s;
    }
    
    public static int restar(final int num1, final int num2) {
        final int r = num1 - num2;
        return r;
    }
    
    public static int multiplicar(final int num1, final int num2) {
        final int m = num1 * num2;
        return m;
    }
    
    public static int dividir(final int num1, final int num2) {
        final int d = num1 / num2;
        return d;
    }
}
