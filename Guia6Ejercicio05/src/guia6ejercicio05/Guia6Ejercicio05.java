/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio05;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio05 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Por Favor ingrese un valor");
        Scanner leer = new Scanner (System.in);
        num = leer.nextInt();
        System.out.println("El doble de " + num + " es: " + num*2);
        //System.out.println("");
        System.out.println("El triple de " + num + " es:" + num*3);
        //System.out.println("");
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
    
}
