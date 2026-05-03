package src.Productos.Bebidas;

public class Fanta extends Bebida {
    public Fanta (String nombre, int ID, int precio, int cantidad){
        /**
         * Constructor de la subclase Fanta
         * Recibe los parametros de la clase padre
         */
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        /**
         * Sobreescribe el sabor al de bebida Fanta
         */
        return "src.Productos.Bebidas.Fanta";
    }
}
