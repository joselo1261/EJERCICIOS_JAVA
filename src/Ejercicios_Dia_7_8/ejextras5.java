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
public class ejextras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ingrese la cantidad de filas ");
        int f = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas ");
        int c = sc.nextInt();
        int suma=0;
        int [][] matriz = new int [f][c];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= (int) (Math.random()*100+1);
                suma += matriz[i][j];
                
            }
            
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ " + matriz[i][j]+ " ]");
                
                
            }
            System.out.println(" ");
        }
        System.out.println(" el total de la suma es "+ suma);
    }
    
}
