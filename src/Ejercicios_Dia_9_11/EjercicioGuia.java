/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Dia_9_11;

/**
 *
 * @author dell
 */
public class EjercicioGuia {

    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        final String[][] matriz = new String[3][3];
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                matriz[i][j] = "A";
            }
        }
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
