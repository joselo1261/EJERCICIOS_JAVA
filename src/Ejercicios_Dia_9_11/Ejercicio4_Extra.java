/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;

import java.util.Scanner;

/**
 *
 * @author Joselo
 */
public class Ejercicio4_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Los profesores del curso de programación de Egg necesitan llevar un
    // registro de las notas adquiridas por sus 10 alumnos para luego obtener
    // una cantidad de aprobados y desaprobados. Durante el período de
    // cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
    //  evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
    //  Primer trabajo práctico evaluativo 10%
    //  Segundo trabajo práctico evaluativo 15%
    //  Primer Integrador 25%
    //  Segundo integrador 50%
    //  Una vez cargadas las notas, se calcula el promedio y se guarda en el
    //  arreglo. Al final del programa los profesores necesitan obtener por
    //  pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
    //  que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
    //  notas del curso.      
    Scanner leer = new Scanner(System.in);
        double[] promedios = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las notas del alumno " + (i + 1) + ":");
            double nota1 = leer.nextDouble();
            double nota2 = leer.nextDouble();
            double nota3 = leer.nextDouble();
            double nota4 = leer.nextDouble();
            promedios[i] = calcularPromedio(nota1, nota2, nota3, nota4);
        }

        int aprobados = 0;
        int desaprobados = 0;

        for (double promedio : promedios) {
            if (promedio >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        System.out.println(" ");
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println(" ");
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        System.out.println(" ");
    }

    private static double calcularPromedio(double nota1, double nota2, double nota3, double nota4) {
        double promedio = nota1 * 0.1 + nota2 * 0.15 + nota3 * 0.25 + nota4 * 0.5;
        return promedio;
        
    }
}   
    
    
    
    
   
