/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

import java.util.Scanner;

/**
 *
 * @author ice
 */
public class Calculadora {
   Scanner novo = new Scanner(System.in);
    public static float divide(int a, int b){
        float x =0;
        try{
        x = a/b;
        }catch(ArithmeticException e){
            System.out.println("Erro, " +e.getMessage());
            
        }
        return x;    
    }
    
    
    public static void vetor(int valor){
        int val [];
        val = new int [2];
        for(int i=0; i<3; i++){
        try{
        
            val[i]+= i*2;
            System.out.println(i);
            System.out.println("Tentativa: ");
            int x = val[i]/valor;
            //System.out.println("val:" + x);
       }
       catch(Exception e){
           System.out.println(e.toString());
       }
       finally{
        
       } 
    }
       // for(int i=0 ; i < val.length; i++){
       // divide(val[i],0); 
       // }
    }
    
    //uncheckedexceptions
    
    public static void erro(String valor){
        try{
            int valorInt;
            valorInt  = Integer.parseInt(valor);
            
        }catch(NumberFormatException e){
           Scanner teste = new Scanner(System.in); 
           erro(teste.next());
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teste1 = new Scanner(System.in);
        erro(teste1.next());
        //erro(teste1.next());
}
}
