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
 * @author Joselo
 */
public class Ejercicio6_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
    // caracteres y, a medida que el usuario las va ingresando, construya una
    // “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
    // palabras se ubicarán todas en orden horizontal en una fila que será
    // seleccionada de manera aleatoria. Una vez concluida la ubicación de las
    // palabras, rellene los espacios no utilizados con un número aleatorio del 0
    // al 9. Finalmente imprima por pantalla la sopa de letras creada.
    // Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
    // siguientes funciones de Java substring(), Length() y Math.random().       
        
     String[] palabras = new String[5];
        char[][] sopaDeLetras = new char[20][20];
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        // Ingresar las 5 palabras
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese palabra " + (i + 1) + ":");
            String palabra = leer.next();
            if (palabra.length() >= 3 && palabra.length() <= 5) {
                palabras[i] = palabra.toUpperCase();
            } else {
                System.out.println(" ");
                System.out.println("La palabra debe tener entre 3 y 5 caracteres.");
                i--; // Volver a pedir la palabra
            }
            }

        // Ubicar las palabras en la sopa de letras
        for (String palabra : palabras) {
            int fila = random.nextInt(20); // Seleccionar fila aleatoria
            int columna = random.nextInt(20 - palabra.length() + 1); // Seleccionar columna aleatoria

        // Ubicar la palabra en la fila y columna seleccionadas
            for (int j = 0; j < palabra.length(); j++) {
                sopaDeLetras[fila][columna + j] = palabra.charAt(j);
            }
            }

        // Rellenar espacios no utilizados con números aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopaDeLetras[i][j] == 0) {
                    sopaDeLetras[i][j] = (char) ('0' + random.nextInt(10));
                }
                }
        }

        // Imprimir la sopa de letras
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}