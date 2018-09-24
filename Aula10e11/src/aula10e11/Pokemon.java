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
@SuppressWarnings("EqualsAndHashcode")
public abstract class Pokemon {
    String nome;
    int nivel;
    int hp;
    int atk;
    int defesa;
    
    
   // public abstract boolean equals(Pokemon obj);
    
    public abstract void EmitirSom();
    
    public String toString(){
        return  this.nome;
    }
    
    public boolean equals(Pokemon a){
        return this.nome.equals(a.nome);
    }    
    
    
 
 
 
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public Pokemon() {
    }
    
}
