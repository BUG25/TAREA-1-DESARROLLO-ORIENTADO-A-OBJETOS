package src;
public class Comprador{
    // Atributos
    private Tripla tripla;
    private String saborConsumo;

    // Constructor
    public Comprador(Tripla tripla, String saborConsumo){
        this.saborConsumo = saborConsumo;
        this.tripla = new Tripla(moneda, ordenProducto, referenciaMaquina);
    }
    
}