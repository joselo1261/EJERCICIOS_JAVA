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
public class Ejercicio5_Extra_Otro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        String[] palabras = new String[5];

        // Leer las palabras ingresadas por el usuario
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese una palabra de 3 a 5 caracteres: ");
            palabras[i] = leer.nextLine();
        }

        // Construir la matriz de la sopa de letras
        char[][] sopa = new char[20][20];

        // Seleccionar una fila aleatoria para ubicar las palabras
        int fila = (int) (Math.random() * 20);

        // Ubicar las palabras en la fila seleccionada
        int columna = 0;
        for (String palabra : palabras) {
            for (int i = 0; i < palabra.length(); i++) {
                sopa[fila][columna + i] = palabra.charAt(i);
            }
            columna += palabra.length() + 1;
        }

        // Rellenar los espacios no utilizados con un número aleatorio del 0 al 9
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                if (sopa[i][j] == '\u0000') {
                    int numeroAleatorio = (int) (Math.random() * 10);
                    sopa[i][j] = (char) (numeroAleatorio + '0');
                }
            }
        }

        // Imprimir la sopa de letras creada
        for (int i = 0; i < sopa.length; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
}    