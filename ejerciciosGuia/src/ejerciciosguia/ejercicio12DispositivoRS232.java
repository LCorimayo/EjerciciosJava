/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
ser X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia 
distinta de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().
 */
package ejerciciosguia;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class ejercicio12DispositivoRS232 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String cadena;
        int correctas=0;
                int incorrectas=0;
         do{
             System.out.println("Ingrese el mensaje");
             cadena=leer.nextLine();
             if("&&&&&".equals(cadena)){
                 break;
             }
             if (cadena.length()==5 && cadena.substring(0,1).equals("X") && cadena.substring(4).equals("O")){
                 correctas++;
             } else {
                 incorrectas++;
             }
         }
       while (!"&&&&&".equals(cadena));
                System.out.println("Informes de lectura");
                System.out.println("Informes correctos " +correctas);
                System.out.println("Informes incorrectos " +incorrectas);
    }
    }
    
