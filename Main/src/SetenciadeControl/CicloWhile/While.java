//Los ciclos nos permitirán repetir un conjunto de instrucciones una cierta cantidad deveces.
//La condición a cumplirse puede ser determinada por el usuario o por el programa, según
//la lógica que se haya establecido

package SetenciadeControl.CicloWhile;
//while se ejecuta en un bloque de código tantas veces como la condición que se evalúa sea verdadera.
//Una vez que esta condición es falsa, entonces se termina la iteración.
public class While {
    
 public static void main(String[] args) {

        int contador = 0;
        int limite = 10;
        while (contador < limite) {
            System.out.println("contador = " + contador);
            contador++;
        }

    }
    
}
