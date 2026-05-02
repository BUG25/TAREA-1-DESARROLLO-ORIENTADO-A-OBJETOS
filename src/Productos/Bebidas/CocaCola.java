package src.Productos.Bebidas;

public class CocaCola extends Bebida {
    public CocaCola (String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        return "src.Productos.Bebidas.CocaCola";
    }
}
