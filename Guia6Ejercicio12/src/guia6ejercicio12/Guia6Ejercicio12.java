<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio12 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        String frase;
        int contador3 = 0, cont = 0, cont2 = 0;
        System.out.println("Ingrese una palabra de cinco digitos, que comience con 'X' y finalice con 'O'");
        System.out.println("Para finalizar ingrese '&&&&&'");
        do {
            Scanner leer = new Scanner (System.in);
            frase = leer.nextLine();
            frase = frase.toLowerCase();
            
            if (!"&&&&&".equals(frase)) {
                contador3 += 1;
            } else if ("&&&&&".equals(frase)) {
                break;
            }
            if (validacion(frase) == true) {
                cont += 1;
            } else {
                cont2 += 1;
            }
        } while (!"&&&&&".equals(frase));
        
        
        System.out.println("se contabilizaron "+ contador3+" palabras, "+cont+" correctas y "+cont2+" incorrectas");
        
    }

    
    public static boolean validacion(String palabra){
        boolean validar;
        if (palabra.length() == 5 && "x".equals(palabra.substring(0,1)) && "o".equals(palabra.substring(4,5))) {
            validar = true;
            
        } else {
            validar = false;
        }
        return validar;
        }
    
     
    }
    

=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6ejercicio12;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Guia6Ejercicio12 {

    /**
     * @param args the command line arguments
     * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
     */
    public static void main(String[] args) {
        String frase;
        int contador3 = 0, cont = 0, cont2 = 0;
        System.out.println("Ingrese una palabra de cinco digitos, que comience con 'X' y finalice con 'O'");
        System.out.println("Para finalizar ingrese '&&&&&'");
        do {
            Scanner leer = new Scanner (System.in);
            frase = leer.nextLine();
            frase = frase.toLowerCase();
            
            if (!"&&&&&".equals(frase)) {
                contador3 += 1;
            } else if ("&&&&&".equals(frase)) {
                break;
            }
            if (validacion(frase) == true) {
                cont += 1;
            } else {
                cont2 += 1;
            }
        } while (!"&&&&&".equals(frase));
        
        
        System.out.println("se contabilizaron "+ contador3+" palabras, "+cont+" correctas y "+cont2+" incorrectas");
        
    }

    
    public static boolean validacion(String palabra){
        boolean validar;
        if (palabra.length() == 5 && "x".equals(palabra.substring(0,1)) && "o".equals(palabra.substring(4,5))) {
            validar = true;
            
        } else {
            validar = false;
        }
        return validar;
        }
    
     
    }
    

>>>>>>> cd5f2a81a3ad2819b38ffd9ba43a6dab90821281
