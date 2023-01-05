/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio10 {

    /**
     * @param args the command line arguments
     * 
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
     */
    public static void main(String[] args) {
        int limite, num, num2, var = 0;
        System.out.println("Ingresar el numero limite de la suma");
        Scanner leer = new Scanner (System.in);
        limite = leer.nextInt();
        num = 0;
        while (limite > num) {
            System.out.println("Ingrese un valor a sumar");
            Scanner leer2 = new Scanner (System.in);
            num2 = leer2.nextInt();
            num = num + num2;
            if (num<limite) {
            var = num;
            }
        }
        System.out.println("Se alcanzo el limite, el valor resultante es: " + var);
    }
    
}
