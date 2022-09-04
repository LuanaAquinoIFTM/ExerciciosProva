package E03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Idade i = new Idade();

        System.out.println("Informe o nome e idade de duas pessoas");
        System.out.println( "e calcularei a media da idade delas\n");
        System.out.println("Informe o primeiro nome: ");
        i.setNome1(sc.nextLine());
        System.out.println("Informe sua respectiva idade: ");
        i.setIdade1(sc.nextInt());
        System.out.println("Informe o segundo nome: ");
        i.setNome2(sc.next());
        System.out.println("Informe sua respectiva idade: ");
        i.setIdade2(sc.nextInt());
        System.out.println("\n");
        double m;
        m = i.media();
        System.out.println("-Dados da primeira pessoa-");
        System.out.println("Nome: " + i.getNome1());
        System.out.println("Idade: " + i.getIdade1());
        System.out.println("\n-Dados da segunda pessoa-");
        System.out.println("Nome: " + i.getNome2());
        System.out.println("Idade: " + i.getIdade2());
        System.out.printf("\n A idade média de " + i.getNome1() + " e de " + i.getNome2() + " é de " + m + "anos.");

        sc.close();
    }
}
