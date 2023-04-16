
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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);    
        System.out.println("Por favor ingrese una frase");
        String palabra = leer.next();
       System.out.println(" su frase en mayusculas es " +palabra.toUpperCase());
        System.out.println("su frase en minuscula es " + palabra.toLowerCase()
        );
    }
    
}
