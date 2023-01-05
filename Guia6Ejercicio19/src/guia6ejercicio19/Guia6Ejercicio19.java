<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio19 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        //int [][] matriz = new int [4][4];
        //int [][] matrizAt = new int [4][4];
        int [][] matriz = {{0,2,4},{2,0,2},{-4,-2,0}};
        int [][] matrizAt = {{0,2,-4},{-2,0,-2},{4,2,0}};
        boolean validar = false;
        Scanner leer = new Scanner (System.in);
        /*for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = leer.nextInt();
                        //(int) (Math.random() * 2 - 2);
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrizAt[i][j] = leer.nextInt(); 
                        //(int) (Math.random() * 2 - 2);
            }
        }
        */
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + "|");
                }System.out.println("");
        }
        
        System.out.println("---------------------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrizAt[i][j] + "|");
                }System.out.println("");
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int num = matriz[i][j];
                num = num * (-1);
                System.out.println(matrizAt[j][i] +" | " + num);
            if (matrizAt[i][j] == num){
                validar = true;
                //break;
                } else if (matrizAt[i][j] != num){
                validar = false;
                break;
                }
                
            
            }
            
        }
        
        if (validar == true){
            System.out.println("Las matrices son Anti Simetricas");
        } else if (validar == false){
            System.out.println("Las matrices No son Anti Simetricas");
        }
        
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio19 {

    /**
     * @param args the command line arguments
     * 
     * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
        //int [][] matriz = new int [4][4];
        //int [][] matrizAt = new int [4][4];
        int [][] matriz = {{0,2,4},{2,0,2},{-4,-2,0}};
        int [][] matrizAt = {{0,2,-4},{-2,0,-2},{4,2,0}};
        boolean validar = false;
        Scanner leer = new Scanner (System.in);
        /*for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = leer.nextInt();
                        //(int) (Math.random() * 2 - 2);
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrizAt[i][j] = leer.nextInt(); 
                        //(int) (Math.random() * 2 - 2);
            }
        }
        */
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + "|");
                }System.out.println("");
        }
        
        System.out.println("---------------------------");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(matrizAt[i][j] + "|");
                }System.out.println("");
        }
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                int num = matriz[i][j];
                num = num * (-1);
                System.out.println(matrizAt[j][i] +" | " + num);
            if (matrizAt[i][j] == num){
                validar = true;
                //break;
                } else if (matrizAt[i][j] != num){
                validar = false;
                break;
                }
                
            
            }
            
        }
        
        if (validar == true){
            System.out.println("Las matrices son Anti Simetricas");
        } else if (validar == false){
            System.out.println("Las matrices No son Anti Simetricas");
        }
        
    }
    
}
>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
