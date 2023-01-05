<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio13 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int valor;
        String matriz [][];
        System.out.println("Ingrese un valor para calcular el cuadrado");
        Scanner leer = new Scanner (System.in);
        valor = leer.nextInt();
        matriz = new String [valor] [valor];  
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                if (i == 0 || i == valor-1 || j == 0 || j == valor-1) {
                    matriz [i][j] = "*";
                } else {
                    matriz [i][j] = " ";
                    }
            }
        }
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.print(matriz [i][j]);
                } System.out.println("");
            } 
        int [] vector = new int [100];
        for (int i = 0; i < 100; i++) {
            vector [i] = i + 1;
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(vector[i]);
        }
    }
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio13;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio13 {

    /**
     * @param args the command line arguments
     * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int valor;
        String matriz [][];
        System.out.println("Ingrese un valor para calcular el cuadrado");
        Scanner leer = new Scanner (System.in);
        valor = leer.nextInt();
        matriz = new String [valor] [valor];  
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                if (i == 0 || i == valor-1 || j == 0 || j == valor-1) {
                    matriz [i][j] = "*";
                } else {
                    matriz [i][j] = " ";
                    }
            }
        }
        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                System.out.print(matriz [i][j]);
                } System.out.println("");
            } 
        int [] vector = new int [100];
        for (int i = 0; i < 100; i++) {
            vector [i] = i + 1;
        }
        for (int i = 100; i > 0; i--) {
            System.out.println(vector[i]);
        }
    }
>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
}