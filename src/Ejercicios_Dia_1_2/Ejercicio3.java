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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        final String frase = leer.nextLine();
        System.out.println("La frase en minusculas es: ");
        System.out.println(frase.toLowerCase());
        System.out.println("La frase en mayusculas es: ");
        System.out.println(frase.toUpperCase());
    }
}