package src;
import src.Depositos.Deposito;
import src.Excepciones.*; // * es para traer todas las clases publicas dentro de la carpeta (PagoInsufiente, NoHayProducto, PagoIncorrecto)
import src.Monedas.*; // * impotarar Moneda100, Moneda1000 y Moneda500
import src.Productos.*; // todos los productos
import src.Productos.Bebidas.*; // COCA_COLA, SPRITE,FANTA
import src.Productos.Dulces.*; //SUPER8 Y SNICKERS

public class Maquina {
    // depositos para cada  producto
    private Deposito<Bebida> cocacola;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;

// deposito gen para las monedad del vuelto
private Deposito<Moneda> monVuelto;
    // crear depositos para cada producto y el vuelto
    public Maquina (int cantidad) {
    this.cocacola = new Deposito <> ();
    this.sprite = new Deposito <> ();
    this.fanta = new Deposito <> ();
    this.snickers = new Deposito <> ();
    this.super8 = new Deposito <> ();
    this.monVuelto = new Deposito <> ();

    // rellenamos depositos con la cantidad
    for (int i = 0; i < cantidad; i++) {
    cocacola.add(new CocaCola(101, "Coca Cola", Seleccion.COCA_COLA.getPrecio()));
    sprite.add(new Sprite(102, "Sprite", Seleccion.SPRITE.getPrecio()));
    fanta.add(new Fanta(201, "Fanta", Seleccion.FANTA.getPrecio()));
    snickers.add(new Snickers(202, "Snickers", Seleccion.SNICKERS.getPrecio()));
    super8.add(new Super8(203, "Super 8", Seleccion.SUPER8.getPrecio()));
    }
}
public Producto comprarProducto(Moneda m, Seleccion p)
        throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException {

    // exception 1 veemos si es valido el pago con PgoIncorrectoException
    if (m == null) {
        throw new PagoIncorrectoException("No se ha ingresado una moneda.");
    }
     // exception 2 verificamos que el dinero alcance para comprar con PagoInsuficienteException
    if (m.getValor() < p.getPrecio()) {
        monVuelto.add(m); // devuelve la moneda al deposito de vuelto
        throw new PagoInsuficienteException("Dinero insuficiente para " + p.getNombre()); 
    }
    // antes de hacer exception 3, hay que ver si queda del producto, viendo los depositos correspondiente
    Producto prod = null;
    switch (p) {
        case COCA_COLA:
            prod = coca.get();
            break;
        case SPRITE:
            prod = sprite.get();
            break;
        case FANTA:
            prod = fanta.get();
            break;
        case SNICKERS:
            prod = snickers.get();
            break;
        case SUPER8:
            prod = super8.get();
            break;
    }
    // exception 3, si no quedan del producto, ocupamos NoHayProductoException
    if (prod == null) {
        monVuelto.add(m); // se devuelve la moneda
        throw new NoHayProductoException("No queda stock de " + p.getNombre());
    }
    // vuelto
    
    
  
