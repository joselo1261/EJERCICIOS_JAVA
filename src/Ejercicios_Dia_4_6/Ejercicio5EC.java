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
public class Ejercicio5EC {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor limite positivo");
        final int valorlim = leer.nextInt();
        int suma = 0;
        do {
            System.out.println("Ingrese numeros a sumar");
            final int num = leer.nextInt();
            suma += num;
        } while (suma < valorlim);
        System.out.println("La suma total es de: " + suma);
    }
}
