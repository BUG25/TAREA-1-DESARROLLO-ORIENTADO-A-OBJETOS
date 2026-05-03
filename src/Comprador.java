package src;

import src.Monedas.Moneda;
import src.Productos.Producto;
import src.Excepciones.*;

/**
* clase que representa un cliente que interactua con la maquina
* se encarga de netregar el pago, dar el producto y recolectar el vuelto
*/

public class Comprador{
    // Atributos
    private String saborConsumo;
    private int totalVuelto;
    /** suma del valor de las monedas recibidas como vuelto*/

    public Comprador(Moneda moneda, Seleccion seleccion, Maquina maquina){
        /** Constructor del comprador
        * intenta realizar la compra y recupera el vuelto disponible 
        * @param moneda que se ingresa para comprar
        * @param seleccion Tipo del producto elejido
        */
        this.saborConsumo = "";
        this.totalVuelto = 0;

        try{
            Producto producto = maquina.comprarProducto(moneda, seleccion);
            /** consumimos el producto y registramos su sabor */
            if(producto instanceof src.Productos.Bebidas.Bebida){
                this.saborConsumo = ((src.Productos.Bebidas.Bebida) producto).getSabor();
            }else if(producto instanceof src.Productos.Dulces.Dulce){
                this.saborConsumo = ((src.Productos.Dulces.Dulce) producto).getSabor();
            }
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Error al comprar: " + e.getMessage());
        }

        // recuperamos el vuelto moneda a moneda
        Moneda m = maquina.getVuelto();
        while (m != null) {
            this.totalVuelto += m.getValor();
            m = maquina.getVuelto();
        }
    }

    public String getSaborConsumo(){
        /** obtenemos el sabor del producto consumido
        * @return string con el sabor del producto o vacio si no se pudo hacer la compra
        */
        return saborConsumo;
    }

    public int getTotalVuelto(){
        /** obtiene el monto total del vuelto
        * @return int con la suma de las monedas del vuelto
        */
        return totalVuelto;
    }
    
}
