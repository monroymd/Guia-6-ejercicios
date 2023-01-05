/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio02 {

    /**
     * @param args the command line arguments
     * 
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
     */
    public static void main(String[] args) {
       String nombre;
        System.out.println("Ingrese su nombre");
        Scanner leer = new Scanner (System.in);
        nombre = leer.nextLine();
        
        System.out.println("Hola " + nombre + " bienvenido!");
    }
    
}
