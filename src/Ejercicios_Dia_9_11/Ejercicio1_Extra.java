/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio1_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        final int n = leer.nextInt();
        final int[] vector = new int[n];
        int suma = 0;
        for (int i = 0; i < vector.length; ++i) {
            System.out.println("Ingrese un numero");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los numeros del vector es " + suma);
    }
}
