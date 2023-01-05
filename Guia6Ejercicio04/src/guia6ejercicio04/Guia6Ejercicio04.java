/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio04;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio04 {

    /**
     * @param args the command line arguments
     * 
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        int grados;
        System.out.println("Ingrese los grados centigrados a convertir en Fahrenheit");
        Scanner leer = new Scanner (System.in);
        grados = leer.nextInt();
        System.out.println(grados + "° centigrados equivalen a " + (32 + (9 * grados / 5) + "° Fahrenheit"));
    }
    
}
