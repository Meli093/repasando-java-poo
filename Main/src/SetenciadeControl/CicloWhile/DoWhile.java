//podemos repetir instrucciones, al menos una vez, incluso si la condición a comprobar es falsa, 
//esto se debe a que la expresión.se evalúa después de que se ejecuta el cuerpo del bloque loop.
package SetenciadeControl.CicloWhile;

public class DoWhile {
    
public static void main(String[] args) {
    
        int contador = 0;
        int limite = 11;
        do{
            
         System.out.println("contador = " + contador);
         contador++;
        }
        while (contador < limite);
    }    
}
