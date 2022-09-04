package E02;

public class Troco {
    
    private double preco;
    private int quant_comprada;
    private double din_recebido;

    public Troco(double preço, int quant_comprada, double din_recebido) {
        this.preco = preço;
        this.quant_comprada = quant_comprada;
        this.din_recebido = din_recebido;
    }

    public Troco() {
    }

    public double t(){
        double t = din_recebido - (quant_comprada*preco);
        return t;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuant_comprada() {
        return quant_comprada;
    }

    public void setQuant_comprada(int quant_comprada) {
        this.quant_comprada = quant_comprada;
    }

    public double getDin_recebido() {
        return din_recebido;
    }

    public void setDin_recebido(double din_recebido) {
        this.din_recebido = din_recebido;
    }

    
}
