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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Realizar un algoritmo que llene un vector con los 100 primeros números
    // enteros y los muestre por pantalla en orden descendente.
        int vector[]= new int[100];
    // Asigno valores mediante el for
        for (int i = 0; i<100; i++) {
        vector[i] = i+1;
        }
    
    // Muestro el vector
        for (int i = 100-1; i >= 0; i--) {
        System.out.print("[" + vector[i] + "]");
            System.out.println(" ");
            // Prueba de modificar a Github
        }
}
}
        
        
 