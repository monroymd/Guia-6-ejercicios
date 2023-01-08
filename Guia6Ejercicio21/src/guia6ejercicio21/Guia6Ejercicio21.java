/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio21;

/**
 *
 * @author user
 */
public class Guia6Ejercicio21 {

    /**
     * @param args the command line arguments
     * 
     * Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
     */
    public static void main(String[] args) {
        //int [][] matriz = new int [10][10];
        //int [][] matriz2 = new int [3][3];
        
        int [][] matriz = 
            {{1,26,36,47,5,6,72,81,95,10},
            {11,12,13,21,41,22,67,20,10,61},
            {56,78,87,90,9,90,17,12,87,67},
            {41,87,24,56,97,74,87,42,64,35},
            {32,76,79,1,36,5,67,96,12,11},
            {99,13,54,88,89,90,75,12,41,76},
            {67,78,87,45,14,22,26,42,56,78},
            {98,45,34,23,32,56,74,16,19,18},
            {24,67,97,46,87,13,67,89,93,24},
            {21,68,78,98,90,67,12,41,65,12}};
        int [][] matriz2 =
            {{36,5,67},
            {89,90,75},
            {14,22,26}};
        boolean vuelta = false;
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matriz[i][j] == matriz2[0][0]) {
                    boolean verifica = comparaMatriz(matriz, matriz2, i, j);
                    if (verifica) {
                        vuelta = true;
                        System.out.println("La matriz se encuentra en el cuadrante");
                        for (int k = i; k < i+3; k++) {
                            for (int l = j; l < j+3; l++) {
                                System.out.println( k + ", "+ l + " ");
                            }
                        } 
                    } 
                }
                
            }
            
        } if (!vuelta) {
            System.out.println("La matriz no se ha encontrado");
        } 
    }
    public static boolean comparaMatriz(int matriz[][], int matriz2 [][], int numi, int numj){
        boolean verifica = true;
        int cont1 = 0, cont2 = 0;
        for (int i = numi; i <= numi+2 && verifica == true; i++) {
            for (int j = numj; j <= numj+2 && verifica == true; j++) {
                verifica = matriz[i][j] == matriz2[cont1][cont2];
                cont2++;
            }cont1++;
            cont2 = 0;
        } return verifica;
    }
    }