package src.Productos.Dulces;

public class Snickers extends Dulce{
    public Snickers(String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        return "src.Productos.Dulces.Snickers";
    }
}
