/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg5;

import java.util.Scanner;

/**
 *
 * @author juan_
 */
public class ejextras2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño de los vectores");
        int n=leer.nextInt();
        
        int [] vector1= new int [n];
        int [] vector2= new int [n];
        
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Ingrese un valor para el vector 1 " + i);
            vector1[i]=leer.nextInt(); 
        }
        
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Ingrese un valor para el vector 2 " + i);
            vector2[i]=leer.nextInt();   
        }
        
        System.out.println("Vector 1");
        System.out.println(" ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("[" + vector1[i]+ "]");
            
        }
        System.out.println(" ");
        System.out.println("Vector 2");
        System.out.println(" ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("[" + vector2[i]+ "]");
            
        }
        int cont=0;
        for (int i = 0; i < vector1.length ; i++) {
            
            if (vector1[i]!=vector2[i]) {
                System.out.println("Los vectores no son iguales");
                break;
            } 
              cont++;  
            
        }
        if (cont==vector1.length) {
            System.out.println("Los vectores son iguales");
        }
        
        
    }
    
}
    
    
