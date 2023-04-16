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
 * 
 */
public class Ejercicio1_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tiempo en minutos:");
        final int tiempoEnMinutos = leer.nextInt();
        System.out.println(" ");
        final int dias = tiempoEnMinutos / 1440;
        final int horas = tiempoEnMinutos % 1440 / 60;
        final int minutos = tiempoEnMinutos % 60;
        System.out.println(tiempoEnMinutos + " Minutos equivalen a: " + dias + " dias , " + horas + " horas y " + minutos + " minutos");
        System.out.println(" ");
    }
}