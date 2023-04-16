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
public class Ejercicio6_Extra_Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String[][] matriz = new String[20][20];
        int cont = 0;
        for (int i = 0; i < 5; ++i) {
            cont = 0;
            System.out.println("ingrese 5 palabras para la sopa de letras");
            String palabra;
            for (palabra = sc.nextLine(); palabra.length() < 3 || palabra.length() > 5; palabra = sc.nextLine()) {
                System.out.println("palabra incorrecta, ingrese una palabra ");
            }
            int filas;
            for (filas = (int)(Math.random() * matriz.length); matriz[filas][0] != null; filas = (int)(Math.random() * 20.0)) {}
            int j;
            for (int columnas = j = (int)(Math.random() * 14.0); j < columnas + palabra.length(); ++j) {
                matriz[filas][j] = palabra.toUpperCase().substring(cont, cont + 1);
                ++cont;
            }
            cont = 0;
            for (j = 0; j < matriz.length; ++j) {
                if (matriz[filas][j] == null) {
                    matriz[filas][j] = String.valueOf((int)(Math.random() * 9.0 + 1.0));
                }
            }
        }
        for (int i = 0; i < matriz.length; ++i) {
            for (int k = 0; k < matriz.length; ++k) {
                if (matriz[i][k] == null) {
                    matriz[i][k] = String.valueOf((int)(Math.random() * 9.0 + 1.0));
                }
            }
        }
        for (int i = 0; i < matriz.length; ++i) {
            for (int k = 0; k < matriz.length; ++k) {
                System.out.print(matriz[i][k] + "  ");
            }
            System.out.println("");
        }
    }
}
