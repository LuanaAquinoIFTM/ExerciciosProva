package E08;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalF {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionarios f = new Funcionarios();
        
        System.out.println("Informe seu nome: ");
        f.setNome(sc.nextLine());
        System.out.println("Informe o salário bruto: ");
        f.setSalarioBruto(sc.nextDouble());
        System.out.println("Informe o imposto: ");
        f.setImposto(sc.nextDouble());

        System.out.println("\nFuncionário: " + f.getNome() + ". Salário líquido: " + f.salarioLiquido() + "\n");

        System.out.println("Qual a porcentagem para aumentar o salario? ");
        f.setPorcentagem(sc.nextDouble());
        
        System.out.println("\n-Dados atualizados-");
        System.out.println("Nome: " + f.getNome() + ". Salário: " + f.aumentarSalario());

        sc.close();
    }
}
