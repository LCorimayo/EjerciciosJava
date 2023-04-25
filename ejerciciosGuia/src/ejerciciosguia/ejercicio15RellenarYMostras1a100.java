/*
  Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los 
muestre por pantalla en orden descendente.

 */
package ejerciciosguia;

/**
 *
 * @author Corimayo
 */
public class ejercicio15RellenarYMostras1a100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          cienaluno();
    }
    public static void cienaluno() {
       int[] numeros = new int[100];
        for (int i = 0; i < 100; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 99; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
}
    }
