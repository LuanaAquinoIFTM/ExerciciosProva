package E06;

import java.util.Scanner;

public class Senha {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a senha: ");
        int senha = sc.nextInt();
        boolean i = true;

        do {
            if( senha != 2002){
                System.out.println("Senha inválida! Tente novamente: ");
                senha = sc.nextInt();
                
            }else{
                System.out.println("Acesso permitido!");
                break;
            }
        } while (i);  
        
        sc.close();
    }
}
