/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_7_8;

import java.util.Scanner;

/**
 *
 * @author juan_
 */
public class ejextras3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese el tamaño del vector");
         int n=leer.nextInt();
         int vector []= new int [n];
         
         rellenarVector(vector);
         mostrarVector(vector);
        
             
            
        
    }
    public static void rellenarVector(int [] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            
            vector[i]=(int) (Math.random()*100+1);
            
        }
        System.out.println("vector completo");
        
    }
    public static void mostrarVector(int [] vector) {
        
         for (int i = 0; i < vector.length; i++) {
            
            System.out.print("[ " + vector[i] + " ]");
            
        }
        System.out.println(" ");
        
    }
    
    
    
}
    
    

