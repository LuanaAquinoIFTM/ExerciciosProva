package E03;

public class Idade {
    private String nome1;
    private String nome2;
    private int idade1;
    private int idade2;

    public Idade() {
    }

    public Idade(String nome1, String nome2, int idade1, int idade2) {
        this.nome1 = nome1;
        this.nome2 = nome2;
        this.idade1 = idade1;
        this.idade2 = idade2;
    }

    public double media(){
        double media = (idade1 + idade2)/2;
        return media;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public int getIdade1() {
        return idade1;
    }

    public void setIdade1(int idade1) {
        this.idade1 = idade1;
    }

    public int getIdade2() {
        return idade2;
    }

    public void setIdade2(int idade2) {
        this.idade2 = idade2;
    }

    
}
