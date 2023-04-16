/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_7_8;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio11_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        String frase;
        do {
            System.out.println("Ingrese la secuencia de caracteres terminada en punto (.) ");
            frase = leer.nextLine();
            System.out.println(" ");
        } while (!frase.endsWith("."));
        System.out.println("La frase original: " + frase);
        System.out.println(" ");
        System.out.println("Codificada se convierte en: " + codificar(frase));
        System.out.println(" ");
    }
    
    public static String codificar(final String frase) {
        String codificada = "";
        for (int i = 0; i < frase.length(); ++i) {
            final char c = frase.charAt(i);
            switch (c) {
                case 'A':
                case 'a': {
                    codificada += "@";
                    break;
                }
                case 'E':
                case 'e': {
                    codificada += "#";
                    break;
                }
                case 'I':
                case 'i': {
                    codificada += "$";
                    break;
                }
                case 'O':
                case 'o': {
                    codificada += "%";
                    break;
                }
                case 'U':
                case 'u': {
                    codificada += "*";
                    break;
                }
                default: {
                    codificada += c;
                    break;
                }
            }
        }
        return codificada;
    }
}
