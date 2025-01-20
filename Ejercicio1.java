/* Hacer un programa que pida 6 números decimales al usuario
 * y los guarde en un array, después debe mostrarlos en el mismo 
 * orden en que se introdujeron.
 */

import java.util.Scanner;
public static void main (String[] args) {
    Scanner leerDatos = new Scanner(System.in);
    double[] numeros = new double[6];
    for (int i = 0; i < 6; i++) {
        System.out.println("Introduce un número decimal: ");
        numeros[i] = leerDatos.nextDouble();
    }
    for (int i = 0; i < 6; i++) {
        System.out.println(numeros[i]);
    }
}