package src.Monedas;

public abstract class Moneda implements Comparable<Moneda> {  //se implementa comparable, así permitimos orednamiento según valor
    private int valor;
    public Moneda(int valor){
        this.valor = valor;
    }

    public int getValor() { return valor; }
    @Override
    public int compareTo(Moneda otra){ return Integer.compare(this.valor, otra.valor);}

    @Override
    public String toString(){
        return "Valor moneda =" + valor + ", n°Serie=" + this.hashCode();
    }
}
