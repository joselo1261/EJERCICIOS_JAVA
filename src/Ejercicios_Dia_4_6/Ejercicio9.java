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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        int suma = 0;
        int cont = 0;
        System.out.println("Ingrese un numero:");
        int nro = leer.nextInt();
        do {
            ++cont;
            if (nro == 0) {
                System.out.println("Se captura el numero 0");
                break;
            }
            if (nro > 0) {
                suma += nro;
            }
            System.out.println("Ingrese un numero:");
            nro = leer.nextInt();
        } while (cont < 5);
        System.out.println("La suma de los numeros ingresados es: " + suma);
    }
}
