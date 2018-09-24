/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10e11;

/**
 *
 * @author ice
 */
public class Metal extends Pokemon{
    String nome;

    Metal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void EmitirSom() {
        System.out.println("grrrrrrrrrhs");
    }

    @Override
    public boolean equals(Object obj) {
    return this == obj;   
    }

    public Metal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Pokemon obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
