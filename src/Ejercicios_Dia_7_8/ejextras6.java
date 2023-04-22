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
public class ejextras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String[][] matriz = new String [20][20];
    int cont =0;
         for (int i = 0; i < 5 ; i++) {
             cont=0;
        System.out.println("ingrese 5 palabras para la sopa de letras");
        String palabra = sc.nextLine();
        while(palabra.length()<3 || palabra.length() > 5){
            System.out.println("palabra incorrecta, ingrese una palabra ");
                palabra = sc.nextLine();
            
        }
        int filas = (int) (Math.random()* matriz.length);
        while (matriz [filas][0]!= null){
            filas = (int) (Math.random()*20);
        }
        int columnas =(int) (Math.random ()* 14); 
             for (int j = columnas; j <(columnas+ palabra.length()); j++) {
                 matriz[filas][j] = palabra.toUpperCase().substring(cont, cont+1);
                 cont++;
             }
             cont=0;
            for (int j = 0; j < matriz.length; j++) { 
                if (matriz[filas][j]==null) {
                    matriz[filas][j]= String.valueOf((int)(Math.random()*9+1));
                    
                }
            }
         }
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 if (matriz[i][j]==null ) {
                     matriz[i][j]= String.valueOf((int)(Math.random()*9+1));
                 }
             }}
         //mostrar matriz
         for (int i = 0; i < matriz.length; i++) {
             for (int j = 0; j < matriz.length; j++) {
                 System.out.print(matriz[i][j]+"  ");
             }
             System.out.println("");
        }
    }
    
}
