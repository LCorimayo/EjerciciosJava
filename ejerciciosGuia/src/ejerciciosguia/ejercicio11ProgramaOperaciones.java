/*
 Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por 
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la 
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del 
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está 
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale 
del programa, caso contrario se vuelve a mostrar el menú
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio11ProgramaOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int resultado;
        char confirmacion = 'N';
        int opcion;
        
        do {
            System.out.println("Ingrese el primer numero entero positivo");
            int num1 = leer.nextInt();
            System.out.println("Ingrese el segundo numero entero positivo");
            int num2 = leer.nextInt();
            
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            System.out.println("Elija una opcion: ");
            opcion = leer.nextInt(); 
            
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es "+ resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: "+ resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: "+ resultado);
                    break;
                case 4: 
                    resultado = num1 / num2;
                    System.out.println("El resultado de la division es: "+ resultado);
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next().charAt(0);
                    // if (confirmacion == 'S' || confirmacion == 's' ){
                    System.out.println("Adios");
                        //system.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
        } while (opcion != 5 || confirmacion != 'S');
        
    }
 }
