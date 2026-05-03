package src;

import src.Monedas.*;
import java.util.ArrayList;  //sirve para la prueba de orednar monedas (comparable)
import java.util.Collections;// comparable también

/**
 * Clase principal que contiene laspruebas de funcionamiento de la máquina expendedor.
 * Se ejecutan distintos escenarios los cuales son compra exitosa, pago insuficiente,
 * moneda nula, producto agotado, ordenación de moendas, etc.
 */

public class Main {

    /**
     * Método principal que ejecutas todas las pruebas de la máquina expendedora.
     * 
     * <p>las pruebas realizadas:
     * <ol>
     *     <li>compra exitosa.</li>
     *     <li><li>Compra con pago insuficiente.</li>
     *     <li>Pago nulo.</li>
     *     <li>Pago insuficiente para el producto.</li>
     *     <li>Producto agotado.</li>
     *     <li>Ordenación de monedas usando Comparable.</li>
     *     <li>Compra exitosa de otro producto.</li>
     * </ol>
     * </p>
     * 
     * @param args argumentos de línea de comandos -> no se usan
     */
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DEL EXPENDEDOR ===\n");
        Maquina maquina = new Maquina(1,3);

        // PRUEBA COMPRAEXITOSA
        System.out.println("- Prueba 1: Compra exitosa (Sprite $900, pago $1000)");
        Comprador c1 = new Comprador(new Moneda1000(), Seleccion.SPRITE, maquina);
        System.out.println("Se ha consumido: " + c1.getSaborConsumo());
        System.out.println("Vuelto: $" + c1.getTotalVuelto());

        // PRUEBA COMPRA SIN VUELTO
        System.out.println("\n- Prueba 2: Compra insuficiente");
        Comprador c2 = new Comprador(new Moneda500(), Seleccion.SNICKERS, maquina);
        System.out.println("Se ha consumido: '" + c2.getSaborConsumo() + "' (vacío en caso de fallo)");
        System.out.println("Vuelto: $" + c2.getTotalVuelto());

        // PRUBEA EXCEPCION PAGA INCORRECTO
        System.out.println("\n- Prueba 3: PagoIncorrectoExceptioN");
        Comprador c3 = new Comprador(null, Seleccion.COCA_COLA, maquina);
        System.out.println("Vuelto: $" + c3.getTotalVuelto());

        //PRUEBA EXCEPCION PAGO INSUFICIENTE
        System.out.println("\n- Prueba 4: PagoInsuficienteException");
        Comprador c4 = new Comprador(new Moneda500(), Seleccion.COCA_COLA, maquina);
        System.out.println("Vuelto (misma moneda): $" + c4.getTotalVuelto());

        // PRUBEA EXCEPCIÓN NO HAY PRODUCTO
        System.out.println("\n- Prueba 5: NoHayProductoException");
        for (int i = 0; i < 3; i++) new Comprador(new Moneda500(), Seleccion.SUPER8, maquina);  //agotamos los super8
        Comprador c5 = new Comprador(new Moneda500(), Seleccion.SUPER8, maquina);
        System.out.println("Vuelto (misma moneda): $" + c5.getTotalVuelto());

        //PRUEBA ORDENAR MONEDAS CON COMPARABLE
        System.out.println("\n- Prueba 6: Ordenación de monedas con Comparable");
        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda1000());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda100());
        monedas.add(new Moneda1000());
        System.out.println("Antes: " + monedas.stream().map(m -> "$" + m.getValor()).toList());
        Collections.sort(monedas);
        System.out.println("Después: " + monedas.stream().map(m -> "$" + m.getValor()).toList());

        // PTUEBA COMPRA DULCE EXITOSA
        System.out.println("\n- Prueba 7: Compra de Snickers");
        Comprador c6 = new Comprador(new Moneda1000(), Seleccion.SNICKERS, maquina);
        System.out.println("Se ha consumido: " + c6.getSaborConsumo());
        System.out.println("Vuelto: $" + c6.getTotalVuelto());
    }
}