public class Sprite extends Bebida {
    public Sprite(String nombre, int ID, int precio, int cantidad){
        super(nombre, ID, precio, cantidad);
    }

    @Override
    public String getSabor() {
        return "Sprite";
    }
}
