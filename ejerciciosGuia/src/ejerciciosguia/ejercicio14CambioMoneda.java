/*
 Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio14CambioMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 System.out.println("Ingrese la cantidad de euros a convertir");
        Scanner leer = new Scanner(System.in);
        double euros = leer.nextDouble();
        conversor (euros);
    }
    
    public static void conversor (double euros){
        Scanner leer = new Scanner (System.in);
        
        double [] cambio = new double [3];
        cambio [0] = euros*0.86;         //libras
        cambio [1] = euros*1.28611;      //dólares
        cambio [2] = euros*129.852;      //yenes
        
        System.out.println("elija el tipo de moneda a convertir: \n 1. libras \n 2. dólares \n 3. yenes"); // \ alt 92
            int monedas = leer.nextInt();
        System.out.println(cambio[monedas-1]);
     
        
        
}
    }

