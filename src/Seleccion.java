package src;

public enum Seleccion {
  /** definimos los precios respectivos a los precios
  * cambiados los nombres para no mostrar classpath completo
  */
COCA_COLA (1000, 101, "CocaCola"), /** precios cambiables */
SPRITE (900, 102, "Sprite"),
FANTA (900, 201, "Fanta"),
SNICKERS (600, 202, "Snickers"),
SUPER8 (300, 203,"Super 8");

private final int precio; /** precio del prodcuto */
private final int ID; /** identificador unico del producto */
private final String nombre; /** nombre del producto */
Seleccion (int precio, int ID, String nombre) {
  /**
  * el cosntructor de la enumeración asigna los precios
  * @param precio del producto
  * @param nombre descriptivo
  */
  this.precio = precio; 
  this.ID = ID;
  this.nombre = nombre;
}

public int getPrecio() {
  /**
  * se ontiene el precio del producto seleccionado
  * @return valor int del precio
  */
  return precio;
  }
public int getID() {
  /**
  * se obtiene el id del producto seleccionado
  * @return el id del producto
  */
  return ID;
}
public String getNombre() {
  /**
  * obtiene el nombre del producto seleccionado
  * @return un string con el nombre
  */
    return nombre;
  }
}
