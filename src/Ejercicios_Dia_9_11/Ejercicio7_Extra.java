/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;

/**
 *
 * @author Joselo
 */
public class Ejercicio7_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Realizar un programa que complete un vector con los N primeros
    // números de la sucesión de Fibonacci       
 
        int N = 10;
        int[] fibonacci = new int[N];
        
        for (int i = 0; i < N; i++) {
            fibonacci[i] = fibonacci(i);
        }

        for (int i = 0; i < N; i++) {
            System.out.print("[ "+ fibonacci[i]+ " ]" );
            System.out.println(" ");
            
        }
    }
    public static int fibonacci(int N) {
        if (N< 2) {
            return N;
        } else {
            return fibonacci(N - 1) + fibonacci(N - 2);
        }
    }
    
}
    