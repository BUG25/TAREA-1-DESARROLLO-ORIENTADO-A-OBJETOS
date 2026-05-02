pubic enum Seleccion {
  // definimos los precios respectivos a los precios
COCA_COLA (1000, 101, "CocaCola"), //precios cambiables
SPRITE (900, 102, "Sprite"),
FANTA (900, 201, "Fanta"),
SNICKERS (600, 202, "Snickers"),
SUPER8 (300, 203,"Super8");

private final int precio;
private final int ID;
private String nombre;
Seleccion (int precio, int ID, String nombre) {
  this.precio = precio; // el cosntructor de la enumeración asigna los precios
  this.ID = ID;
  this.nombre = nombre;
}

public int getPrecio() {
  return precio;
  }
public int getID() {
  return ID;
}
public String getNombre() {
    return nombre;
  }
}
