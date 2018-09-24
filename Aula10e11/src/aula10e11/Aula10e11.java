/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10e11;
import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Aula10e11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ArrayList <Pokemon> pokemons = new ArrayList();
       Eletrico Elk = new Eletrico();
       Elk.nome = "Jhow";
       Eletrico Elk2 = new Eletrico();
       Elk2.nome = "Jhow";
     /* Pikachu.atk = 10;
       Pikachu.defesa = 10;
       Pikachu.hp = 1000;
       Pikachu.nivel = 10;
       Pikachu.nome = "Jhow"; */
       pokemons.add(new Eletrico());
       pokemons.add(new Metal());
       pokemons.add(new Eletrico());
       

        for(int i=0; i<pokemons.size();i++){
            pokemons.get(i).EmitirSom();
            System.out.println(pokemons.get(i).toString());
        }
        System.out.println(Elk.equals(Elk2));
    }
    
}
