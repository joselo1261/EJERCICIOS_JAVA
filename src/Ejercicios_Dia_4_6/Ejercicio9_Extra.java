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
public class Ejercicio9_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros mayores de 1:");
        final int num1 = leer.nextInt();
        int num2;
        int resto;
        int cociente;
        for (num2 = leer.nextInt(), resto = num1, cociente = 0; resto >= num2; resto -= num2, ++cociente) {}
        System.out.println("El residuo es " + resto + " y el cociente es " + cociente + ".");
    }
}