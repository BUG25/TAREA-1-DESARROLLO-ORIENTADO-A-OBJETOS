import java.util.ArrayList;
public class DepositoD {
    private ArrayList<Dulce> dulces;
    public DepositoD(){
        dulces = new ArrayList<Dulce>();
    }
    public void addDulce(Dulce ducles) {
        dulces.add(ducles);
    }

    public Dulce getdulces() {
        if (!dulces.isEmpty()) {
            return dulces.removeFirst();
        }
        return null;
    }
}
