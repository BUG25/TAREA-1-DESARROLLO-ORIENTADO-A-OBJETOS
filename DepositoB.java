import java.util.ArrayList;
public class DepositoB {
    private ArrayList<Bebida> bebidas;
    public DepositoB(){
        bebidas = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public Bebida getBebida() {
        if (!bebidas.isEmpty()) {
            return bebidas.removeFirst();
        }
        return null;
    }
}
