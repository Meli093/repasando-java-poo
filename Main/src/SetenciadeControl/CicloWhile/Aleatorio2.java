/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetenciadeControl.CicloWhile;

/**
 *
 * @author MR
 */
public class Aleatorio2 {
public static void main(String[] args) {

    System.out.println("20 números aleatorios entre 0 y 9 (sin decimales):");
    
    for (int i = 1; i <= 20; i++) {
      System.out.print((int)(Math.random()*10) + "  ");//random escoge cualquier numero del rango asignado
      //osea del 0-9.
    }

    System.out.println();
  }    
}
