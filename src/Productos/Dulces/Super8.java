package src.Productos.Dulces;


public class Super8 extends Dulce {
    public Super8(String nombre, int ID, int precio, int cantidad) {
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        return "sabor a barra con chocolate";
    }
}