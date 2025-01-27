/* Hacer un programa que pida 6 números decimales al usuario
 * y los guarde en un array, después debe mostrarlos en el mismo 
 * orden en que se introdujeron.
 */

 import java.util.Scanner;

 public class Ejercicio1 {
     public static void main(String[] args) {
         Scanner leerDatos = new Scanner(System.in);
         int[] numeros = new int[6];
         
         for (int i = 0; i < 6; i++) {
             System.out.println("Introduce el número: ");
             numeros[i] = leerDatos.nextInt();
         }
         
         System.out.println("Los números introducidos son:");
         for (int i = 0; i < 6; i++) {
             System.out.println(numeros[i]);
         }
         
         leerDatos.close();
     }
 }