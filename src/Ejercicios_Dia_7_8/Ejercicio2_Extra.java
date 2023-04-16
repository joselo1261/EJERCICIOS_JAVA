// 
// Decompiled by Procyon v0.5.36
// 

package Ejercicios_Dia_7_8;

import java.util.Scanner;

public class Ejercicio2_Extra
{
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        for (String respuesta = "Si"; respuesta.equalsIgnoreCase("Si"); respuesta = leer.nextLine()) {
            System.out.print("Ingrese el nombre de la persona: ");
            final String nombre = leer.nextLine();
            System.out.print("Ingrese la edad de la persona: ");
            final int edad = leer.nextInt();
            leer.nextLine();
            System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad");
            }
            else {
                System.out.println(nombre + " es menor de edad");
            }
            System.out.print("Quiere seguir mostrando personas? (Si,/No): ");
        }
    }
}
