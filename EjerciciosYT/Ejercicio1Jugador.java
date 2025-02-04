package EjerciciosYT;

import java.util.Scanner;

public class Ejercicio1Jugador {
    public static void main(String[] args) {
        Scanner leerDatos = new Scanner(System.in);

        int vida = 20;
        int experiencia = 0;
        int nivel = 1;
        int pociones = 0;
        int experienciaRequerida = (int) (50 * Math.pow(1.5, nivel - 1));
        Object[][] enemigos = {
            {"Paladin", 2, 10},
            {"Tirador", 4, 16},
            {"Guerrero", 3, 14},
            {"Mago", 5, 20}
        };

        while (vida > 0) {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Luchar");
            System.out.println("2. Huir");
            System.out.println("3. Inventario");
            int eleccion = leerDatos.nextInt();

            switch (eleccion) {
                case 1:
                int indiceEnemigo = (int) (Math.random() * enemigos.length);
                String enemigoSeleccionado = (String) enemigos[indiceEnemigo][0];
                int dañoRecibido = (int) enemigos[indiceEnemigo][1];
                int expGanada = (int) enemigos[indiceEnemigo][2];
                System.out.println("¡Te enfrentas a un " + enemigoSeleccionado + "!");
                System.out.println("Hace " + dañoRecibido + " de daño.");
                System.out.println("Si ganas, obtendrás " + expGanada + " puntos de experiencia.");
                    vida -= dañoRecibido;
                    experiencia += expGanada;
                    if (vida <= 0) {
                        System.out.println("Has muerto, perdiste todo el progreso.");
                        break;
                    }
                    experiencia += expGanada;
                    System.out.println(">>> Vida restante: " + vida);
                    System.out.println(">>> Experiencia total: " + experiencia);

                    // Verificar si sube de nivel
                    if (experiencia >= experienciaRequerida) {
                        nivel++;
                        pociones++;
                        experienciaRequerida = (int) (50 * Math.pow(1.5, nivel - 1)); // Actualizar XP necesaria
                        System.out.println(">>> Has subido de nivel! Ahora eres nivel: " + nivel);
                        System.out.println(">>> Has ganado una poción. Ahora tienes: " + pociones);
                    }

                    // Mostrar cuánta XP falta para el siguiente nivel
                    int experienciaRestante = experienciaRequerida - experiencia;
                    System.out.println(">>> Te faltan " + experienciaRestante + " puntos para el próximo nivel.");
                    break;

                case 2:
                    System.out.println(">>> Decidiste huir. Fin del juego.");
                    System.out.println(">>> Vida final: " + vida);
                    System.out.println(">>> Experiencia total: " + experiencia);
                    break;

                case 3:
                    System.out.println("\n Inventario:");
                    System.out.println("Pociones: " + pociones);

                    if (pociones > 0) {
                        System.out.println("¿Quieres usar una poción? (1: Sí / 2: No)");
                        int usarPocion = leerDatos.nextInt();
                        if (usarPocion == 1) {
                            vida = 20; // Restaura la vida al máximo
                            pociones--; // Reduce la cantidad de pociones
                            System.out.println(">>> Has usado una poción. Vida restaurada a 20.");
                            System.out.println(">>> Pociones restantes: " + pociones);
                        }
                    } else {
                        System.out.println("No tienes pociones disponibles.");
                    }
                    break;

                default:
                    System.out.println("X Opción no válida, intenta de nuevo.");
            }
        }

        leerDatos.close();
    }
}
