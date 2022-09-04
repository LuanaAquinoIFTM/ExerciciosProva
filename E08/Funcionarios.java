package E08;

public class Funcionarios {

    private String nome; 
    private double salarioBruto;
    private double imposto;
    private double porcentagem;

    public Funcionarios() {
    }

    public Funcionarios(String nome, double salarioBruto, double imposto, double porcentagem) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
        this.porcentagem = porcentagem;
    }

    public double salarioLiquido(){
        double salarioLiquido = salarioBruto - imposto;
        return salarioLiquido;
    }

    public double aumentarSalario(){
        double aumentarSalario = ((salarioBruto * porcentagem)/100) + salarioLiquido();
        return aumentarSalario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    
    
}
