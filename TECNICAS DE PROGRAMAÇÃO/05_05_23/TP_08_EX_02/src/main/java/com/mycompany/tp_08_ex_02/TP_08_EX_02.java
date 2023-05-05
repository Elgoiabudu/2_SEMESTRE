/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_08_ex_02;

import java.awt.FlowLayout;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author labs
 */
public class TP_08_EX_02 {
    
    private JFrame janela;
    private JPanel painelPrincipal;
    private Label visor;

    public static void main(String[] args) {
        new TP_08_EX_02().montaTela();
    }
    
    private void montaTela(){
        preparaJanela();
        mostraJanela();
        preparaPainelPrincipal();
        btn1();
        //preparaLabel();
        //preparaBotoes();
    }
    
    private void preparaJanela(){
        janela = new JFrame("Teclado Celular");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostraJanela(){
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }
    
    private void preparaPainelPrincipal(){
        painelPrincipal = new JPanel();
        FlowLayout f = (FlowLayout) painelPrincipal.getLayout();
        janela.add(painelPrincipal);
    }
    
    private void btn1(){
        JButton btn = new JButton("1");
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
}
