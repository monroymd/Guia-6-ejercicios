/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio20b;

import java.util.Random;

/**
 *
 * @author user
 */
public class Guia6Ejercicio20b {

    /**
     * @param args the command line arguments
     * 
     * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
     */
    public static void main(String[] args) {
        int [][] cuadradoMag = {{2,7,6},{9,5,1},{4,3,8}};
        int [][] cuadrado = new int [3][3];
        Random aleatorio = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = 1 + aleatorio.nextInt(9);
            }
        }
        if (validador(cuadrado)){
            System.out.println("Es un cuadrado magico!");
        } else {
            System.out.println("No es una cuadrado magico");
        }
        
     }
    public static boolean validador(int matriz [][]){
        int num;
        num = matriz.length;
        int suma = 0, suma1 = 0, suma2 = 0;
        boolean validador;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < num; j++) {
                suma = matriz[i][j] + suma;
            }
            
        }for (int i = 0; i < num; i++) {
            for (int j = 0; j < 1; j++) {
                suma1 = matriz[i][j] + suma1;
            
        }
        }if (suma == suma1) {
            int cont = 0;
            for (int i = 0; i <= cont && cont < num; i++) {
                for (int j = 0; j <= cont && cont < num; j++) {
                    suma2 = matriz[i][j] + suma2;
                    cont++;
                            
                }
            
        } if (suma == suma2){
            validador = true;
        } else {
            validador = false;
        }
        } else {
            validador = false;
        }
        if (validador) {
            
        }
        return validador;
    }
    
}
