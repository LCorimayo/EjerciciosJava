/*
 . Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio13Cuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("ingrese el tamaño del lado del cuadrado a dibujar");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
               
        for (int i = 0; i < n; i++) {
            
            if (i==0 || i==(n-1)) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" * ");
                } 
               
                      
            } else {
                for (int j=0; j < n; j++) {
                    if (j==0 || j==(n-1)) {
                       System.out.print(" * ");
                    } else {
                       System.out.print("   "); 
                    }
              
                }
            }
            System.out.println("");
       }
    }
    
}
