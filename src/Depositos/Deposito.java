package src.Depositos;

import java.util.ArrayList;
public class Deposito<T> {
  private ArrayList<T> lista;
  public Deposito() {
    this.lista = new ArrayList<T>();
  }
  public void add (T item) { //agregamos un producto o moneda al deposito 
    this.lista.add(item);
  }
  public T get() { // sacamos el primer elemento
    if(lista.isEmpty()){
      return null;
    }
    return lista.remove(0);
  }
}
