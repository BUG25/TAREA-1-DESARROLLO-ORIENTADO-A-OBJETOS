package src;

import src.Monedas.*;
import java.util.Scanner;

/**
 * Main interactivo: permite al usuario comprar productos mediante menú en consola.
 */
public class MainInteractivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maquina maquina = new Maquina(5);
        boolean continuar = true;

        System.out.println("=== BIENVENIDO AL EXPENDEDOR INTERACTIVO ===");

        while (continuar) {
            System.out.println("\n - ¿Qué desea hacer?");
            System.out.println("1. Comprar producto");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            // si se ingresa caracter no numérico, excpeción
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                continuar = false;
                System.out.println("¡Hasta luego!");
                break;
            }

            // seleccionamos coin
            System.out.println("\nSeleccione moneda:");
            System.out.println("1. $100   2. $500   3. $1000");
            System.out.print("Moneda: ");
            int opMoneda = scanner.nextInt();
            Moneda moneda;
            switch (opMoneda) {
                case 1:  moneda = new Moneda100();  break;
                case 2:  moneda = new Moneda500();  break;
                case 3:  moneda = new Moneda1000(); break;
                default: System.out.println("Moneda inválida."); continue;
            }

            //selección producto
            System.out.println("\nSeleccione producto:");
            Seleccion[] selecciones = Seleccion.values();
            for (int i = 0; i < selecciones.length; i++) {
                System.out.printf("%d. %-10s $%d%n",
                    i + 1, selecciones[i].getNombre(), selecciones[i].getPrecio());
            }
            System.out.print("Producto seleecionado: ");
            int opProd = scanner.nextInt() - 1;

            if (opProd < 0 || opProd >= selecciones.length) {  // numero fuera de rnago
                System.out.println("Producto inválido.");
                continue;
            }

            Seleccion seleccion = selecciones[opProd];
            Comprador comprador = new Comprador(moneda, seleccion, maquina);

            System.out.println("\nResultado:");
            // si el comprador no tiene suficiente saldo, se devuelve lo ingresado
            if (!comprador.getSaborConsumo().isEmpty()) {
                System.out.println("  Consumiste: " + comprador.getSaborConsumo());
            }
            System.out.println("  Vuelto recibido: $" + comprador.getTotalVuelto());
        }

        scanner.close();
    }
}