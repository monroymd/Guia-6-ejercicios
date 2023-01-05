/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio07 {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
     */
    public static void main(String[] args) {
        String  frase;
        System.out.println("Por Favor ingrese una palabra");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        if (frase.equals("eureka")) {
            System.out.println("La frase coincide!");
        } else {
            System.out.println("La frase NO coincide");
        }
    }
    
}
