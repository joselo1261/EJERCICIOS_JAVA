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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tipo Motor => Opcion entre 1 a 4 ");
        final int tipoMotor = leer.nextInt();
        System.out.println("");
        switch (tipoMotor) {
            case 1: {
                System.out.println("La bomba es, una bomba de agua");
                System.out.println("");
                break;
            }
            case 2: {
                System.out.println("La bomba es, una bomba de gasolina");
                System.out.println("");
                break;
            }
            case 3: {
                System.out.println("La bomba es, una bomba de hormig\u00f3n");
                System.out.println("");
                break;
            }
            case 4: {
                System.out.println("La bomba es, una bomba de pasta alimenticia");
                System.out.println("");
                break;
            }
            default: {
                System.out.println("No existe un valor v\u00e1lido para ese tipo de bomba");
                System.out.println("");
                break;
            }
        }
    }
}

