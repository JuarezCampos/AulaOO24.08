/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg16.objetos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ice
 */
public class InterfaceGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame janela = new JFrame("Projeto OO");
        janela.setSize(400, 400);
        JLabel resposta = new JLabel ("Teste OO Ok OK");
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        janela.getContentPane().add(painel);
                
        //padrão normal é FlowLayout sempre coloca os componetes 1 ao lado do outro.
        //como que funciona o listener que ouve e qual evento programar...
        //ouvinte do botao ACtionListener
        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botao 4");
        JButton botao5 = new JButton("Botao 5");
        botao1.setSize(30, 10);
        botao2.setSize(30, 10);
        botao3.setSize(30, 10);
        botao4.setSize(30, 10);
        botao5.setSize(30, 10);
        botao1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Object  [] opcoes = {"Não", "Sim"};
            JOptionPane.showOptionDialog(janela, "teste funcionando corretamente", "Infomação", 
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[2]);
           
        }
        });
        
        
        painel.add(botao1, BorderLayout.NORTH);
        painel.add(botao2, BorderLayout.EAST);
        painel.add(botao3, BorderLayout.SOUTH);
        painel.add(botao4, BorderLayout.WEST);
        painel.add(botao5, BorderLayout.CENTER);
        
       // janela.pack(); //Ajusta mediante o uso dos cont
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public InterfaceGrafica() {
    }
    
}
