/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_08_ex_01;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author labs
 */
public class TP_08_EX_01 {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1, lblr, lbl3;
    private TextField t1, t2, t3;
    
    public static void main(String[] args) {
        new TP_08_EX_01().montaTela();
    } 
    
    
    private void montaTela(){
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();        
        preparaBotaoSair();
        mostraJanela();
    }
    
    private void preparaJanela(){
        janela = new JFrame("Exemplo");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostraJanela(){
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }
    
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        //painelPrincipal.setLayout(new BoxLayout(painelPrincipal,BoxLayout.PAGE_AXIS));
        FlowLayout f = (FlowLayout)painelPrincipal.getLayout();
        janela.add(painelPrincipal);
        // layout em forma de tabela com 3 linhas e 2 colunas;  
        //painelPrincipal.setLayout(new GridLayout(3,2));
    }
    
    private void preparaLabel(){
        label1 = new Label("Calculando a Soma de 2 números"); 
        painelPrincipal.add(label1);  
    }
    
    private void preparaText(){
        t1 = new TextField(""); 
        t2= new TextField("");
        lblr = new Label("Resultado=");
        lbl3 = new Label(" ");
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(lbl3);
    }
    
    
    private void preparaBotaoCarregar() {
        JButton botaoCarregar = new JButton("SOMA");
        botaoCarregar.addActionListener(new ActionListener() {
        @Override
    
        public void actionPerformed(ActionEvent e) {
        int soma=Integer.parseInt(t1.getText())+ Integer.parseInt(t2.getText());
        String r = Integer.toString(soma);      
        lbl3.setText(r);
	}});
        painelPrincipal.setLocation(50,100);//posição do painel no frame 
        painelPrincipal.add(botaoCarregar);//adiciona botão ao painel
        } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método actionPerformed
        
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        System.exit(0);
        }});
        painelPrincipal.add(botaoSair);//adiciona botão Sair ao painel
    
    }
       
    
}
