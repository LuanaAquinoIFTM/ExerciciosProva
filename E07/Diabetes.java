package E07;

import java.util.Locale;
import java.util.Scanner;

public class Diabetes {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a medida de glicose: ");
        double medida = sc.nextDouble();

        if(medida <= 100){
            System.out.println("Classificação: Normal");
        }if(medida > 100 && medida <= 140){
            System.out.println("Classificação: Elevado");
        }if(medida > 140){
            System.out.println("Classificação: Diabetes");
        }

        sc.close();
    }
    
}
