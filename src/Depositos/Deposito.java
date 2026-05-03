package src.Depositos;
/** clase generica de un deposito par aalmacenar productos o monedas tipo T.
* @param <T> el tipo (bebida, dulce o moneda) que se almacenara en el deposito
*/

import java.util.ArrayList;
public class Deposito<T> {
  private ArrayList<T> lista;
  /**
  *contructor de deposito class
  * se instancia como una lista interna como un arraylist vacia
  */
  public Deposito() {
    this.lista = new ArrayList<T>();
  }
  public void add (T item) {
    /** agregamos un producto o moneda al deposito 
    * @param iten del producto o moneda que vamos a agregar al deposito
    */
    this.lista.add(item);
  }
  public T get() {
    /** sacamos y devuelve el primer elemento del deposito
    * @param el primer objeto de la lista o null si no hay producto
    */
    if(lista.isEmpty()){
      return null;
    }
    return lista.remove(0);
  }
}
