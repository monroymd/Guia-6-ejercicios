<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio16 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     */
    public static void main(String[] args) {
       
        int num, cont = 0;
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese la cantidad de numeros a generar");
            num = leer.nextInt();
            
        } while (num < 0 || num > 100);
        
        int vector [] = new int [num];
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
            }
        
        System.out.println("Ingrese el numero a buscar");
        int num2 = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == num2){
                System.out.println("Numero encontrado en la posicion: "+ (i+1));
                cont++;
                } 
            }
        
        if (cont == 0){
            System.out.println("Numero no hallado");
            } 
            
        } 
   
    }
    
    

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio16;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio16 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
     */
    public static void main(String[] args) {
       
        int num, cont = 0;
        Scanner leer = new Scanner (System.in);
        
        do {
            System.out.println("Ingrese la cantidad de numeros a generar");
            num = leer.nextInt();
            
        } while (num < 0 || num > 100);
        
        int vector [] = new int [num];
        
        for (int i = 0; i < num; i++) {
            vector[i] = (int) (Math.random() * 10);
            }
        
        System.out.println("Ingrese el numero a buscar");
        int num2 = leer.nextInt();
        
        for (int i = 0; i < num; i++) {
            if (vector[i] == num2){
                System.out.println("Numero encontrado en la posicion: "+ (i+1));
                cont++;
                } 
            }
        
        if (cont == 0){
            System.out.println("Numero no hallado");
            } 
            
        } 
   
    }
    
    

>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
