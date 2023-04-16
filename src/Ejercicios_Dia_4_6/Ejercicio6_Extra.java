/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_4_6;
import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio6_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el n\u00famero de personas:");
        final int N = leer.nextInt();
        double sumaAlts = 0.0;
        double sumaAltsBajo160 = 0.0;
        int persBajo160 = 0;
        for (int i = 0; i < N; ++i) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + " en metros:");
            final double altura = leer.nextDouble();
            sumaAlts += altura;
            if (altura < 1.6) {
                sumaAltsBajo160 += altura;
                ++persBajo160;
            }
        }
        final double promGral = sumaAlts / N;
        double promBajo160 = 0.0;
        if (persBajo160 > 0) {
            promBajo160 = sumaAltsBajo160 / persBajo160;
        }
        System.out.println("El promedio de estaturas en general es: " + promGral + " mts.");
        System.out.println(" ");
        System.out.println("El promedio de estaturas por debajo de 1.60 mts. es: " + promBajo160 + " mts.");
        System.out.println(" ");
    }
}