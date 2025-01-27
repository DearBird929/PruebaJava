/* Implementa el código de ordenamiento por selección visto en clase
 * Pedir el número de elementos por ventana (JOptionPane).
 * A. Pedir los elementos propiamente dichos por teclado (Scanner).
 * B. Poner "el código" (o similar visto en los apuntes)
 * C. Mostrar el array ordenado
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Selección1 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        System.out.println("Introduce el número de elementos por ventana: ");
        int n1 = leerDatos.nextInt();
        int[] n2 = new int[n1];
        for (int i = 0; i < n2; i++) {
            System.out.println("Introduce " + n1 + " números: ");
            n2[i] = leerDatos.nextInt();
        }
        System.out.println("Array ordenado:" + n1);
    }
}