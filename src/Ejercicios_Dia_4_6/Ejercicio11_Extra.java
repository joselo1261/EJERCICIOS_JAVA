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
public class Ejercicio11_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = leer.nextInt();
        int cantDigitos = 0;
        while (num > 0) {
            ++cantDigitos;
            num /= 10;
        }
        System.out.println("El numero tiene " + cantDigitos + " digitos.");
    }
}
