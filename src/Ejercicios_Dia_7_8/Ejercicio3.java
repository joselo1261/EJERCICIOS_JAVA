/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_7_8;
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author dell
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        final int moneda = 0;
        final double cantidad = 0.0;
        cambio(cantidad, moneda);
    }
    
    public static void cambio(double cantidad, int moneda) {
        final Scanner leer = new Scanner(System.in);
        final DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Ingrese la cantidad de euros a convertir:");
        cantidad = leer.nextDouble();
        leer.nextLine();
        System.out.println("===================================== ");
        System.out.println("A que moneda desea convertirlos:");
        System.out.println("1 - Libras");
        System.out.println("2 - Dolares");
        System.out.println("3 - Yenes");
        System.out.println("=====================================  ");
        moneda = leer.nextInt();
        switch (moneda) {
            case 1: {
                final double libras = cantidad * 0.86;
                System.out.println(cantidad + "Euros => Equivale a " + df.format(libras) + " Libras");
                System.out.println(" ");
                break;
            }
            case 2: {
                final double dolar = cantidad * 1.28611;
                System.out.println(cantidad + " Euros => Equivale a " + df.format(dolar) + " Dolares");
                System.out.println(" ");
                break;
            }
            case 3: {
                final double yen = cantidad * 129.852;
                System.out.println(cantidad + " Euros => Equivale a " + df.format(yen) + " Yenes");
                System.out.println(" ");
                break;
            }
        }
    }
}
