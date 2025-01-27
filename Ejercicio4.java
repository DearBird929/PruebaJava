/* Hacer un programa que pida 10 números al usuario. 
Después debe mostrarlo por pantalla, en el siguiente 
orden: primero, último, segundo, penúltimo, tercero, 
antepenúltimo,... 
 
Ejemplo: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 
mostraría 1, 10, 2, 9, 3, 8, 4, 7, 5, 6 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce 10 números: ");
            numeros[i] = leerDatos.nextInt();
        }
        
        int i = 0;
        int j = 9;
        while (i <= j) {
            System.out.println(numeros[i]);
            if (i != j) {
                System.out.println(numeros[j]);
            }
            i++;
            j--;
        }
        leerDatos.close();
    }
}
