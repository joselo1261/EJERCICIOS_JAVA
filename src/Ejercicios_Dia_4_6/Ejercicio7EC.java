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
public class Ejercicio7EC {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int cont_ok = 0;
        int cont_nok = 0;
        String cadena;
        do {
            System.out.println("Ingrese una cadena de 5 letras");
            cadena = leer.next();
            if (cadena.length() != 5) {
                System.out.println("");
            }
            else {
                System.out.println("Ingreso correcto");
                if (cadena.equals("&&&&&")) {
                    break;
                }
                if (cadena.toUpperCase().substring(0, 1).equals("X") && cadena.toUpperCase().substring(4, 5).equals("0")) {
                    ++cont_ok;
                }
                else {
                    ++cont_nok;
                }
            }
        } while (!cadena.equals("&&&&&"));
        System.out.println("La cantidad de cadenas ok son " + cont_ok);
        System.out.println("La cantidad de cadenas incorrectas son " + cont_nok);
    }
}