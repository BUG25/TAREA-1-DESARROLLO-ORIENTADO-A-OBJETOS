public class Tripla<moneda, ordenProducto, referenciaMáquina>{
    // Atributos
    private moneda moneda;
    private ordenProducto ordenProducto;
    private referenciaMáquina referenciaMáquina;

    // Constructor
    public Tripla(moneda moneda, ordenProducto ordenProducto, referenciaMáquina referenciaMáquina){
        this.moneda = moneda;
        this.ordenProducto = ordenProducto;
        this.referenciaMáquina = referenciaMáquina;
    }
}

public class Comprador{
    // Atributos
    private Tripla tripla;
    private string saborConsumo;

    // Constructor
    public Comprador(Tripla tripla, string saborConsumo){
        this.saborConsumo = saborConsumo;
        this.tripla = new Tripla(moneda, ordenProducto, referenciaMáquina);
    }
    
}