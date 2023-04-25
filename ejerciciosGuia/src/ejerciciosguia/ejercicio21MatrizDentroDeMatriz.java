/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:
48
Como podemos observar nuestra submatriz P se encuentra en la matriz M en los índices: 
4,4 - 4,5 - 4,6 - 5,4 - 5,5 - 5,6 - 6,4 - 6,5 - 6,6.
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio21MatrizDentroDeMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrizM = new int [10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j]=  (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                System.out.print("["+ matrizM[i][j]+"]"); 
            }
            System.out.println(" ");
        }
      buscarMatriz(matrizM);  
    }
        public static void buscarMatriz(int matrizM[][]){
       Scanner leer = new Scanner (System.in);
        int [][] matrizP = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j]=leer.nextInt();
            }
        }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (matrizM[i][j]!= matrizP[0][0]){
                        break;
                    }
                }
            }
    }
}
