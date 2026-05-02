package src;

import src.Monedas.Moneda;
import src.Productos.Producto;
import src.Excepciones.*;

public class Comprador{
    // Atributos
    private String saborConsumo;
    private int totalVuelto;

    // Constructor
    public Comprador(Moneda moneda, Seleccion seleccion, Maquina maquina){
        this.saborConsumo = "";
        this.totalVuelto = 0;

        try{
            Producto producto = maquina.comprarProducto(moneda, seleccion);
            // consumimos el producto y registramos su sabor
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
        return saborConsumo;
    }

    public int getTotalVuelto(){
        return totalVuelto;
    }
    
}