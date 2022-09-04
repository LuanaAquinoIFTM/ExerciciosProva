package E01;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalP {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Pagamento p = new Pagamento();

        Double pagam;

        System.out.println("Informe o nome do funcionario: ");
        p.setNome(sc.nextLine());

        System.out.println("Informe o valor que o funcionario recebe por hora: ");
        p.setValor(sc.nextDouble());

        System.out.println("Informe a quantidade de horas que o funcionario trabalha:");
        p.setHoras(sc.nextInt());

        pagam = p.pag();

        System.out.println("Nome: " + p.getNome());
        System.out.println("Valor por hora:" + p.getValor());
        System.out.println("Horas trabalhadas: " + p.getHoras());
        System.out.println("O pagamento para " + p.getNome() +" deve ser: " + pagam);

        sc.close();

    }
}
