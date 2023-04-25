/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
 en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en 
 Java.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio3MayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        String nombreMin = frase.toLowerCase();
        String fraseMa = nombreMin.toUpperCase();
        
        System.out.println(nombreMin);
        System.out.println(fraseMa);
    }
    
}
