/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: 
investigar la función equals() en Java
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio7Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String palabra;
        String clave ="eureka";
        do{
            System.out.println("Por favor ingrese una palabra");
            palabra= leer.nextLine();
        if (palabra.equals(clave)){
            System.out.println("Correcto");
        } else {
             System.out.println("Incorrecto");
        }
    }
        while(!palabra.equals(clave));  
   }
}
 
