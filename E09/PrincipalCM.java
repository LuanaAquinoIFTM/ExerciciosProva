package E09;

import java.util.Locale;
import java.util.Scanner;

public class PrincipalCM {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ConversorMoeda c = new ConversorMoeda();

        System.out.println("Qual o valor do dólar? ");
        c.setCotacaoD(sc.nextDouble());
        System.out.println("Quantos dólares serão comprados? ");
        c.setDolar(sc.nextDouble());

        System.out.printf("Funcionário: Valor a ser pago em reais = %.2f", ConversorMoeda.pagar(c.getCotacaoD(), c.getDolar()));

        sc.close();
    }
}
