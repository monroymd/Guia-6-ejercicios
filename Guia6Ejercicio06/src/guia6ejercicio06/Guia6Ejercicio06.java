/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio06;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio06 {

    /**
     * @param args the command line arguments
     * 
     * Crear un programa que dado un numero determine si es par o impar.
     */
    public static void main(String[] args) {
        int num;
        System.out.println("Por favor ingrese un valor");
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        
        if (num%2 == 0) {
            System.out.println("El numero " + num + " es PAR");
        } else {
            System.out.println("El numero " + num + " es IMPAR");
        }
    }
    
}
