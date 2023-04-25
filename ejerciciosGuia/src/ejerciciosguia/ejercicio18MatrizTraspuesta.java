/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

/**
 *
 * @author Corimayo
 */
public class ejercicio18MatrizTraspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        llenarMatriz();
    }
     public static void llenarMatriz(){
         int[][] numeros= new int [4][4];
        // numeros[0][0]=0;
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 numeros[i][j] =  (int) (Math.random() * 100);
             }
         }
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 System.out.print(numeros[i][j] + " ");
                }
             System.out.println("");
         }
         System.out.println("  ");
          for (int j = 0; j < 4; j++) {
              for (int i = 0; i < 4; i++) {
                  System.out.print(numeros[i][j]+ " ");
              }
              System.out.println("");
            }
      }
}
