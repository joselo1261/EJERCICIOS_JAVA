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
public class ejextras4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   double [][] matriz = new double[10][4];
   for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas para el alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.print((j+1) + " : ");
                matriz[i][j] = sc.nextDouble();
    }
    
}   double [] prom = new double[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j){
                    case 0:
                        prom[i] += matriz[i][j]*0.10;
                        break;
                    case 1:
                        prom[i] += matriz[i][j]*0.15;
                        break;
                    case 2:
                        prom[i] += matriz[i][j]*0.25;
                        break;
                    case 3:
                        prom[i] += matriz[i][j]*0.50;
                        break;
                }
            }
        }
        int aprobados=0;
        int desaprobados=0;
        for (int i = 0; i < 10; i++) {
            if (prom[i]>= 6) {
                aprobados++;
            }else{
                desaprobados++;
    }

    }
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumanos desaprobados es: " + desaprobados);
    
    }
}
