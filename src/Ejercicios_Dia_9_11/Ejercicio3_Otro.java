/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author dell
 */
public class Ejercicio3_Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        int cont = 0;
        int uni = 0;
        int dec = 0;
        int cen = 0;
        int umil = 0;
        int dmil = 0;
        final Random random = new Random();
        final Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el numero N dimension del vector");
        final int n = leerNum.nextInt();
        final int[] vector = new int[n];
        for (int i = 0; i < n; ++i) {
            vector[i] = random.nextInt(99999) + 1;
        }
        for (int n2 : vector) {
            cont = 0;
            do {
                n2 = Math.floorDiv(n2, 10);
                ++cont;
            } while (n2 > 0);
            switch (cont) {
                case 1: {
                    ++uni;
                    break;
                }
                case 2: {
                    ++dec;
                    break;
                }
                case 3: {
                    ++cen;
                    break;
                }
                case 4: {
                    ++umil;
                    break;
                }
                case 5: {
                    ++dmil;
                    break;
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
        System.out.println("la cantidad de 1 cifra es " + uni);
        System.out.println("la cantidad de 2 cifra es " + dec);
        System.out.println("la cantidad de 3 cifra es " + cen);
        System.out.println("la cantidad de 4 cifra es " + umil);
        System.out.println("la cantidad de 5 cifra es " + dmil);
    }
}