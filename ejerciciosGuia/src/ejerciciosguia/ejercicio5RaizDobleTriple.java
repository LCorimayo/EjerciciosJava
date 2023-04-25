/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt().
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio5RaizDobleTriple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int Num = leer.nextInt();
        System.out.println("El doble del numero ingresado es: " + Num*2);
        System.out.println("El triple del numero ingresado es " + Num*3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(Num));
    }
    
}
