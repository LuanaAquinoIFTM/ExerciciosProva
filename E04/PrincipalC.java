package E04;

import java.util.Scanner;

public class PrincipalC {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Crescente c = new Crescente();

        boolean i = true;
        do {
            System.out.println("Informe um número: ");
            c.setX(sc.nextInt());
            System.out.println("Informe um outro número: ");
            c.setY(sc.nextInt());
    
            if( c.getX() > c.getY()){
                System.out.println("Decrescente!");
                
            }if(c.getX() < c.getY()){
                System.out.println("Crescente!");
                
            }if(c.getX() == c.getY()){
                System.out.println("Números iguais!");
                break;
            }
            
        } while (i);
        
        sc.close();
        
    }
}
