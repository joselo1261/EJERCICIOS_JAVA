
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juan_
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Ingresar = new Scanner(System.in);
    float c, f;
        System.out.println("Por favor ingrese los grados centigrados");
        c = Ingresar.nextFloat();
        f = 32 + (9 * c / 5);
        System.out.println("el equivalente de " + c + " grados centigrados corresponde a " + f +" grados Fahrenheit ");
    
    }
    
}

