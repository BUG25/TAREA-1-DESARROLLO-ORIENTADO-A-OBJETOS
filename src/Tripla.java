package src;
public class Tripla<M,O,R>{
    // Atributos
    private M moneda;
    private O ordenProducto;
    private R referenciaMaquina;

    // Constructor
    public Tripla(M moneda, O ordenProducto, R referenciaMaquina){
        this.moneda = moneda;
        this.ordenProducto = ordenProducto;
        this.referenciaMaquina = referenciaMaquina;
    }

    public M getMoneda(){ return moneda; }
    public O getOrdenProducto(){ return ordenProducto; }
    public R getReferenciaMaquina(){ return referenciaMaquina; }
}