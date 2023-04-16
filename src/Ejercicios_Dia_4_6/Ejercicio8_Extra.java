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
public class Ejercicio8_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int cantNum = 0;
        int cantPar = 0;
        int cantImp = 0;
        while (true) {
            System.out.print("Ingrese un numero entero: ");
            final int num = leer.nextInt();
            if (num < 0) {
                continue;
            }
            ++cantNum;
            if (num % 2 == 0) {
                ++cantPar;
            }
            else {
                ++cantImp;
            }
            if (num % 5 == 0) {
                break;
            }
        }
        System.out.println("Cantidad de numeros leidos: " + cantNum);
        System.out.println("Cantidad de numeros pares: " + cantPar);
        System.out.println("Cantidad de numeros impares: " + cantImp);
    }
}