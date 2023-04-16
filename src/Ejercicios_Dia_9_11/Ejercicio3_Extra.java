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
public class Ejercicio3_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        final int n = leer.nextInt();
        final int[] vector = new int[n];
        rellenarVector(vector);
        mostrarVector(vector);
    }
    
    public static void rellenarVector(final int[] vector) {
        for (int i = 0; i < vector.length; ++i) {
            vector[i] = (int)(Math.random() * 100.0 + 1.0);
        }
        System.out.println("Vector completo");
    }
    
    public static void mostrarVector(final int[] vector) {
        for (int i = 0; i < vector.length; ++i) {
            System.out.print("[ " + vector[i] + " ]");
        }
        System.out.println(" ");
    }
}
