/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio14 {

    /**
     * @param args the command line arguments
     * 
     * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        int numero;
        String moneda = null;
        boolean salir = false;
        do {
        System.out.println("Indicar la cantidad de Euros a convertir"); 
        Scanner leer = new Scanner (System.in);
        numero = leer.nextInt();
        } while (0 >= numero);
        
        
        do { 
        System.out.println("Indicar la moneda a la que se desea convertir");
        System.out.println("Puede realizar el cambio a Dolar, Libra o Yen");
        Scanner leer = new Scanner (System.in);
        moneda = leer.next();
        moneda = moneda.toLowerCase();
        salir = "yen".equals(moneda) || moneda.equals("libra") || moneda.equals("dolar");
        } while (salir == false );
        
        convertir(numero,moneda);
        
    }
public static String convertir(int num, String moneda){
    switch (moneda){
        case "dolar":
            System.out.println("El cambio de $ "+num+" es de: "+num*1.28611+" Dolares");
            break;
        case "libra":
            System.out.println("El cambio de $ "+num+" es de: "+num*0.86+ " Libras");
            break;
        case "yen":
            System.out.println("El cambio de $ "+num+" es de: "+num*129.852+ " Yenes");
            break;
    }
        
        return null;
        
}
}
