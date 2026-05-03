package src.Excepciones;
/**
* excepcion que se activa si el pago (moneda) es incorrecta m = null
*/

public class PagoIncorrectoException extends Exception {
  public PagoIncorrectoException(String mensaje) {
      /** constructor para definir el mensaje de error
  * @param mensaje que describe el error
  * @throws cuando se instancia PagoIncorrectoException
  */
    super(mensaje);
  }
}
