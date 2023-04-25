/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que 
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada 
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio19MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        int n = 3;
        int [] [] matriz = new int [n] [n];
        int [] [] matrizT = new int [n] [n];
        int num=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] =leer.nextInt();
                matrizT[j][i] = matriz[i][j];
            }
        
        }
         validarMatriz(matriz, matrizT, n, num);  
       
    }
    public static void validarMatriz(int matriz[][], int matrizT[][], int n, int num){
       int cont=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == -(matrizT[i][j])){
                    cont++;
                }
            }
      }
       if (n*n==cont){
            System.out.println("La matriz es Anti simetrica");
        } else {
            System.out.println("La matriz no es anti simetrica");
        }
    }
}


