package E10.subclasse;

import E10.superclasse.Animal;

public class Cachorro extends Animal {

    public Cachorro(){}
    
    public String late(){
        return "AuAu!!";
    }

    public String nome(String nome){
        return nome;
    }

}
