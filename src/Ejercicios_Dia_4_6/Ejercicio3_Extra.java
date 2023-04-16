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
public class Ejercicio3_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        final String letra = leer.nextLine().toLowerCase();
        System.out.println(" ");
        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")) {
            System.out.println("La letra ingresada - " + letra + " - es una vocal.");
            System.out.println(" ");
        }
        else {
            System.out.println("La letra ingresada no es una vocal.");
            System.out.println(" ");
        }
    }
}