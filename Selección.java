pubic enum Seleccion {
  // definimos los precios respectivos a los precios
COCA_COLA (1000), //precios cambiables
SPRITE (900),
FANTA (900),
SNICKERS (600),
SUPER8 (300);

private final int precio;
Seleccion (int precio) {
  this.precio = precio; // el cosntructor de la enumeración asigna los precios
}

public int getPrecio() {
  return precio;
  }
}
