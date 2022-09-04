package E01;

public class Pagamento {

    private String nome;
    private double valor;
    private int horas;
   

    public Pagamento() {
    }

    public Pagamento(String nome, double valor, int horas) {
        this.nome = nome;
        this.valor = valor;
        this.horas = horas;
    }

    public double pag(){
        double pag = valor*horas;
        return pag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    


}
