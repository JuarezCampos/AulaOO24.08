/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10e11;

import java.util.Objects;

/**
 *
 * @author ice
 */
public class Eletrico extends Pokemon {
    String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public Eletrico() {
    }
    
    @Override
    public void EmitirSom() {
        System.out.println("Raio");
    }


    @Override
    public boolean equals(Pokemon obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Eletrico(String nome) {
        this.nome = nome;
    }
    
    
   

    
}
