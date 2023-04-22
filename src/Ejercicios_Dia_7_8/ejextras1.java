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
public class ejextras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
      int [] vector = new int [n];
      int suma=0;
        for (int i = 0; i < vector.length ; i++) {
            System.out.println("Ingrese un numero");
            vector [i]=leer.nextInt();
            suma+=vector[i];
                        
        }
        System.out.println("La suma de los numeros del vector es " + suma);
    }
    
}
    
    

