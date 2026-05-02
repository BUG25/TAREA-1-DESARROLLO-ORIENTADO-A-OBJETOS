package src.Excepciones;
/**
* excepcion que se activa si no queda producto en el deposito
*/

public class NoHayProductoException extends Exception {
  /** constructor para definir el mensaje de error
  * @param mensaje que describe el error
  * @throws cuando se instancia NoHayProductoException
  */
  public NoHayProductoException(String mensaje) {
    super(mensaje);
  }
}
