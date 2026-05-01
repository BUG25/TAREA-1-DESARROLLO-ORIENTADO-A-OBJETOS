public class Producto {
    private String nombre;
    private int ID;
    private int precio;
    private int cantidad;

    public Producto(String nombre, int ID, int precio, int cantidad){
        this.nombre = nombre;
        this.ID = ID;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }
    public int getID() {
        return ID;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrecio() {
        return precio;
    }
}
