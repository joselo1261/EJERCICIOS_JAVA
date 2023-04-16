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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final String nombre = "abc";
        final int edad = 0;
        datos(nombre, edad);
    }
    
    public static void datos(String nombre, int edad) {
        String respuesta;
        do {
            final Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la persona");
            nombre = leer.nextLine();
            System.out.println("Ingrese la edad de la persona");
            edad = leer.nextInt();
            if (edad > 18) {
                System.out.println(nombre.toUpperCase() + " tiene " + edad + " años y es mayor de edad");
            }
            else {
                System.out.println(nombre + " tiene " + edad + " años y es menor de edad");
            }
            System.out.println("Desea agregar otra persona S/N");
            final Scanner sca = new Scanner(System.in);
            respuesta = sca.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
    }
}