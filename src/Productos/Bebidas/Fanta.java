package src.Productos.Bebidas;

public class Fanta extends Bebida {
    public Fanta (String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        return "Fanta";
    }
}
