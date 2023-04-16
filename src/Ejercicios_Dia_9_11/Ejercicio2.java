/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;

import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   // Realizar un algoritmo que llene un vector de tamaño N con valores
   // aleatorios y le pida al usuario un número a buscar en el vector. El
   // programa mostrará dónde se encuentra el numero y si se encuentra repetido

   Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño N del Vector: ");
        int N = leer.nextInt();
        int vector[]= new int[N];
        
        for (int i = 0; i <N; i++) {
        vector[i] = (int) (Math.random()*10+1);
        System.out.println("[" + vector[i] + "]");}
         
        System.out.println("Ingrese un número para buscar en el vector:");
        int num = leer.nextInt();
        
        boolean encuentra = false;
        for (int i = 0; i < N; i++) {
        if (vector[i] == num) {
        if (!encuentra) {
            System.out.println("El número " + num + " se encuentra en la posición " + (i+1) + " del vector.");
            System.out.println(" ");
            encuentra = true;
        } else {
            System.out.println("El número " + num + " también se encuentra en la posición " + (i+1) + " del vector.");
            System.out.println(" ");
            }
        }
    }
    if (!encuentra) {
    System.out.println("El número " + num + " no se encuentra en el vector.");
    }
      
}  
   
    }
    
