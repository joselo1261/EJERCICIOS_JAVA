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
public class Ejercicio3EC {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        final String frase = leer.nextLine();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("INCORRECTO");
        }
    }
}
