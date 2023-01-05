/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio11 {

    /**
     * @param args the command line arguments
     * 
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
*      El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
     */
    public static void main(String[] args) {
        int num1, num2, opcion;
        String salir = "N";
        System.out.println("Indique el primer valor");
        Scanner leer = new Scanner (System.in);
        num1 = leer.nextInt();
        System.out.println("Indique el segundo valor");
        Scanner leer2 = new Scanner (System.in);
        num2 = leer2.nextInt();
        
        do {
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.println("Indique la opcion a elegir");
        Scanner leer3 = new Scanner (System.in);
        opcion = leer3.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: "+ num1 + num2);
                break;
            case 2:
                System.out.println("El resultado de la resta es: "+ (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicacion es: " + (num1*num2));
                break;
            case 4:
                System.out.println("El resultado de la division es: " + (num1/num2));
                break;
            case 5:
                System.out.println("Seguro desea Salir? S/N");
                Scanner leer4 = new Scanner (System.in);
                salir = leer4.nextLine();
                salir = salir.toUpperCase();
                //break;
        
        } 
        } while (salir == "S");
        System.out.println("Gracias");
    }
    
}
