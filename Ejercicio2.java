/* Igual que el primer ejercicio (puedes reutilizar el código)
 * pero que lo muestre en orden inverso.
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        int[] numeros = new int[6];
        
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduce el número: ");
            numeros[i] = leerDatos.nextInt();
        }
        
        System.out.println("Los números introducidos son:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        
        leerDatos.close();
    }
}