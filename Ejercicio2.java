/* Igual que el primer ejercicio (puedes reutilizar el código)
 * pero que lo muestre en orden inverso.
 */
import java.util.Scanner;
public static void main (String [] args) {
    Scanner leerDatos = new Scanner(System.in);
    double[] numeros = new double[6];
    for (int i = 0; i < 6; i++) {
        System.out.println("Introduce los números decimales: ");
        numeros[i] = leerDatos.nextDouble();
    }
    for (int i = 5; i > 0; i--) {
        System.out.println(numeros[i]);
    }
}