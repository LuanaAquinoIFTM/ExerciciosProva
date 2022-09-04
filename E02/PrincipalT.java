package E02;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalT {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Troco t = new Troco();
        double total;

        System.out.println("Informe o valor unitário do produto: ");
        t.setPreco(sc.nextDouble());

        System.out.println("Informe a quantidade de unidades compradas deste produto: ");
        t.setQuant_comprada(sc.nextInt());

        System.out.println("O valor em dinheiro dado pelo cliente");
        t.setDin_recebido(sc.nextDouble());
        
        total = t.t();
        System.out.println("Preço unitário do produto: " + t.getPreco());
        System.out.println("Quantidade comprada: " + t.getQuant_comprada());
        System.out.println("Dinheiro recebido: " + t.getDin_recebido());
        System.out.println("TROCO: " + total);

        sc.close();
    }
}
