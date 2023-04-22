/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_7_8;

/**
 *
 * @author juan_
 */
public class ejextras7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N = 10;
        int[] fibonacci = new int[N];
        
        for (int i = 0; i < N; i++) {
            fibonacci[i] = fibonacci(i);
        }

        for (int i = 0; i < N; i++) {
            System.out.println("[ "+ fibonacci[i]+ " ]" );
            
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
    
    

