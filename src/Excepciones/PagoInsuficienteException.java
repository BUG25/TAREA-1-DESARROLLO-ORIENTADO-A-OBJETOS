package src.Excepciones;
/**
* excepcion se activa cuando el pago es insufieciente m < al valor del producto seleccionado
*/

public class PagoInsuficienteException extends Exception {
    /** constructor para definir el mensaje de error
  * @param mensaje que describe el error
  * @throws cuando se instancia PagoInsuficienteException
  */
  public PagoInsuficienteException(String mensaje) {
    super(mensaje);
  }
}
