/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio20CuadradoMagico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int[][] matriz = new int [3][3];
       int n = 0;
        System.out.println("Por favor ingrese los numeros de la matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               n=leer.nextInt();
                       if (n>9){
                           System.out.println("el numero debe estar entre 1 y 9 por favor ingrese otro");
                         n=leer.nextInt();
                       }
                         matriz[i][j]=n;
                       }
            }
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+ matriz[i][j] +"]");
            }
             System.out.println(" ");
         }
         validarMatriz(n, matriz);
    }
   public static void validarMatriz(int n, int matriz[][]){
       //+j=m-1 segunda diagonal.
       boolean filas=false;
       boolean columnas= false;
       boolean diagonales= false;
       int d1=0;
       int d2=0;
       int cont=0;
       for (int i = 0; i <3 ; i++) {
           for (int j = 0; j <3 ; j++) {
             if (i==j){
                 d1=d1+matriz[i][j];
             }
             if (i+j==2){
                 d2=d2+matriz[i][j];
             }
           }
       }
       if (d1==d2){
           diagonales=true;
       }
       for (int i = 0; i < 3; i++) {
            int filaSuma=0;
           for (int j = 0; j < 3; j++) {
               filaSuma=filaSuma+matriz[i][j];
           }
           if (filaSuma==d1){
               cont++;
           }
       }
       if (cont==3){
                filas=true;
       }
        cont=0;
       for (int j = 0; j < 3; j++) {
          
           int columnaSuma=0; 
           for (int i = 0; i < 3; i++) {
              columnaSuma=columnaSuma+matriz[i][j]; 
           }
           if (columnaSuma==d1){
               cont++;
           }
       }
       if(cont==3){
           columnas=true;
       }
      
       if (columnas==true && filas==true && diagonales==true){
           System.out.println("Es un cuadrado magico");
       } else {
           System.out.println("No es un cuadrado magico");
       }
   } 
}
