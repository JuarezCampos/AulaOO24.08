/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg10;

/**
 *
 * @author ice
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal gato = new Animal();
        gato.comer();
        gato.dormir();
        gato.emitirSom();
        
        Cachorro dog = new Cachorro();
        dog.comer();
        dog.dormir();
        dog.emitirSom();
    }
    
}
