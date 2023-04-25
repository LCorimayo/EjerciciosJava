/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosguia;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio21Daniel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int matrizM [][] = new int  [10][10];
        int matrizP [][] = new int [3][3];
        String cont = new String();
        // Crear Matriz 10x10 - aleatoria
        int i,j;
        for (i = 0 ; i < 10 ; i++) {
            for (j = 0 ; j < 10 ; j++) {
                matrizM [i][j] = aleatorio.nextInt(100);
            }
        }
        imprimirMatriz(matrizM);     // Imprimir Matriz 10x10
        
        System.out.println("");     // Crear Matriz 3x3 - Ingresar valores
        System.out.println("Ingrese los valores de la Matriz P 3x3"); 
        for (i = 0 ; i < 3 ; i++) {
            for (j = 0 ; j < 3 ; j++) {
                System.out.print("Ingrese número para la posición [" + i + "," + j + "] :" );
                int num = leer.nextInt();
                matrizP [i][j]= num;
            }
        }
        imprimirMatriz(matrizP);     // Imprimir Matriz 3x3 
        
        boolean encontrada = false;
        for (int k = 0; k <= 7; k++) {
            for (int l = 0; l <= 7; l++) {
                if (buscarmatrices(matrizM, matrizP, k, l)) {
                    encontrada = true;
                    System.out.println("\nLa Matriz P está contenida en la Matriz M, empezando en la ubicación [" + k + "," + l + "]");
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }
        if (!encontrada) {
            System.out.println(" La Matriz P no está contenida en la Matriz M ");
        }
    }
private static void imprimirMatriz(int[][] matriz) {
        System.out.println("\n *** Matriz " + matriz.length + "x" + matriz.length + " ***" );
        System.out.println("");
        int temp;
          for (int i = 0 ; i < matriz.length ; i++) {
            for(int j = 0 ; j < matriz.length ; j++) {
                temp = matriz[i][j];
                if (temp < 10) {
                    System.out.print("[ " + matriz[i][j] + "]");
                } else {
                  System.out.print("[" + matriz[i][j] + "]");  
                } 
            } System.out.println("");
        }
    }

    private static boolean buscarmatrices(int[][] matrizM, int[][] matrizP, int fila, int columna) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizM[fila + i][columna + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;   
    }
        
}
    
