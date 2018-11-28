/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import pokemons.Agua;
import pokemons.Fogo;
import pokemons.Terra;
import pokemons.Voador;
import pokemons.Normal;
import pokemons.Pokedex;

/**
 *
 * @author Juarez
 */

public class Controla {
/*   
    Pokedex Poke = new Pokedex();
   public void salvarPokes(String jTextAlturaPoke, String jTextEvolucao, String jTextDescPoke, String jTextHabilPoke, String jTextNomePoke, String jTextPesoPoke, String jTextSexoPoke, String jBoxFraqPoke, String jBoxTipoPoke, String jBoxVantaPoke){
                        
                       if("Fogo".equals(jBoxTipoPoke)){
                        Fogo fg = new Fogo();
                            //Setando o nome do pokemon
                            fg.setNome(jTextNomePoke.toString());
                            fg.setSexo(jTextSexoPoke.toString());
                            fg.setHabilidade(jTextHabilPoke.toString());
                            fg.setFraqueza(jBoxFraqPoke.toString());
                            fg.setVantagem(jBoxVantaPoke.toString());
                            fg.setDescricao(jTextDescPoke.toString());
                            fg.setAltura(jTextAlturaPoke);
                            fg.setPeso(jTextPesoPoke);
                            fg.setEvolucao(jTextEvolucao);                            
                           // pokedex.setObjetoPokemon(fg);
                        }
                        else if ("Agua".equals(jBoxTipoPoke)){
                             Agua ag = new Agua();
                            //Setando o nome do pokemon
                            ag.setNome(jTextNomePoke);
                            ag.setSexo(jTextSexoPoke);
                            ag.setHabilidade(jTextHabilPoke);
                            ag.setFraqueza(jBoxFraqPoke);
                            ag.setVantagem(jBoxVantaPoke);
                            ag.setDescricao(jTextDescPoke);
                            ag.setAltura(jTextAlturaPoke);
                            ag.setPeso(jTextPesoPoke);
                            ag.setEvolucao(jTextEvolucao);                            
                           // pokedex.setObjetoPokemon(ag);
                           }
                        else if ("Normal".equals(jBoxTipoPoke)){
                             Normal nm = new Normal();
                            //Setando o nome do pokemon
                            nm.setNome(jTextNomePoke);
                            nm.setSexo(jTextSexoPoke);
                            nm.setHabilidade(jTextHabilPoke);
                            nm.setFraqueza(jBoxFraqPoke);
                            nm.setVantagem(jBoxVantaPoke);
                            nm.setDescricao(jTextDescPoke);
                            nm.setAltura(jTextAlturaPoke);
                            nm.setPeso(jTextPesoPoke);
                            nm.setEvolucao(jTextEvolucao);                            
                           // pokedex.setObjetoPokemon(nm);
                           }
                        else if ("Terra".equals(jBoxTipoPoke)){
                             Terra tr = new Terra();
                            //Setando o nome do pokemon
                            tr.setNome(jTextNomePoke);
                            tr.setSexo(jTextSexoPoke);
                            tr.setHabilidade(jTextHabilPoke);
                            tr.setFraqueza(jBoxFraqPoke);
                            tr.setVantagem(jBoxVantaPoke);
                            tr.setDescricao(jTextDescPoke);
                            tr.setAltura(jTextAlturaPoke);
                            tr.setPeso(jTextPesoPoke);
                            tr.setEvolucao(jTextEvolucao);                            
                           // pokedex.setObjetoPokemon(tr);
                           }
                        else if ("Voador".equals(jBoxTipoPoke)){
                             Voador vd = new Voador();
                            //Setando o nome do pokemon
                            vd.setNome(jTextNomePoke);
                            vd.setSexo(jTextSexoPoke);
                            vd.setHabilidade(jTextHabilPoke);
                            vd.setFraqueza(jBoxFraqPoke);
                            vd.setVantagem(jBoxVantaPoke);
                            vd.setDescricao(jTextDescPoke);
                            vd.setAltura(jTextAlturaPoke);
                            vd.setPeso(jTextPesoPoke);
                            vd.setEvolucao(jTextEvolucao);                            
                           // pokedex.setObjetoPokemon(vd);
                           }
        }
   
     public void salvarGin(String jTextNomeGin, String jTextMestreGin, Boolean jBoxCadPoke, Integer jTextIdPoke){
     			 int auxInt;
                        if(jBoxCadPoke.equals(true)){
                        auxInt = 1; 
                        }
                        else{
                        auxInt = 0;
                        }
                        Ginasio ginAux = new Ginasio();
			ginAux.setNomeGinasio(jTextNomeGin);
                        ginAux.setMestreGinasio(jTextMestreGin);
                         if(auxInt == 1){
                           auxInt = idPokemon.nextInt(); //Dúvida
                            int sair = 0;
                            
                            while(sair != -1){
                                if(auxInt <= ginAux.getNumPokemon()){
                                    ginAux.setPokemons(ginAux.getObjetoPokemon(jTextIdPoke));
                                                                  
                                    auxInt = idPokemon.nextInt();
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }else{
                                    auxInt = idPokemon.nextInt();
                                    if(auxInt == -1){
                                        sair = auxInt;
                                    }
                                }
                            }
                        }
     }
*/


}