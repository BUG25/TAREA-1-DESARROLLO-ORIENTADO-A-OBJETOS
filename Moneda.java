public abstract class Moneda {
    private int valor;
    public Moneda(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public String toString(){
        return "Valor moneda =" + valor + ", n°Serie=" + this.hashCode();
    }
}
