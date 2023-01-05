<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio17 {

    /**
     * @param args the command line arguments
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        int num, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros que tendra el vector");
        int vector [] = new int [leer.nextInt()];
        
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*99999);
            //System.out.println(vector[i]);
            if (vector[i]< 10){
                cont1++;
            } else if (vector[i]< 100){
                cont2++;
            } else if (vector[i]< 1000){
                cont3++;
            } else if (vector[i]< 10000){
                cont4++;
            } else {
                cont5++;
            }
        }
        System.out.println("Se crearon "+cont1+" de un digito");
        System.out.println("Se crearon "+cont2+" de dos digitos");
        System.out.println("Se crearon "+cont3+" de tres digitos");
        System.out.println("Se crearon "+cont4+" de cuatro digitos");
        System.out.println("Se crearon "+cont5+" de cinco digitos");
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio17;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio17 {

    /**
     * @param args the command line arguments
     * 
     * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
     */
    public static void main(String[] args) {
        int num, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de numeros que tendra el vector");
        int vector [] = new int [leer.nextInt()];
        
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int) (Math.random()*99999);
            //System.out.println(vector[i]);
            if (vector[i]< 10){
                cont1++;
            } else if (vector[i]< 100){
                cont2++;
            } else if (vector[i]< 1000){
                cont3++;
            } else if (vector[i]< 10000){
                cont4++;
            } else {
                cont5++;
            }
        }
        System.out.println("Se crearon "+cont1+" de un digito");
        System.out.println("Se crearon "+cont2+" de dos digitos");
        System.out.println("Se crearon "+cont3+" de tres digitos");
        System.out.println("Se crearon "+cont4+" de cuatro digitos");
        System.out.println("Se crearon "+cont5+" de cinco digitos");
    }
    
}
>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
