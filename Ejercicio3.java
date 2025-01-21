/* Hacer un programa que pida 6 números decimales al usuario
 * y los guarde en un array, después debe mostrarlos en orden 
 * que se introdujeron.
 */
import java.util.Scanner;
public class Ejercicio3 {
    Scanner leerDatos = new Scanner(System.in);
    double[] numeros = new double[10];
    int negativos = 0;
    int positivos = 0;
    int ceros = 0;
    
    for (int i = 0; i < 10; i++) {
        System.out.println("\nIntroduce los 10 números:");
    }

    if (i <0) {
        negativos++;
    } if else (i > 0) {
        positivos++;
    } else {
        ceros++;
    }
    leerDatos.close();
}
