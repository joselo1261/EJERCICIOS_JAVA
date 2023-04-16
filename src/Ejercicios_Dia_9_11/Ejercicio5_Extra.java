/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio5_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Realizar un programa que llene una matriz de tamaño NxM con valores
    // aleatorios y muestre la suma de sus elementos.
    
    Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de la matriz Filas:N , Columnas:M ");
        int N=leer.nextInt();
        int M=leer.nextInt();
        
        int [][] matriz= new int [N][M];
        System.out.println(" ");
        
        // Generar Matriz Aleatoriamente
        Random random = new Random();
        for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
        matriz[i][j] = random.nextInt(10);
        }
        }
        
        // Imprimir Matriz 
        System.out.println("Matriz Generada Aleatoriamente");
        System.out.println(" ");
        for ( int i = 0; i < N; i++) {
        for ( int j = 0; j < M; j++) {
          
        System.out.print("[" + matriz[i][j] + "]");}
        System.out.println(" ");  
        }

        System.out.println(" ");
        int suma = 0;
        for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
        suma += matriz[i][j];   
        }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);
        System.out.println(" ");
}
}
