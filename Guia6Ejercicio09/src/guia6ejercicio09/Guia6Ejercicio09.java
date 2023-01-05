/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio09;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio09 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
     */
    public static void main(String[] args) {
        String frase, subcadena;
        System.out.println("Ingrese una frase cuya primera letra sea A");
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        subcadena = frase.substring(0,1);
        
        subcadena = subcadena.toUpperCase();
        
        if (subcadena.equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
