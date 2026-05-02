package src;
public class Tripla<moneda, ordenProducto, referenciaMaquina>{
    // Atributos
    private moneda moneda;
    private ordenProducto ordenProducto;
    private referenciaMaquina referenciaMaquina;

    // Constructor
    public Tripla(moneda moneda, ordenProducto ordenProducto, referenciaMaquina referenciaMaquina){
        this.moneda = moneda;
        this.ordenProducto = ordenProducto;
        this.referenciaMaquina = referenciaMaquina;
    }
}