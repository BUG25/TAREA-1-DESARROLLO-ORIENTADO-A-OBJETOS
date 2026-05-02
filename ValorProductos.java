public enum ValorProductos {
    CocaCola("CocaCola",101, 1000),
    Fanta("Fanta", 102, 900),
    Sprite("Sprite", 103, 900),
    Snickers("Snickers", 201, 600),
    Super8("Super8", 202, 300);

    private final int ID;
    private final String nombre;
    private final int precio;
    ValorProductos(String nombre, int ID, int precio){
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;

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
