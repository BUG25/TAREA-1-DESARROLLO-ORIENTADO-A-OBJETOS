public abstract class Dulce extends Producto {
    public Dulce (String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }
    public abstract String getSabor();
}
