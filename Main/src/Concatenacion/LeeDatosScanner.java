
package Concatenacion;

import java.util.Scanner;

public class LeeDatosScanner {
    
public static void main(String[] args) {
    //esta diseñado para leer los bytes y convertirlo en valores primitivos (int, double, bool, etc) o en valores String.
    Scanner s = new Scanner(System.in);// System.in, la cual obtiene la informacion de usuario.

    System.out.print("Introduce tu nombre y tu edad separados por un espacio: ");
    
    String nombre = s.next();
    
    // int es una variable llamada edad la cual va a almacenar un numero entero.
    int edad = s.nextInt();//se utiliza para obtener un valor int pseudoaleatorio,
    //distribuido uniformemente entre 0 (incluido) y el valor especificado
    
    System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);
  }    
}
