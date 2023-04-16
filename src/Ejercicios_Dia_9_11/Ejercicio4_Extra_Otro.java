/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio4_Extra_Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final double[][] matriz = new double[10][4];
        for (int i = 0; i < 10; ++i) {
            System.out.println("Ingrese las notas para el alumno " + (i + 1));
            for (int j = 0; j < 4; ++j) {
                System.out.print(j + 1 + " : ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        final double[] prom = new double[10];
        for (int k = 0; k < 10; ++k) {
            for (int l = 0; l < 4; ++l) {
                switch (l) {
                    case 0: {
                        final double[] array = prom;
                        final int n = k;
                        array[n] += matriz[k][l] * 0.1;
                        break;
                    }
                    case 1: {
                        final double[] array2 = prom;
                        final int n2 = k;
                        array2[n2] += matriz[k][l] * 0.15;
                        break;
                    }
                    case 2: {
                        final double[] array3 = prom;
                        final int n3 = k;
                        array3[n3] += matriz[k][l] * 0.25;
                        break;
                    }
                    case 3: {
                        final double[] array4 = prom;
                        final int n4 = k;
                        array4[n4] += matriz[k][l] * 0.5;
                        break;
                    }
                }
            }
        }
        int aprobados = 0;
        int desaprobados = 0;
        for (int m = 0; m < 10; ++m) {
            if (prom[m] >= 6.0) {
                ++aprobados;
            }
            else {
                ++desaprobados;
            }
        }
        System.out.println("La cantidad de alumnos aprobados es: " + aprobados);
        System.out.println("La cantidad de alumanos desaprobados es: " + desaprobados);
    }
}
