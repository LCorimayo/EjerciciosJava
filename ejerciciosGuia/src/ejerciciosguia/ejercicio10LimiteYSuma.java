/*
. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los números introducidos supere el 
límite inicial. 
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio10LimiteYSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el limite deseado");
        int limite=leer.nextInt();
        int numeros;
        int suma;
        suma=0;
        do {
            System.out.println("Ingrese numeros");
            numeros=leer.nextInt();
            suma= suma +numeros;
            System.out.println(suma);
        } while (suma<limite);
        System.out.println("Se supero el limite!");
        System.out.println("La suma de los numeros ingresados es de " +suma);
    }
    
}
