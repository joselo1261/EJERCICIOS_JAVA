/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_1_2;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados cent\u00edgrados");
        final int celsius = leer.nextInt();
        final int fahrenheit = 32 + 9 * celsius / 5;
        System.out.println("La temperatura de: " + celsius + " grados celsius, es equivalente a " + fahrenheit + " grados Fahrenheit");
    }
    
    
}