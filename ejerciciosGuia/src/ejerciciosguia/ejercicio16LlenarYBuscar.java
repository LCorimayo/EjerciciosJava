/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio16LlenarYBuscar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       llenarMatriz();     
    }
  public static void llenarMatriz(){
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] numeros = new int[n];
      for (int i = 0; i <n ; i++) {
          numeros[i]=  (int) (Math.random() * 10);
      }
      for (int i = 0; i < n; i++) {
          System.out.println(numeros[i]);
      }
      int numero;
         System.out.println("Ingrese el numero que desea buscar");
             numero=leer.nextInt();
      for (int i = 0; i < n; i++) {
          do {
            //System.out.println("Ingrese el numero que desea buscar");
             //numero=leer.nextInt();
          if (numero == numeros[i]) {
              System.out.println("El numero se encontro en la posicion " + i);
             break;
          }   
      } while (numero==numeros[i]);
  }
    }
}
