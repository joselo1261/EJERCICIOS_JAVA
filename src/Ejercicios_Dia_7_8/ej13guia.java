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
public class ej13guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    String aux= "";
    String[] equipo= new String [3];
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("ingrese el nombre de su compañero");
            equipo[i] = leer.nextLine();
            

        }
        for (String equipo1 : equipo) {
    System.out.println("[" + equipo1 + "]");

        }

    }
    
}