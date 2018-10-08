
package aula13;

//TRATAMENTO DE EXCESSÕES;

import java.util.Scanner;


public class Aula13 {
    
    Scanner novo = new Scanner(System.in);
    
    public void erro(int valor){
        try{
            if((int)valor == valor){
                System.out.println(valor);
            }
        }
        catch(NumberFormatException e){
               // System.out.println();
               int a;
               System.out.println("Numero inválido digite novamente: ");
               a = novo.nextInt();
               erro(a);
         }
            
        
    }
    public static void main(String[] args) {
      /*      
        System.out.println("Divisao: ");
        float res = Calculadora.divide(8, 0);
        System.out.println("Resultado: " + res);
        
        
        Calculadora.vetor(0);
        
*/
    }
}
    
    
 
