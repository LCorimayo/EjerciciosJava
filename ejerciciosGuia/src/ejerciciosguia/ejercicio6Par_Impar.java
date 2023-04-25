/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio6Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int num=leer.nextInt();
        double par=num%2;
        if (par==0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
}
