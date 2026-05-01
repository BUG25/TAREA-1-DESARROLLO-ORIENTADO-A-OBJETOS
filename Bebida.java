public abstract class Bebida extends Producto {
    public Bebida (String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }
    public abstract String getSabor();
}
