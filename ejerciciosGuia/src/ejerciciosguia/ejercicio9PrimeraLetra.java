/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla 
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: 
investigar la función Substring y equals() de Java.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio9PrimeraLetra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String palabra= read.nextLine();
        String letra= palabra.substring(0, 1);
        letra = letra.toLowerCase();
        String a = "a";
        
        if (letra.equals(a)){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
