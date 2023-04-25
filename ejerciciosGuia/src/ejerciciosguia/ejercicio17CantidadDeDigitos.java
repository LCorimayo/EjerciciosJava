/*
  Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
  de 2 dígitos, etcétera (hasta 5 dígitos).

 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio17CantidadDeDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       llenarVector();
    }
    public static void llenarVector(){
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        String [] numeros = new String[n];
      
       int cont1=0;
       int cont2=0;
       int cont3=0;
       int cont4=0;
       int cont5=0; 
        
        
       for (int i = 0; i <n ; i++) {
          numeros[i]=  String.valueOf((int)((Math.random() * 100000)));
          System.out.println(numeros[i] + " la cantidad de dígitos " + numeros[i].length());
         
       int longitud=0;
         
       switch (longitud=numeros[i].length()) {
              case 1:
                  cont1++;
                  break;
              case 2:
                  cont2++;
                  break;
              case 3:
                  cont3++;
                  break;
              case 4:
                  cont4++;
                  break;
              case 5:  
                  cont5++;
                  break;
          }
        }
       
       System.out.println("tenemos " + cont5 + " números con 5 dígitos");
       System.out.println("tenemos " + cont4 + " números con 4 dígitos");    
       System.out.println("tenemos " + cont3 + " números con 3 dígitos");
       System.out.println("tenemos " + cont2 + " números con 2 dígitos");
       System.out.println("tenemos " + cont1 + " números con 1 dígitos");
}
    }
