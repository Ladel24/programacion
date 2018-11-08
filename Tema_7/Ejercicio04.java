/*
 * Ejercicio 4 - Tema 7
 * Define tres arrays de 20 números enteros cada una, con nombres numero,
 * cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 * array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 * array numero. En el array cubo se deben almacenar los cubos de los valores que
 * hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 * en tres columnas.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author laura
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      
      numero[i] = (int)(Math.random() * 100);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = numero[i] * numero[i] * numero[i];
      
      System.out.printf("%-7d %-7d %-7d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
  
}
