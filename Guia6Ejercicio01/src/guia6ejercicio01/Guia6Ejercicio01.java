/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio01;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio01 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     */
    public static void main(String[] args) {
        int num, num2;
        
        System.out.println("Ingrese el primer valor a sumar");
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        
        System.out.println("Ingrese el segundo valor a sumar");
        Scanner leer2 = new Scanner (System.in);
        num2 = leer2.nextInt();
        
        System.out.println("La suma de los valores " + num + " mas " + num2 + " es: " + (num + num2));
        
        
    }
    
}
