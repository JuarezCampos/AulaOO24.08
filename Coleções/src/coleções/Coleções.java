/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleções;

//sort metodo de ordenação//

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


/**
 *
 * @author ice
 */
public class Coleções {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List  lista = new ArrayList();
        
        //Set serve para prevenir de repetir metodos que ja foram chamados/executados tem que implementar o equals para comparar
        //Set tem desempenho mais rápido para busca e não admite elementos duplicados...
        //List mais rápido para add e rem e para ordenar a busca..
        //HashMap busca eficiente (ideia conjunto de chaves "ligando" aos valores 
        
        
        Set  sets = new TreeSet();
        Map <String, Integer>  maps = new HashMap();
        sets.add("Agua");
        sets.add("Fogo");
        sets.add("Terra");
        sets.add("Ar");
        
        maps.put("Agua", 1);
        maps.put("Fogo", 2);
        maps.put("Terra", 3);
        maps.put("Ar", 4);
        
        System.out.println(maps.get("Agua")); 
        
        System.out.println(maps);
        
        //return this.nome.compareTo(o.getNome());
        //Collections.sort(lista);
        // COMPAREBLE É BOM QUANDO É 1 SÓ;
        //SORT É ORDENAVEL QUANDO TEM METODOS COMPARÁVEIS..;
     
        /*GETOBEJTOPOKEMONLISTA
            //    Collections.sort(arrayPokemon); ///Ordenando baseado na lista de nome ERRO;
            
        ///pookemons
        public class Pokemon extends Pokedex implements Comparable<Pokemon>{
        
        
         @Override
    public String toString() {
        return "Pokemon{" + "nomePokemon=" + nomePokemon + '}';
    }

        
    @Override
    public int compareTo(Pokemon o) {
        return this.nomePokemon.compareTo(o.getNomePokemon());
    }
     
      /*Collections.sort(arrayPokemon, new Comparator<Pokemon>() {
                @Override
                public int compare(Pokemon o1, Pokemon o2) {
                    return o1.getNomePokemon().compareTo(o2.getNomePokemon());
                }
            }); 
        
        */
        
        
        
        
    }
    
}
