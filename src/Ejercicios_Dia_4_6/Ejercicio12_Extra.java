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
public class Ejercicio12_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int contador = 0;
        for (int i = 0; i < 1000; ++i) {
            String numero = String.format("%03d", i);
            numero = numero.replace("3", "E");
            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2));
            if (numero.contains("E")) {
                ++contador;
            }
        }
        System.out.println("El numero de veces que aparece la letra E es: " + contador);
    }
}