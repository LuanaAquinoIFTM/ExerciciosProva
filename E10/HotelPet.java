package E10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import E10.subclasse.Cachorro;
import E10.subclasse.Gato;
import E10.superclasse.Animal;

public class HotelPet {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        List<Animal> ListaA = new ArrayList<>();

        String nome = "";
        String raca = "";
        int opcao = 0;
        do {
            System.out.println("1 - check-in do pet");
            System.out.println("2 - check-out do pet");
            System.out.println("0 - sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do seu pet: ");
                    nome = sc.next(); 

                    System.out.println("Seu pet é um cachorro ou gato? ");
                    raca = sc.next();
                    
                    if(  nome == "cachorro"){
                        Cachorro c = new Cachorro();
                        System.out.println(c.late());
                        ListaA.add(c);

                    }if(raca == "gato"){
                        Gato c = new Gato();
                        System.out.println(c.mia());
                        ListaA.add(c);
                    }
                    break;
                case 2:
                System.out.println("Informe o nome do seu pet: ");
                nome = sc.next();
                
                boolean encontrado = true;
                
                     
                    if(encontrado){
                        System.out.println("Animal encontrado");
                        for (Animal a : ListaA) {
                        System.out.printf("\nAté mais," + nome + " volte sempre!");
                        ListaA.remove(a);
                                
                            }
                        
                    
                    }else{
                        System.out.println("Animal não encontrado!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        sc.close();
    }
}