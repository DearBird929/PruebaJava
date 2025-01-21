/* Hacer un programa que pida 6 números decimales al usuario
 * y los guarde en un array, después debe mostrarlos en orden 
 * que se introdujeron.
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);
        double[] numeros = new double[10];
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;

        System.out.println("Introduce los 10 números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = leerDatos.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                negativos++;
            } else if (numeros[i] > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        System.out.println("Números negativos: " + negativos);
        System.out.println("Números positivos: " + positivos);
        System.out.println("Ceros: " + ceros);

        leerDatos.close();
    }
}
