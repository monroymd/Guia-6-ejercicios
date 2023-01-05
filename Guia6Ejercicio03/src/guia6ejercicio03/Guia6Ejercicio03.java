/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio03;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio03 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        String frase;
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println("");
        System.out.println(frase.toLowerCase());
    }
    
}
