package Operadores;
public class ConversionDeTipos {
public static void main(String[] args) {

    int x = 2;
    int y = 9;
    double division;//Un double es un tipo de datos de coma flotante de doble precisión y 64 bits.

    division = (double)y / (double)x;
    //division = y / x; // Comenta esta línea y
                // observa la diferencia.
  
    System.out.println("El resultado de la división es " + division);   
  }
}    

