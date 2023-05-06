/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tp_08_ex_02;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author labs
 */
public class TP_08_EX_02 {

    private JFrame janela;
    private JPanel painelPrincipal, painelLimpar;
    private TextField visor;

    public static void main(String[] args) {
        new TP_08_EX_02().montaTela();
    }

    private void montaTela() {
        preparaJanela();
        mostraJanela();
        preparaPainelPrincipal();
        //preparaPainelLimpar();
        //preparaVisor();
        //btn1();
        //btn2();
        //preparaLabel();
        //preparaBotoes();
    }

    private void preparaJanela() {
        janela = new JFrame("Teclado Celular");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void mostraJanela() {
        janela.pack();
        janela.setSize(600, 300);
        janela.setVisible(true);
    }

    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();        
        painelPrincipal.setLayout(new GridLayout(4,3));        
        //FlowLayout f = (FlowLayout) painelPrincipal.getLayout();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        btn1();
        janela.add(painelPrincipal);   
        
    }
    
    private void preparaPainelLimpar() {
        painelLimpar = new JPanel();        
        //painelLimpar.setLayout(new GridLayout(1,1));    
        
        painelLimpar.setLayout(new BoxLayout(painelLimpar,BoxLayout.PAGE_AXIS));
        //FlowLayout f = (FlowLayout) painelPrincipal.getLayout();
        btn1();
        janela.add(painelLimpar);
    }

    private void preparaVisor() {
        visor = new TextField("");
        painelPrincipal.add(visor);
    }

    private void btn1() {
        JButton btn = new JButton("1");
        adicionar(btn);        
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
    
    private void btn2() {
        JButton btn = new JButton("2");
        adicionar(btn);       
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
    
    private void btn3() {
        JButton btn = new JButton("1");
        adicionar(btn);
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
    
    private void btn4() {
        JButton btn = new JButton("1");
        adicionar(btn);
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(btn);//adiciona botão ao painel
    }
    
    private void btn5() {
        JButton btn = new JButton("1");
        adicionar(btn);
        painelPrincipal.setLocation(50, 100);//posição do painel no frame 
        painelPrincipal.add(btn);//adiciona botão ao painel
    }

    private void adicionar(JButton btn) {
        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                visor.setText(visor.getText() + btn.getText());
            }
        });

    }

    
}
