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
public class Ejercicio14_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de familias: ");
        final int N = leer.nextInt();
        double sumaEd = 0.0;
        int cantHijos = 0;
        for (int i = 1; i <= N; ++i) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            for (int M = leer.nextInt(), j = 1; j <= M; ++j) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                final int edad = leer.nextInt();
                sumaEd += edad;
                ++cantHijos;
            }
        }
        final double mediaEdad = sumaEd / cantHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}
