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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nota entre 0 y 10 ");
        System.out.println("");
        for (int nota = leer.nextInt(); nota > 10; nota = leer.nextInt()) {
            System.out.println("Ingrese nuevamente la nota ");
        }
        System.out.println("");
        System.out.println("Valor ingresado correcto");
    }
}
