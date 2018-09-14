package aula.pkg10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juarez
 */

//Classe pai ou superclasse, felino, canino, lobo, leão, vaca (draw.io tem q desenhar)

public class Animal {
    int idade;
    String raca;
    String nome;

    public Animal() {
    }

     public void comer(){
       System.out.println("Estou comendo");
   }
   
   public void dormir(){
       System.out.println("Estou dormindo");
   }
   
   public void  emitirSom(){
       System.out.println("Emitindo o som");
   }
    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
   
}
