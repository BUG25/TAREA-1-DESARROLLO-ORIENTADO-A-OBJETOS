import java.util.ArrayList;
class DepositoM {
    private ArrayList<Moneda> monedas;
    public DepositoM() {
        monedas = new ArrayList<Moneda>();
    }
    public void addMoneda(Moneda m) {
        monedas.add(m);
    }
    public Moneda getMoneda() {
        if (!monedas.isEmpty()) {
            return monedas.removeFirst();
        }
        else{
            return null;
        }
    }
}