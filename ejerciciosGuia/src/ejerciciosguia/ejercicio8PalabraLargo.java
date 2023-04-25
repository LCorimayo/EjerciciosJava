/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si 
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Lenght() en Java
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio8PalabraLargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         String palabra;
            System.out.println("Ingrese una palabra");
            palabra = read.nextLine();
        if(palabra.length()==8){
            System.out.println("Correcto, la palabra tiene 8 caracteres");
        } else {
            System.out.println("Incorrecto");
        }
     }  
   }
