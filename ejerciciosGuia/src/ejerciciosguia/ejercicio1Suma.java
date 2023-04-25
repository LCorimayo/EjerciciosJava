/*
. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
  dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio1Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        int sumaN=num1+num2;
        System.out.println("La suma de los dos numeros ingresados es " + sumaN );          
    }
  }
