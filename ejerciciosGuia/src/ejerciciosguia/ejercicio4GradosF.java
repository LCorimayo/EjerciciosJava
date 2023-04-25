/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
 Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio4GradosF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
    System.out.println("Por favor ingrese los grados centigrados");
    int grados= leer.nextInt();
     double Fahrenheit = 32+(9*grados/5);
     System.out.println("Grados en Fahrenheit: " + Fahrenheit);  
    }
    
}
